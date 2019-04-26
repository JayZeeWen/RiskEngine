package com.engine.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.risk.engine.RiskEngine;
import com.risk.engine.entity.Result;
import com.risk.engine.entity.RiskParam;


@Controller
@RequestMapping("/test")
public class testController {

	
	
	@ResponseBody
	@RequestMapping(value = "/testEngine")
    public String  testRiskEngine() {
		RiskParam param = new RiskParam();
		String modelId = "3";
		try {
			Result r =  RiskEngine.execute(modelId, param);
			System.out.println(r.getMessages());
		} catch (Exception e) {
			System.out.println(e);
		}
		
        return "succ";
    }
	
}
