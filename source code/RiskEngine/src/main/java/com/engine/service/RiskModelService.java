package com.engine.service;

import com.engine.dao.RiskModelMapper;
import com.engine.model.RiskModel;
import com.engine.model.RiskModelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RiskModelService {

    @Autowired
    private RiskModelMapper riskModelMapper;


    public void update(RiskModel riskModel){
        riskModel.setUpdated(new Date());
        riskModelMapper.updateByPrimaryKeySelective(riskModel);
    }

    public RiskModel getModelById(String modelId){
        RiskModelExample e = new RiskModelExample();
        e.createCriteria().andIdEqualTo(modelId);
        List<RiskModel> list = riskModelMapper.selectByExample(e);
        if(list == null || list.size() < 1 ){
            return  null;
        }
        return  list.get(0);
    }
}
