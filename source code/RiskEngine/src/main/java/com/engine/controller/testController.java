package com.engine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.engine.model.ModelResultHitItemExt;
import com.engine.service.ModelResultHitItemService;
import com.engine.service.RiskResultService;
import com.engine.util.StringUtil;
import com.risk.engine.RiskEngine;
import com.risk.engine.entity.Result;
import com.risk.engine.entity.RiskParam;


@Controller
@RequestMapping("/test")
public class testController {

	@Autowired
	private RiskResultService riskResultService;
	
	@Autowired
	private ModelResultHitItemService resultHitItemService;
	
	@ResponseBody
	@RequestMapping(value = "/testEngine")
    public String  testRiskEngine() {
		RiskParam param = new RiskParam();
		param.setSingle5yearOverCount(20);
		String modelId = "5";
		try {
			//执行模型并得到结果
			Result r =  RiskEngine.execute(modelId, param);
			System.out.println(r.getMessages());
			
			//结果存表
			riskResultService.insertResultHitItem(r.getHitItems(), StringUtil.makeUUID(), modelId);
		} catch (Exception e) {
			System.out.println(e);
		}
		
        return "succ";
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
        return "succ";
    }
	
}
