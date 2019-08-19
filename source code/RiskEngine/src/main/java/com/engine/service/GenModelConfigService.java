package com.engine.service;

import com.engine.model.*;
import com.engine.util.StringUtil;
import com.engine.util.VelocityUtil;
import com.risk.engine.entity.*;
import org.apache.velocity.VelocityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 *  模型生成 服务
 */
@Service
public class GenModelConfigService {

    @Autowired
    private VelocityUtil velocityUtil;

    @Autowired
    private ModelGroupService modelGroupService;

    /**
     * 通过 模型模板类 生成 模型xml配置
     * @param template 模板类实例
     * @return 模型 xml文本
     */
    public String generateRiskModelByTemp(RiskModelTemplate template){
        String result = "";
        String templateName = "RiskModelTemplate";

        //参数
        VelocityContext context = new VelocityContext();
        context.put("riskModel",template);

        if(template.getDecisions() != null ){
            List<Group> listGroups = new ArrayList<>();
            for(Map.Entry<String,Group> e : template.getDecisions().entrySet()){
                Group g =  e.getValue();
                listGroups.add(g);
            }
            context.put("listGroup",listGroups);
        }

        result = velocityUtil.generateByContext(context,templateName);
        return  result;
    }

    public String genByDBModel(RiskModel m , List<ModelOrderItemWithBLOBs> listOrder, List<ModelDecisionGroup> listGroup,List<ModelGroupItemWithBLOBs> listGroupItem
            ,List<ModelNextLineListWithBLOBs> listGroupNext,List<ModelNextLineListWithBLOBs> listItemNext){
        String result = "";
        RiskModelTemplate template = dozerService.dozerMapper.map(m,RiskModelTemplate.class);

        //遍历构建orders.item
        if(listOrder != null && listOrder.size() > 0){
            List<Item> listItems = new ArrayList<>();
            for(ModelOrderItem order : listOrder){
                Item item = dozerService.dozerMapper.map(order,Item.class);
                List<String> params = Arrays.asList(order.getParams().split(",")) ;
                item.setParamNames(params);
                listItems.add(item);
            }
            template.setOrders(listItems);
        }

        //遍历构建decisions.group
        if(listGroup != null && listGroup.size() > 0 ){
            Map<String ,Group> mapDecision = new HashMap<>();

            for (ModelDecisionGroup group : listGroup){
                Group modelGroup = dozerService.dozerMapper.map(group,Group.class);

                //构建group.item
                if(listGroupItem == null || listGroupItem.size() < 1 ){
                    continue;
                }
                List<GItem> listItems = new ArrayList<>();
                for (ModelGroupItemWithBLOBs item : listGroupItem){
                    if(!item.getGroupId().equals(group.getId())){
                        continue;
                    }
                    GItem  gItem =dozerService.dozerMapper.map(item,GItem.class);
                    List<String> params = Arrays.asList(item.getParams().split(",")) ;
                    gItem.setParamNames(params);

                    //构建group.item.next
                    List<Next> listNext = new ArrayList<>();
                    for (ModelNextLineListWithBLOBs itemNext : listItemNext){
                        if(itemNext.getLineType() != EngineConstant.ModelNextLingType_Item){
                            continue;
                        }
                        if(!itemNext.getPreId().equals(item.getId())){
                            continue;
                        }
                        Next n = dozerService.dozerMapper.map(itemNext,Next.class);
                        ModelGroupItem nextItem =  modelGroupService.getGroupItemById(itemNext.getNextId());
                        n.setId(nextItem.getItemNo());
                        listNext.add(n);
                    }
                    gItem.setNextList(listNext);

                    listItems.add(gItem);
                }
                modelGroup.setItems(listItems);

                //构建group.next
                List<Next> listNext = new ArrayList<>();
                for (ModelNextLineList next : listGroupNext){
                    if(next.getLineType() != EngineConstant.ModelNextLingType_Group){
                        continue;
                    }
                    if(!next.getPreId().equals(group.getId())){
                        continue;
                    }
                    Next n = dozerService.dozerMapper.map(next,Next.class);
                    ModelDecisionGroup nextG = modelGroupService.getGroupById(next.getNextId());
                    n.setId(nextG.getGroupNo());
                    listNext.add(n);
                }
                modelGroup.setNextList(listNext);

                mapDecision.put(StringUtil.makeUUID(),modelGroup);
            }
            template.setDecisions(mapDecision);
        }
        result = generateRiskModelByTemp(template);
        return  result;

    }
}
