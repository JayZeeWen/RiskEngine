package com.risk.engine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import com.engine.dao.RiskModelMapper;
import com.engine.model.RiskModel;
import com.engine.model.RiskModelExample;
import com.risk.engine.entity.GItem;
import com.risk.engine.entity.Group;
import com.risk.engine.entity.Item;
import com.risk.engine.entity.Next;
import com.risk.engine.entity.RiskModelTemplate;

public class RiskEngineContainer {
	
	private static Logger logger = LoggerFactory.getLogger(RiskEngineContainer.class);
	
	/**
	 * 风控模型缓存
	 */
	private static Map<String, RiskModelTemplate> riskModelMap;
	
	private static ItemCompartor com ;
	
	public static void init(){
		riskModelMap = new HashMap<String, RiskModelTemplate>();
		com = new ItemCompartor();
		/**
		 * 加载风控模型
		 */
		initRiskModelConfig();
	}
	
	/**
	 * 初始化风控模型配置
	 */
	private static void initRiskModelConfig(){
		logger.info("===================开始初始化风控模型========================");
		List<RiskModel> list = getModels();
		
		if(!CollectionUtils.isEmpty(list)){
			for(RiskModel model : list){
				RiskModelTemplate riskModel = handleRiskModel(model);
				if(null != riskModel){
					riskModelMap.put(riskModel.getId(), riskModel);
				}
			}
		}else{
			logger.info("===================未找到激活的风控模型========================");
		}
		
		logger.info("===================风控模型初始化结束========================");
	}
	
	/**
	 * 解析模型配置
	 */
	private static RiskModelTemplate handleRiskModel(RiskModel model){
		RiskModelTemplate riskModel = null;
		Document doc = null;
		try {
			 doc = DocumentHelper.parseText(model.getConfig());
		} catch (DocumentException e) {
			logger.error("解析xml出错,id&desc=" +model.getId() + "&" + model.getModelDesc() + ">>>error:" + e.getMessage(), e );
		}
		
		if(null != doc){
			Element root = doc.getRootElement();
			String riskId = root.attributeValue("id");
			riskModel = new RiskModelTemplate();
			
			riskModel.setId(riskId);
			riskModel.setModelName(model.getModelDesc());
			//遍历orders
			if(root.element("orders") != null){
				List<Element> orders = root.element("orders").elements();
				List<Item> items = new ArrayList<Item>();
				
				riskModel.setOrders(items);			
				for(Element e : orders){
					Item i = new Item();
					i.setId(e.attributeValue("id"));
					i.setName(e.attributeValue("name"));
					i.setDesc(e.attributeValue("desc"));
					if(e.elementText("refuseBreak") != null){
						i.setRefuseBreak(Boolean.valueOf(e.attributeValue("refuseBreak")));
					}
					i.setRefuseReason(e.attributeValue("refuseReason"));
					i.setTag(e.attributeValue("tag"));//标签
					i.setOrder(Integer.valueOf(e.attributeValue("order")));
					i.setPoints(BigDecimal.valueOf(Float.valueOf(e.attributeValue("points"))));					
					i.setRefuse(Boolean.valueOf(e.attributeValue("refuse")));
					i.setExpression(e.elementText("exp"));
					
					i.setParamNames(Arrays.asList(e.elementText("params").split(",")));
					if(e.elementText("paramNames") != null ){
						i.setParamDescs(e.elementText("paramNames"));
					}
					items.add(i);
				}
				Collections.sort(items,com);
			}
			if(root.element("decisions") != null){
				//解析groups
				List<Element> egroups = root.element("decisions").elements();
				Map<String, Group> groupMap = new HashMap<String, Group>();
				riskModel.setDecisions(groupMap);
			
				for(Element eg : egroups){
					Group g = new Group();
					g.setGid(eg.attributeValue("gid"));
					g.setName(eg.attributeValue("name"));
					g.setDesc(eg.attributeValue("desc"));
					//g.setTogid(eg.attributeValue("togid"));
					g.setStart(Boolean.valueOf(eg.attributeValue("start")));
					g.setPoints(BigDecimal.valueOf(Float.valueOf(eg.attributeValue("points"))));
					
					groupMap.put(g.getGid(), g);
					List<GItem> itemList = new ArrayList<GItem>();
					g.setItems(itemList);
					
					//解析路径
					g.setNextList(parseNexts(eg.elements("next")));
					
					//解析group下 item
					for(Element ei : (List<Element>)eg.elements("item")){
						GItem i = new GItem();
						i.setId(ei.attributeValue("id"));
						i.setName(ei.attributeValue("name"));
						i.setDesc(ei.attributeValue("desc"));
//						i.setToid(ei.attributeValue("toid"));
						i.setPoints(BigDecimal.valueOf(Float.valueOf(ei.attributeValue("points"))));
						i.setTurecontinue(ei.attributeValue("truecontinue"));
						i.setFalsecontinue(ei.attributeValue("falsecontinue"));
						i.setParentfalsecontinue(ei.attributeValue("parentfalsecontinue"));
						i.setStart(Boolean.valueOf(ei.attributeValue("start")));
						i.setExpression(ei.elementText("exp"));
						i.setParamNames(Arrays.asList(ei.elementText("params").split(",")));
						
						//解析item路径
						i.setNextList(parseNexts(ei.elements("next")));
						
						itemList.add(i);
					}
				}
			}
		}
		
		return riskModel;
	}
	
	/**
	 * 解析路径节点
	 * @param es
	 * @return
	 */
	private static List<Next> parseNexts(List<Element> es){
		List<Next> nextList = new ArrayList<Next>();
		//next 节点元素
		for(Element e : es){
			Next next = Next.create();
			next.setId(e.attributeValue("id"));
			next.setExpression(e.elementText("exp"));
			next.setParamNames(Arrays.asList(e.elementText("params").split(",")));
			nextList.add(next);
		}
		
		return nextList;
	}
	
	/**
	 * 查询激活状态的风控模型
	 * @return
	 */
	private static List<RiskModel> getModels(){
		RiskModelMapper mapper = RiskEngineStartUp.get(RiskModelMapper.class);
		RiskModelExample ex = new RiskModelExample();
		ex.createCriteria().andActiveEqualTo("1");
		return mapper.selectByExampleWithBLOBs(ex);
	}
	
	/**
	 * 获取风控模型
	 * @param id
	 * @return RiskModel
	 */
	public static RiskModelTemplate getRiskModel(String id){
		return riskModelMap.get(id);
	}
	
	
	
	
/*	public static void main(String args[]){
		String params = "num";
		String[] paramarr = params.split(",");
		List<String> list = Arrays.asList(paramarr);
		System.out.println(paramarr.length);
		System.out.println(paramarr[0]);
		System.out.println(list.get(0));
	}
*/
}

class ItemCompartor implements Comparator<Item>{
	 @Override  
   public int compare(Item o1, Item o2) {  
       if(o1.getOrder() >= o2.getOrder()) {  
           return 1;  
       }  
       else {  
           return -1;  
       }  
   }  
}
