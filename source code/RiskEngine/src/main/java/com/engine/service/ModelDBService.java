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
    private ModelOrderItemService modelOrderItemService;

    @Autowired
    private RiskModelService riskModelService;

    @Autowired
    private ModelOrderItemMapper modelOrderItemMapper;

    @Autowired
    private ModelGroupService modelGroupService ;

    @Autowired
    private ModelNextLineListMapper modelNextLineListMapper;

    @Autowired
    private GenModelConfigService genModelConfigService;

    public void getByModelId(String modelId){
        RiskModel m = riskModelService.getModelById(modelId);
        List<ModelOrderItemWithBLOBs> listOrder = new ArrayList<>();
        List<ModelDecisionGroup> listGroup = new ArrayList<>();
        List<ModelGroupItemWithBLOBs> listGroupItems = new ArrayList<>();
        List<ModelNextLineListWithBLOBs> listGroupNext = getNextLineByType(modelId,EngineConstant.ModelNextLingType_Group);
        List<ModelNextLineListWithBLOBs> listItemNext =  getNextLineByType(modelId,EngineConstant.ModelNextLingType_Item);


        List<ModelItem> list= modelOrderItemService.getModelItemByModelId(modelId);
        for(ModelItem item : list){
            if(item.getType().equals(EngineConstant.ModelItemType_Order)){//model.order
                List<ModelOrderItemWithBLOBs> orders = getOrderListByItemId(item.getId());
                listOrder.addAll(orders);
            }else if(item.getType().equals(EngineConstant.ModelItemType_Group)){//model.decision
                List<ModelDecisionGroup> groups = modelGroupService.getGroupListByItemId(item.getId());
                listGroup.addAll(groups);
                if(groups == null ){
                    continue;
                }
                for(ModelDecisionGroup group : groups){
                    String gid = group.getId();
                    List<ModelGroupItemWithBLOBs> groupItems = modelGroupService.getGroupItemByGroupId(gid);
                    listGroupItems.addAll(groupItems);
                }
            }
        }

        String riskModelXml =  genModelConfigService.genByDBModel(m,listOrder,listGroup,listGroupItems,listGroupNext,listItemNext);

        RiskModel updateModel = new RiskModel();
        updateModel.setId(m.getId());
        updateModel.setConfig(riskModelXml);
        riskModelService.update(updateModel);

        System.out.println("-------------------test--------------------------");

    }




    public List<ModelOrderItemWithBLOBs> getOrderListByItemId(String itemId){
        ModelOrderItemExample e = new ModelOrderItemExample();
        e.createCriteria().andModelItemIdEqualTo(itemId);
        List<ModelOrderItemWithBLOBs> list = modelOrderItemMapper.selectByExampleWithBLOBs(e);
        return  list ;
    }




    public List<ModelNextLineListWithBLOBs> getNextLineByType(String modelId,int type){
        ModelNextLineListExample e = new ModelNextLineListExample();
        e.createCriteria().andModelIdEqualTo(modelId).andLineTypeEqualTo(type);
        return modelNextLineListMapper.selectByExampleWithBLOBs(e);
    }
}
