package com.risk.engine;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;

import com.engine.config.CommConst;
import com.engine.data.ReflexParams;
import com.engine.util.LoggerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.engine.model.ModelResultHitItem;
import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;
import com.risk.engine.entity.GItem;
import com.risk.engine.entity.Group;
import com.risk.engine.entity.Item;
import com.risk.engine.entity.Next;
import com.risk.engine.entity.Result;
import com.risk.engine.entity.RiskModelTemplate;
import com.engine.util.ExceptionUtils;
import com.engine.util.MathUtils;
import com.engine.util.ReflexUtil;

/**
 * 引擎执行入口
 *
 * @author JayZee 文
 */
public class RiskEngine {

    private static Logger logger = LoggerFactory.getLogger(RiskEngine.class);

    private static Map<String, ExpressRunner> runnerCache = new HashMap<String, ExpressRunner>();

    /**
     * 对象参数 执行入口
     *
     * @param id  模型id
     * @param obj 参数实例
     * @return 模型结果
     * @throws Exception
     */
    public static Result execute(String id, Object obj) throws Exception {
        Map<String, Object> params;
        try {
            params = parseObject(obj);
            return execute(id, params);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            String msg = ExceptionUtils.getStackTrace(e);
            LoggerHelper.error(logger, msg);
            throw e;
        }
    }

    /**
     * 通过获取参数map 执行模型
     *
     * @param modelId  模型id
     * @param paramRef 反射需要用的参数实例
     * @return
     */
    public static Result executeWithReflex(String modelId, ReflexParams paramRef) throws Exception {
        Map<String, Object> params;
        try {
            //获取模型参数列表
            Set<String> listParams = getModleNeedParams(modelId);
            //构建模型参数map
            params = getParamsByListParams(listParams, paramRef);
            return execute(modelId, params);
        } catch (Exception e) {
            LoggerHelper.error(logger, ExceptionUtils.getStackTrace(e));
            throw e;
        }
    }

    /**
     * 执行模型判断
     *
     * @param id     模型id
     * @param params 参数map
     * @return 模型结果
     */
    public static Result execute(String id, Map<String, Object> params) {
        List<ModelResultHitItem> itemList = new ArrayList<ModelResultHitItem>();

        ExpressRunner runner = runnerCache.get(id);
        if (null == runner) {
            runner = new ExpressRunner();
            runnerCache.put(id, runner);
        }
        StringBuffer sb = new StringBuffer();

        String msg = "";
        Result result = Result.create();
        result.setPass(true);
        List<String> msgList = new ArrayList();
        List<String> tagList = new ArrayList<>();
        IExpressContext<String, Object> context = null;
        //context.
        RiskModelTemplate model = RiskEngineContainer.getRiskModel(id);
        if (model == null) {
            throw new RuntimeException("未找到模型");
        }
        sb.append("风控模型：【" + model.getModelName() + "】 开始执行：");

        if (!CollectionUtils.isEmpty(model.getOrders())) {
            sb.append(String.format("%n开始计算order规则 %n"));
            //按照order排序
            List<Item> list = model.getOrders();
            boolean res = true;
            for (int i = 0; i < list.size(); i++) {
                try {
                    Item item = list.get(i);
                    BigDecimal p = MathUtils.defaultZero(item.getPoints()).setScale(2, BigDecimal.ROUND_HALF_UP);
                    context = getIExpressContext(params, item.getParamNames());
                    sb.append(String.format("  规则 ：【%s】 ", item.getDesc()));
                    res = (Boolean) runner.execute(item.getExpression(), context, null, true, false);

                    ModelResultHitItem entity = new ModelResultHitItem();
                    entity.setHitItemId(item.getId());
                    entity.setHitItemDesc(item.getDesc());
                    entity.setPoints(item.getPoints());
                    entity.setParams(context.toString());
                    entity.setRefuseReason(item.getRefuseReason());
                    entity.setParamName(item.getParamDescs());
                    entity.setTag(item.getTag());


                    if (res) {//命中规则减分
                        entity.setIsHit("1");
                        sb.append(String.format(" 命中 减  %s 分%n ", p));
                        p = MathUtils.defaultZero(result.getOrderPoints()).subtract(p).setScale(2, BigDecimal.ROUND_HALF_UP);
                        result.setOrderPoints(p);
                        if (!StringUtils.isEmpty(entity.getTag())) {
                            tagList.add(entity.getTag());
                        }
                        if (item.isRefuse()) {
                            result.setPass(false);
                            if (item.isRefuseBreak()) {
                                itemList.add(entity);
                                sb.append(String.format(" 拒绝执行下一规则  %n"));
                                break;
                            }
                        }
                    } else {//未命中加分
                        entity.setIsHit("0");
                        sb.append(String.format(" 未命中 加  %s 分  %n", p));
                        p = p.add(MathUtils.defaultZero(result.getOrderPoints())).setScale(2, BigDecimal.ROUND_HALF_UP);
                        result.setOrderPoints(p);
                    }
                    itemList.add(entity);
                } catch (Exception e) {
                    sb.append("执行异常%n");
                    e.printStackTrace();
                }
            }
            sb.append(String.format("order规则计算结束 %n"));
//			msgList.add(msg);
        }

        /**
         * 执行决策树
         */
        if (model.getDecisions() != null && !model.getDecisions().isEmpty()) {
            boolean res = true;
            String parentfalsecontinue = "continue";
            GItem nextGItem = null;
            Group nextGroup = findStartGroup(model.getDecisions());
            sb.append(String.format("开始计算decisions规则 %n"));

            while (null != nextGroup) {
                sb.append(String.format("  规则组 ：【%s】 ,  开始执行%n", nextGroup.getDesc()));
                nextGItem = getStartGItem(nextGroup.getItems());
                while (null != nextGItem) {
                    sb.append(String.format("    规则策略 ：【%s】  ", nextGItem.getDesc()));
                    context = getIExpressContext(params, nextGItem.getParamNames());
                    try {
                        res = (Boolean) runner.execute(nextGItem.getExpression(), context, null, true, false);
                        if (res) {//命中
                            //记录命中记录
                            ModelResultHitItem entity = new ModelResultHitItem();
                            entity.setHitItemId(nextGItem.getId());
                            entity.setHitItemDesc(nextGItem.getDesc());
                            entity.setGroupId(nextGroup.getGid());
                            entity.setGroupDesc(nextGroup.getDesc());
                            entity.setGroupName(nextGroup.getName());
                            entity.setPoints(nextGItem.getPoints());
                            entity.setParams(context.toString());
                            entity.setIsHit("1");
                            itemList.add(entity);

                            BigDecimal p = MathUtils.defaultZero(nextGItem.getPoints()).setScale(2, BigDecimal.ROUND_HALF_UP);
                            sb.append(String.format("命中 增加 %s 分 %n ", p));
                            p = p.add(MathUtils.defaultZero(result.getDecisionPoints())).setScale(2, BigDecimal.ROUND_HALF_UP);
                            result.setDecisionPoints(p);
                            if ("break".equals(nextGItem.getTurecontinue())) {
                                sb.append(String.format("   执行下一规则组  %n", nextGItem.getPoints()));
                                break;
                            }
                        } else {
                            sb.append(String.format(" 未命中 %n ", nextGItem.getPoints().setScale(2, BigDecimal.ROUND_HALF_UP)));
                            //如果parentfalsecontinue 不是 break 继续给parentfalsecontinue赋值
                            if (!"break".equals(parentfalsecontinue)) {
                                parentfalsecontinue = nextGItem.getParentfalsecontinue();
                            }
                            if ("break".equals(nextGItem.getFalsecontinue())) {
                                sb.append(String.format(" 拒绝执行下一策略  %n", nextGItem.getPoints()));
                                break;
                            }
                        }

                        nextGItem = findNextGItem(nextGroup.getItems(), nextGItem, params, runner);
                        //找不到下一个节点 跳出当前循环
                        if (null == nextGItem) {
                            sb.append(String.format("    规则策略结束   %n"));
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        throw new RuntimeException("执行异常");
                    }
                }
                if ("break".equals(parentfalsecontinue)) {
                    break;
                }

                //加上group的分值
                BigDecimal pg = MathUtils.defaultZero(nextGroup.getPoints()).setScale(2, BigDecimal.ROUND_HALF_UP);
                sb.append(String.format("  规则组：【%s】 结束， 增加 %s 分 ", nextGroup.getDesc(), pg));
                pg = pg.add(MathUtils.defaultZero(result.getDecisionPoints())).setScale(2, BigDecimal.ROUND_HALF_UP);
                result.setDecisionPoints(pg);

                sb.append(String.format("   当前decisions得分 ： %s  %n", result.getDecisionPoints()));

                nextGroup = findNextGroup(model, nextGroup, params, runner);
                //找不到下一个节点 跳出当前循环
                if (null == nextGroup) {
                    sb.append(String.format("所有规则组结束  %n"));
                    break;
                }
            }
            sb.append(String.format("decisions规则计算结束 %n"));
//			msgList.add(msg);
        }

        sb.append(String.format("风控模型：【%s】 执行结束。", model.getModelName()));
        sb.append(String.format("执行结果，是否通过 ：%s ,order得分： %s ,decisions 得分： %s ,总分： %s "
                , result.isPass()
                , result.getOrderPoints()
                , result.getDecisionPoints()
                , result.getPoints()));
        msgList.add(sb.toString());
        result.setMessages(msgList);
        result.setHitItems(itemList);
        List<String> refuseReason = new ArrayList<String>();
        for (ModelResultHitItem hit : result.getHitItems()) {
            if (!StringUtils.isEmpty(hit.getRefuseReason()) && hit.getIsHit().equals("1")) {
                refuseReason.add(hit.getRefuseReason());
            }
        }
        result.setRefuseReason(refuseReason);
        result.setTags(tagList);
        return result;
    }

    /**
     * 找下一个group
     *
     * @param model
     * @param currentGroup
     * @param params
     * @return
     */
    private static Group findNextGroup(RiskModelTemplate model, Group currentGroup, Map<String, Object> params, ExpressRunner runner) {
        List<Next> nextList = currentGroup.getNextList();
        if (!CollectionUtils.isEmpty(nextList)) {
            IExpressContext<String, Object> context = null;
            Boolean res = false;
            for (Next next : nextList) {
                context = getIExpressContext(params, next.getParamNames());
                try {
                    res = (Boolean) runner.execute(next.getExpression(), context, null, true, false);
                    if (res) {
                        return model.getDecisions().get(next.getId());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            //表达式没有匹配的 找默认的 即 表达式为空
            for (Next next : nextList) {
                if (StringUtils.isEmpty(next.getExpression())) {
                    return model.getDecisions().get(next.getId());
                }
            }
        }
        return null;
    }

    /**
     * 找到开始的group
     *
     * @param map
     * @return
     */
    private static Group findStartGroup(Map<String, Group> map) {
        Set<Entry<String, Group>> set = map.entrySet();
        for (Entry<String, Group> e : set) {
            if (e.getValue().isStart()) {
                return e.getValue();
            }
        }
        return null;
    }

    /**
     * 获取所有groups
     *
     * @param map map
     * @return List<Group>
     */
    private static List<Group> getAllGroup(Map<String, Group> map) {
        List<Group> groups = new ArrayList<>();
        Set<Entry<String, Group>> set = map.entrySet();

        for (Entry<String, Group> e : set) {
            groups.add(e.getValue());
        }
        return groups;
    }

    /**
     * 找到开始的item节点  默认第一个
     *
     * @return
     */
    private static GItem getStartGItem(List<GItem> list) {

        for (GItem i : list) {
            if (i.isStart()) {
                return i;
            }
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * 找到开始的item节点  默认第一个
     *
     * @return
     */
    private static GItem findNextGItem(List<GItem> list, GItem currentItem, Map<String, Object> params, ExpressRunner runner) {
        List<Next> nextList = currentItem.getNextList();
        if (!CollectionUtils.isEmpty(nextList)) {
            IExpressContext<String, Object> context = null;
            Boolean res = false;
            String nextId = null;
            for (Next next : nextList) {
                context = getIExpressContext(params, next.getParamNames());
                try {
                    res = (Boolean) runner.execute(next.getExpression(), context, null, true, false);
                    if (res) {
                        nextId = next.getId();
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (StringUtils.isEmpty(nextId)) {
                //表达式没有匹配的 找默认的 即 表达式为空
                for (Next next : nextList) {
                    if (StringUtils.isEmpty(next.getExpression())) {
                        nextId = next.getId();
                        break;
                    }
                }
            }

            if (!StringUtils.isEmpty(nextId)) {
                for (GItem i : list) {
                    if (nextId.equals(i.getId())) {
                        return i;
                    }
                }
            }
        }

        return null;
    }

    /**
     * @return IExpressContext
     */
    private static IExpressContext<String, Object> getIExpressContext(Map<String, Object> source, List<String> names) {
        IExpressContext<String, Object> context = new DefaultContext<String, Object>();
        for (String name : names) {
            context.put(name, source.get(name));
        }
        return context;
    }

    /**
     * 对象属性解析到map结构
     * key : class simpleName_fieldName
     *
     * @param o
     * @return Map
     * @throws IllegalAccessException   123
     * @throws IllegalArgumentException 123
     */
    public static Map<String, Object> parseObject(Object o) throws IllegalArgumentException, IllegalAccessException {
        Map<String, Object> params = new HashMap<String, Object>();
        if (null == o) {
            return params;
        }
        if (o instanceof List) {
            for (Object to : (List) o) {
                params.putAll(parseObject(to));
            }
            return params;
        }

        if (o instanceof Map) {
            Map tm = (Map) o;
            Set<Entry> se = tm.entrySet();
            for (Entry entry : se) {
                params.putAll(parseObject(entry.getValue()));
            }

            return params;
        }
        Class<?> c = o.getClass();
        String simpleName = c.getSimpleName();
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            //if(f.getType().isPrimitive() || f.get(o) instanceof String){
            if (f.getType().isPrimitive() || "java.lang.String".equals(f.getType().getName())
                    || "java.lang.Long".equals(f.getType().getName())
                    || "java.lang.Integer".equals(f.getType().getName())
                    || "java.lang.Float".equals(f.getType().getName())
                    || "java.util.Date".equals(f.getType().getName())
                    || "java.math.BigDecimal".equals(f.getType().getName())) {
                //约定以"类名_属性名"作为key
                params.put(simpleName + "_" + f.getName(), f.get(o));
            } else {
                params.putAll(parseObject(f.get(o)));
            }
        }

        return params;
    }

    /**
     * 获取模型需要中的所有 params 参数 （包括order 的 和group 的）
     *
     * @param modelId 模型id
     * @return 所有参数的list
     */
    public static Set<String> getModleNeedParams(String modelId) {

        Set<String> listParams = new HashSet<String>();
        RiskModelTemplate model = RiskEngineContainer.getRiskModel(modelId);
        if (model == null) {
            throw new RuntimeException("未找到模型");
        }

        if (!CollectionUtils.isEmpty(model.getOrders())) {
            //按照order排序
            List<Item> list = model.getOrders();
            boolean res = true;
            for (int i = 0; i < list.size(); i++) {
                try {
                    Item item = list.get(i);
                    List<String> listParam = item.getParamNames();
                    listParams.addAll(listParam);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (model.getDecisions() != null && !model.getDecisions().isEmpty()) {
            boolean res = true;
            String parentfalsecontinue = "continue";
            GItem nextGItem = null;
            Group nextGroup = findStartGroup(model.getDecisions());
            List<Group> groups = getAllGroup(model.getDecisions());

            for (Group g : groups) {
                List<GItem> items = g.getItems();
                for (GItem item : items) {
                    listParams.addAll(item.getParamNames());
                    for (Next n : item.getNextList()) {
                        listParams.addAll(n.getParamNames());
                    }
                }
                List<Next> nexts = g.getNextList();
                for (Next n : nexts) {
                    listParams.addAll(n.getParamNames());
                }
            }
        }
        return listParams;
    }

    /**
     * 通过调用反射方法构建 模型参数map
     *
     * @param listParams 参数列表
     * @param paramRef   反射调用参数
     * @return 参数map
     */
    private static Map<String, Object> getParamsByListParams(Set<String> listParams, ReflexParams paramRef) {
        Map<String, Object> params = new HashMap<>();
        //遍历所有参数 通过调用反射方法构建 模型参数map
        for (String param : listParams) {
            Object paramResult;
            try {
                String[] strs = param.split("_");
                String className = strs[0];
                String methodName = strs[1];
                paramResult = ReflexUtil.invokeMethod(
                        CommConst.BASE_DATA_PACKAGE + className, methodName, paramRef);
            } catch (Exception ex) {
                String msg = "构造模型参数异常: 【" + param + "】反射调用异常";
                LoggerHelper.error(msg, RiskEngine.class.getName());
                paramResult = null;
            }
            params.put(param, paramResult);
        }
        return params;
    }

    public static void main(String args[]) throws IllegalArgumentException, IllegalAccessException {
        Group g = new Group();
        g.setDesc("test");
        g.setGid("testgid");
        Integer aInteger = new Integer(2);
        List list = Arrays.asList("上海市", "四川省");

        BigDecimal d1 = new BigDecimal(0.1);
        BigDecimal d2 = new BigDecimal(1000);
        boolean b1 = list.contains("安徽省");
        GItem i = new GItem();
        i.setId("itemid test");
        List<GItem> l = new ArrayList<GItem>();
        l.add(i);
        g.setItems(l);

        Map<String, Object> map = parseObject(g);
        Set<Entry<String, Object>> eset = map.entrySet();
        for (Entry<String, Object> e : eset) {
            System.out.println(e.getKey() + "#" + e.getValue());
        }

        System.out.println(g);
        System.out.println(g.toString());

//		ExpressRunner runner = new ExpressRunner();
//		try {
//			IExpressContext<String, Object> context =new DefaultContext<String, Object>(); 
//			context.put("nu_m1", true);
//			context.put("nu_m2", 1);
//			//Object o = runner.execute("nu_m1 +nu_m2 == 2", context, null, true, false);
//			Object o = runner.execute("nu_m1 == false", context, null, true, false);
//			System.out.println(o);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		int i = 0;
//		int j = 0;
//		tag: while(i < 10){
//			System.out.println("i:" + i);
//			while(j < 5){
//				System.out.println("j:" + j);
//				if(j == 3){
//					System.out.println("break");
//					j = 0;
//					break tag;
//				}
//				j++;
//			}
//			i++;
//		}
    }

}


