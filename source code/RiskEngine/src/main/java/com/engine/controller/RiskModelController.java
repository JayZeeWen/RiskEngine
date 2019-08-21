package com.engine.controller;

import com.engine.api.entity.GetModelDetailReq;
import com.engine.api.entity.GetRiskModelReq;
import com.engine.config.CommConst;
import com.engine.model.BaseApiResp;
import com.engine.model.RiskModel;
import com.engine.service.RiskModelService;
import com.engine.util.BasicPageUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/riskModel")
public class RiskModelController {

    @Autowired
    private RiskModelService riskModelService;

    /**
     * 获取模型列表
     * @param req
     * @return
     */
    @RequestMapping(value = "/getModel")
    @ResponseBody
    public BaseApiResp<PageInfo<RiskModel>> getModel(@RequestBody GetRiskModelReq req ){
        List<RiskModel> list= riskModelService.getListByPara(req);
        BaseApiResp<PageInfo<RiskModel>> resp  =  new BasicPageUtil().buildPage(list);
        return  resp;
    }

    /**
     * 获取模型详情
     * @param req
     * @return
     */
    public BaseApiResp getModelDetail(@RequestBody GetModelDetailReq req){
        BaseApiResp resp = new BaseApiResp();
        resp.setCallResult(CommConst.EnumAPICallResult.Succ.getFlag());


        return  resp ;

    }


}
