package com.risk.engine.entity;

public interface EngineConstant {

    public final static String Continue = "continue";

    public final static String Break = "break";

    public final static int NextLineType_GroupNext = 1;

    public final static int NextLineType_GroupItemNext = 0;

    public final static int ModelItemType_Order = 1 ;

    public final static int ModelItemType_Group = 2 ;

    /**
     * 连接线类型  -- group
     */
    public final static int ModelNextLingType_Group = 1 ;

    /**
     * 连接线类型  -- item
     */
    public final static int ModelNextLingType_Item = 0 ;
}
