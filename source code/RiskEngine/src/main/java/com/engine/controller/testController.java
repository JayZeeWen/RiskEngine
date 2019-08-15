package com.engine.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.engine.data.ReflexParams;
import com.engine.service.GenModelConfigService;
import com.engine.service.ModelDBService;
import com.engine.util.VelocityUtil;
import com.risk.engine.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.engine.model.ModelResultHitItemExt;
import com.engine.service.ModelResultHitItemService;
import com.engine.service.RiskResultService;
import com.engine.util.StringUtil;
import com.risk.engine.RiskEngine;


@Controller
@RequestMapping("/test")
public class testController {

	@Autowired
	private RiskResultService riskResultService;
	
	@Autowired
	private ModelResultHitItemService resultHitItemService;

	@Autowired
	private  VelocityUtil velocityUtils;

	@Autowired
	private GenModelConfigService genModelConfigService;

	@Autowired
	private ModelDBService modelDBService;
	
	@ResponseBody
	@RequestMapping(value = "/testEngine")
    public String  testRiskEngine() {
		RiskParam param = new RiskParam();
		param.setSingle5yearOverCount(20);
		String modelId = "9";
		try {
			//执行模型并得到结果
			Result r =  RiskEngine.execute(modelId, param);
			System.out.println(r.getMessages());
			
			//结果存表
			//riskResultService.insertResultHitItem(r.getHitItems(), StringUtil.makeUUID(), modelId);
		} catch (Exception e) {
			System.out.println(e);
		}
		
        return "succ";
    }

	@ResponseBody
	@RequestMapping(value = "/testRiskEngineWithRef")
    public String testRiskEngineWithRef(){

		String modelId = "3";
		Map<String,Object> params = new HashMap<>();
		try {
			ReflexParams p = new ReflexParams();
			p.setUserId("3332");
			p.setOrderId("sdf");

			//执行模型并得到结果
			Result r =  RiskEngine.executeWithReflex(modelId,p);
			System.out.println(r.getMessages());

		} catch (Exception e) {
			System.out.println(e);
		}
		return  "Succ";

	}
	
	/**
	 * 获取 命中的规则详情
	 * @param resultId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getResultDetail")
    public String  getResultDetail(String resultId) {
		//根据模型结果 获取 命中的规则详情
		List<ModelResultHitItemExt> list = resultHitItemService.getHitItemExtByResultId(resultId);
		modelDBService.getByModelId("9");

        return "succ";
    }

	/**
	 * 测试生成模型xml
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/testVeclo")

	public String  testVeclo() {
		RiskModelTemplate template  = new RiskModelTemplate();
		List<String> listPara = new ArrayList<>();
		List<String> listP = new ArrayList<>();

		template.setId("9");
		List<Item> listOrder = new ArrayList<Item>();

		listPara.add("UcBasicInfo_age");
		listPara.add("UcBasicInfo_gender");
		Item order = new Item();
		order.setId("98");
		order.setDesc("年龄限制");
		order.setName("age");
		order.setOrder(1);
		order.setRefuse(true);
		order.setRefuseReason("432");
		order.setPoints(new BigDecimal(0));
		order.setExpression(" if(( UcBasicInfo_gender == 1 &&  (UcBasicInfo_age < 21 ||  UcBasicInfo_age > 60))\n" +
				"                            || ( UcBasicInfo_gender == 2 &&  (UcBasicInfo_age < 21 ||  UcBasicInfo_age > 55) ))\n" +
				"                            { return true ; } else {return false ;}");
		order.setParamNames(listPara);
		order.setParamDescs("UcBasicInfo_age=年龄,UcBasicInfo_gender=性别");

		listOrder.add(order);
		template.setOrders(listOrder);

		Map<String, Group> listGroups = new HashMap<>();
		List<GItem> listItem = new ArrayList<>();
		List<Next> listINext = new ArrayList<>();
		List<Next> listGNext = new ArrayList<>();




		Next iNext = new Next();

		iNext.setId("1");
		iNext.setExpression("return true;");
		iNext.setParamNames(listPara);
		listINext.add(iNext);

		GItem item = new GItem();

		listP.add("UcBasicInfo_gender");
		item.setId("1");
		item.setDesc("男");
		item.setName("male");
		item.setPoints(new BigDecimal(String.valueOf("11.17")));

		item.setStart(true);
		item.setTurecontinue(EngineConstant.Break);
		item.setFalsecontinue(EngineConstant.Continue);
		item.setParentfalsecontinue(EngineConstant.Continue);
		item.setExpression("if(UcBasicInfo_gender == 1 ) {return true;} else {return false ;} ");
		item.setParamNames(listP);
		item.setNextList(listINext);
		listItem.add(item);

		Next gNext = new Next();
		gNext.setId("2");
		gNext.setExpression("return true;");
		gNext.setParamNames(listP);
		listGNext.add(gNext);

		Group group = new Group();
		group.setGid("99");
		group.setName("genderGroup");
		group.setDesc("性别");
		group.setPoints(new BigDecimal(0));
		group.setStart(true);
		group.setItems(listItem);
		group.setNextList(listGNext);
		listGroups.put("1",group);
		template.setDecisions(listGroups);


		String result = "<html><body><div>";
		result += genModelConfigService.generateRiskModelByTemp(template);
		result += "</div></body></html>";
		return result;
	}



	
}
