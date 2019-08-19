package com.engine.service;

import com.engine.dao.ModelDecisionGroupMapper;
import com.engine.dao.ModelGroupItemMapper;
import com.engine.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelGroupService {

    @Autowired
    private ModelDecisionGroupMapper modelDecisionGroupMapper;

    @Autowired
    private ModelGroupItemMapper modelGroupItemMapper;


    public ModelDecisionGroup getGroupById(String id ){
        return modelDecisionGroupMapper.selectByPrimaryKey(id);
    }

    public ModelGroupItem getGroupItemById(String id ){
        return  modelGroupItemMapper.selectByPrimaryKey(id);
    }

    public List<ModelDecisionGroup> getGroupListByItemId(String itemId){
        ModelDecisionGroupExample e = new ModelDecisionGroupExample();
        e.createCriteria().andModelItemIdEqualTo(itemId);
        List<ModelDecisionGroup> list = modelDecisionGroupMapper.selectByExample(e);
        return  list ;
    }

    public List<ModelGroupItemWithBLOBs> getGroupItemByGroupId(String groupId){
        ModelGroupItemExample e = new ModelGroupItemExample();
        e.createCriteria().andGroupIdEqualTo(groupId);
        List<ModelGroupItemWithBLOBs> list = modelGroupItemMapper.selectByExampleWithBLOBs(e);
        return  list;
    }


}
