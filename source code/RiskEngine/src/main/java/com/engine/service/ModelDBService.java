package com.engine.service;

import com.engine.dao.*;
import com.engine.model.*;
import com.risk.engine.entity.EngineConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModelDBService {

    @Autowired
    private ModelItemMapper modelItemMapper;

    @Autowired
    private RiskModelMapper riskModelMapper;

    @Autowired
    private ModelOrderItemMapper modelOrderItemMapper;

    @Autowired
    private ModelDecisionGroupMapper modelDecisionGroupMapper;

    @Autowired
    private ModelGroupItemMapper modelGroupItemMapper;

    @Autowired
    private GenModelConfigService genModelConfigService;

    public void getByModelId(String modelId){
        RiskModel m = getModelById(modelId);
        List<ModelOrderItem> listOrder = new ArrayList<>();
        List<ModelDecisionGroup> listGroup = new ArrayList<>();
        List<ModelGroupItem> listGroupItems = new ArrayList<>();
        List< ModelNextLineList > listGroupNext = new ArrayList<>();
        List<ModelNextLineList> listItemNext = new ArrayList<>();


        List<ModelItem> list= getModelItemByModelId(modelId);
        for(ModelItem item : list){
            if(item.getType().equals(EngineConstant.ModelItemType_Order)){//model.order
                List<ModelOrderItem> orders = getOrderListByItemId(item.getId());
                listOrder.addAll(orders);
            }else if(item.getType().equals(EngineConstant.ModelItemType_Group)){//model.decision
                List<ModelDecisionGroup> groups = getGroupListByItemId(item.getId());
                listGroup.addAll(groups);
                if(groups == null ){
                    continue;
                }
                for(ModelDecisionGroup group : groups){
                    String gid = group.getId();
                    List<ModelGroupItem> groupItems = getGroupItemByGroupId(gid);
                    listGroupItems.addAll(groupItems);
                }
            }
        }

        genModelConfigService.genByDBModel(m,listOrder,listGroup,listGroupItems,listGroupNext,listItemNext);

        System.out.println("-------------------test--------------------------");


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

    public List<ModelItem> getModelItemByModelId(String modelId){
        ModelItemExample e = new ModelItemExample();
        e.createCriteria().andRiskModeIdEqualTo(modelId);
        List<ModelItem> list =  modelItemMapper.selectByExample(e);
        return  list ;
    }

    public List<ModelOrderItem> getOrderListByItemId(String itemId){
        ModelOrderItemExample e = new ModelOrderItemExample();
        e.createCriteria().andModelItemIdEqualTo(itemId);
        List<ModelOrderItem> list = modelOrderItemMapper.selectByExample(e);
        return  list ;
    }

    public List<ModelDecisionGroup> getGroupListByItemId(String itemId){
        ModelDecisionGroupExample e = new ModelDecisionGroupExample();
        e.createCriteria().andModelItemIdEqualTo(itemId);
        List<ModelDecisionGroup> list = modelDecisionGroupMapper.selectByExample(e);
        return  list ;
    }

    public List<ModelGroupItem> getGroupItemByGroupId(String groupId){
        ModelGroupItemExample e = new ModelGroupItemExample();
        e.createCriteria().andGroupIdEqualTo(groupId);
        List<ModelGroupItem> list = modelGroupItemMapper.selectByExample(e);
        return  list;
    }
}
