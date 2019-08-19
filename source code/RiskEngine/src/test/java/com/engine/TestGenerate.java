package com.engine;

import com.engine.data.ReflexParams;
import com.engine.model.*;
import com.engine.service.GenModelConfigService;
import com.engine.service.ModelDBService;
import com.engine.service.RiskResultService;
import com.engine.util.StringUtil;
import com.engine.util.VelocityUtil;
import com.risk.engine.RiskEngine;
import com.risk.engine.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestGenerate {

    @Autowired
    private VelocityUtil velocityUtils;

    @Autowired
    private GenModelConfigService genModelConfigService;

    @Autowired
    private ModelDBService modelDBService;

    @Autowired
    private RiskResultService riskResultService;



    @Test
    public void testGenModelWithDBModel(){
        RiskModelTemplate template  = new RiskModelTemplate();

        String result = "";
        result += genModelConfigService.generateRiskModelByTemp(template);

        System.out.println(result);
    }

    @Test
    public void testRunModel(){

        RiskParam param = new RiskParam();
        param.setSingle5yearOverCount(20);
        String modelId = "9";
        try {
            ReflexParams p = new ReflexParams();
            p.setUserId("3332");
            p.setOrderId("sdf");

            //执行模型并得到结果
            Result r =  RiskEngine.executeWithReflex(modelId,p);
            System.out.println(r.getMessages());

            //结果存表
            riskResultService.insertResultHitItem(r.getHitItems(), StringUtil.makeUUID(), modelId);
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    @Test
    public void  TestGetDBModel(){
        modelDBService.getByModelId("9");
    }



    @Test
    public void generaByDBModel(){
        RiskModel m = new RiskModel();
        m.setId("123");
        m.setModelDesc("测试模型2");
        m.setModelType("0");
        m.setActive("1");

        //order
        List<ModelOrderItemWithBLOBs> listOrder = new ArrayList<>();
        ModelOrderItemWithBLOBs oItem = new ModelOrderItemWithBLOBs();
        oItem.setItemNo("98");
        oItem.setName("age");
        oItem.setDescri("年龄限制");
        oItem.setSort(1);
        oItem.setIsRefuse(true);
        oItem.setPoints(new BigDecimal("0"));
        oItem.setTag("年轻人");
        oItem.setExp("if(( UcBasicInfo_gender == 1 &&  (UcBasicInfo_age < 21 ||  UcBasicInfo_age > 60))\n" +
                "                            || ( UcBasicInfo_gender == 2 &&  (UcBasicInfo_age < 21 ||  UcBasicInfo_age > 55) ))\n" +
                "                            { return true ; } else {return false ;}");
        oItem.setParams("UcBasicInfo_age,UcBasicInfo_gender");
        oItem.setParamNames("UcBasicInfo_age=年龄,UcBasicInfo_gender=性别");
        listOrder.add(oItem);

        //group
        List< ModelDecisionGroup > listGroup = new ArrayList<>();
        ModelDecisionGroup group = new ModelDecisionGroup();
        group.setModelItemId("9");
        group.setId("997");
        group.setGroupNo("1");
        group.setGroupDesc("性别");
        group.setGroupName("genderGroup");
        group.setIsStart(true);
        group.setPoints(new BigDecimal("0"));
        listGroup.add(group);


        //group.item
        List<ModelGroupItemWithBLOBs> listGroupItems = new ArrayList<>();
        ModelGroupItemWithBLOBs gItem = new ModelGroupItemWithBLOBs();
        gItem.setGroupId("997");
        gItem.setName("male");
        gItem.setDescri("男");
        gItem.setItemNo("1");
        gItem.setPoints(new BigDecimal("11.17"));
        gItem.setSort(4);
        gItem.setStart(true);
        gItem.setParentFalsecontinue(EngineConstant.Continue);
        gItem.setFalseContinue(EngineConstant.Continue);
        gItem.setTrueContinue(EngineConstant.Break);
        gItem.setExp(" if(UcBasicInfo_gender == 1 ) {return true;} else {return false ;} ");
        gItem.setParams("UcBasicInfo_gender");
        gItem.setParamNames("UcBasicInfo_gender=性别");
        listGroupItems.add(gItem);

        ModelGroupItemWithBLOBs gItem2 = new ModelGroupItemWithBLOBs();
        gItem2.setGroupId("997");
        gItem2.setName("female");
        gItem2.setDescri("女");
        gItem2.setItemNo("2");
        gItem2.setPoints(new BigDecimal("80.64"));
        gItem2.setSort(4);
        gItem2.setStart(true);
        gItem2.setParentFalsecontinue(EngineConstant.Continue);
        gItem2.setFalseContinue(EngineConstant.Continue);
        gItem2.setTrueContinue(EngineConstant.Break);
        gItem2.setExp(" if(UcBasicInfo_gender == 2 ) {return true;} else {return false ;} ");
        gItem2.setParams("UcBasicInfo_gender");
        gItem2.setParamNames("UcBasicInfo_gender=性别");
        listGroupItems.add(gItem2);

        //group 2
        ModelDecisionGroup group2 = new ModelDecisionGroup();
        group2.setModelItemId("9");
        group2.setId("998");
        group2.setGroupNo("2");
        group2.setGroupDesc("户口类型");
        group2.setGroupName("registGroup");
        group2.setIsStart(true);
        group2.setPoints(new BigDecimal("0"));
        listGroup.add(group2);

        //group.next
        List<ModelNextLineList> listGNext = new ArrayList<>();
        ModelNextLineList gNext =new ModelNextLineList();
        gNext.setLineType(EngineConstant.NextLineType_GroupNext);
        gNext.setPreId("997");
        gNext.setNextId("998");



        //group.item.next


        List< ModelNextLineListWithBLOBs > listGroupNext = new ArrayList<>();
        List<ModelNextLineListWithBLOBs> listItemNext = new ArrayList<>();

        genModelConfigService.genByDBModel(m,listOrder,listGroup,listGroupItems,listGroupNext,listItemNext);

    }
}
