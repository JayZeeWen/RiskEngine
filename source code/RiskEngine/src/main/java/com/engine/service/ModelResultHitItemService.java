package com.engine.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engine.dao.ModelResultHitItemMapper;
import com.engine.model.ModelResultHitItem;
import com.engine.model.ModelResultHitItemExample;
import com.engine.model.ModelResultHitItemExt;
import com.engine.util.StringUtil;


@Service
public class ModelResultHitItemService {

	@Autowired
	private ModelResultHitItemMapper mapper ;
	
	public void insert(ModelResultHitItem entity){
		entity.setId(StringUtil.makeUUID());

		entity.setCreateDate(new Date());
		entity.setUpdateDate(new Date());
		mapper.insert(entity);
	}
	
	/**
	 * 根据模型结果 获取 命中的规则详情
	 * @param resultId
	 * @return
	 */
	public List<ModelResultHitItem> getHitItemByResultId(String resultId){
		ModelResultHitItemExample e = new ModelResultHitItemExample();
		e.createCriteria().andResultIdEqualTo(resultId);
		List<ModelResultHitItem> list = mapper.selectByExample(e);
		return list ;
	}
	
	/**
	 * 根据模型结果 获取 命中的规则详情
	 * @param resultId
	 * @return
	 */
	public List<ModelResultHitItemExt> getHitItemExtByResultId(String resultId){ 
		ModelResultHitItemExample e = new ModelResultHitItemExample();
		e.createCriteria().andResultIdEqualTo(resultId);
		List<ModelResultHitItem> list = mapper.selectByExample(e);
		List<ModelResultHitItemExt> extList = new ArrayList<ModelResultHitItemExt>();
		
		for (ModelResultHitItem hitItem : list) {
			String paraValue = "";
			ModelResultHitItemExt item = dozerService.dozerMapper.map(hitItem, ModelResultHitItemExt.class);
			String orginPara =  item.getParams().replace("{", "").replace("}", "");
			String[] params =  orginPara.split(",");//所有的元素keyvalue
			
			if(!StringUtil.isEmpty(item.getParamName()) && !StringUtil.isEmpty(item.getParams()) )
			for (String param : params) {
				String[] ss =  param.split("=");
				String key = ss[0]; //参数键
				
				String value = ss[1] ;//参数值
				if(value.equals("null")  || StringUtil.isEmpty(value)
						|| value == null ){
					value = "空";
				}
				String[] p = item.getParamName().split(",");//exp：UcCreditFactor_lcQueryCount=历史贷款和贷记卡批核记录次数
				for (String pp : p) {
					String[] ppp =  pp.split("=");
					String paraKey = ppp[0];
					String pararName = ppp[1];
					if(paraKey.contains("#")){
						continue;
					}
					if(paraKey.replace(" ","").equals(key.replace(" ",""))){
						paraValue += pararName + ":" + value + "; ";
					}
				}
			}
			
			item.setValueDetail(paraValue);
			if(item.getIsHit().equals("1")){
				if(!StringUtil.isEmpty(item.getRefuseReason()) ){
					item.setDealWay("拒绝");
				}else{
					item.setDealWay("提示");
				}
			}else {
				item.setDealWay("未命中");
			}
			
			extList.add(item);
			
		}
		return extList ;
	}
}
