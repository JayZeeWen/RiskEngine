package com.engine.service;

import com.engine.model.*;
import com.engine.util.StringUtil;
import com.engine.util.VelocityUtil;
import com.risk.engine.entity.GItem;
import com.risk.engine.entity.Group;
import com.risk.engine.entity.Item;
import com.risk.engine.entity.RiskModelTemplate;
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

    public String genByDBModel(RiskModel m , List<ModelOrderItem> listOrder, List<ModelDecisionGroup> listGroup,List<ModelGroupItem> listGroupItem
            ,List<ModelNextLineList> listGroupNext,List<ModelNextLineList> listItemNext){
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

                if(listGroupItem == null || listGroupItem.size() < 1 ){
                    continue;
                }
                List<GItem> listItems = new ArrayList<>();
                for (ModelGroupItem item : listGroupItem){
                    if(!item.getGroupId().equals(group.getId())){
                        continue;
                    }
                    GItem  gItem =dozerService.dozerMapper.map(item,GItem.class);
                    List<String> params = Arrays.asList(item.getParams().split(",")) ;
                    gItem.setParamNames(params);
                    listItems.add(gItem);
                }
                modelGroup.setItems(listItems);
                mapDecision.put(StringUtil.makeUUID(),modelGroup);
            }
            template.setDecisions(mapDecision);
        }
        result = generateRiskModelByTemp(template);
        return  result;

    }
}
