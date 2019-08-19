package com.engine.service;

import com.engine.dao.ModelItemMapper;
import com.engine.model.ModelItem;
import com.engine.model.ModelItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelOrderItemService {

    @Autowired
    private ModelItemMapper modelItemMapper;


    public ModelItem getById(String id ){
        return modelItemMapper.selectByPrimaryKey(id);
    }

    public List<ModelItem> getModelItemByModelId(String modelId){
        ModelItemExample e = new ModelItemExample();
        e.createCriteria().andRiskModeIdEqualTo(modelId);
        List<ModelItem> list =  modelItemMapper.selectByExample(e);
        return  list ;
    }
}
