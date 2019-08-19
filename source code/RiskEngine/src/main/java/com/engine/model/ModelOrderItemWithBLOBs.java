package com.engine.model;

public class ModelOrderItemWithBLOBs extends ModelOrderItem {
    /**
     * 表达式
     */
    private String exp;

    /**
     * 参数名称   （例子：UcBasicInfo_age=年龄,UcBasicInfo_gender=性别 ）
     */
    private String paramNames;

    /**
     * 表达式
     * @return exp 表达式
     */
    public String getExp() {
        return exp;
    }

    /**
     * 表达式
     * @param exp 表达式
     */
    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    /**
     * 参数名称   （例子：UcBasicInfo_age=年龄,UcBasicInfo_gender=性别 ）
     * @return param_names 参数名称   （例子：UcBasicInfo_age=年龄,UcBasicInfo_gender=性别 ）
     */
    public String getParamNames() {
        return paramNames;
    }

    /**
     * 参数名称   （例子：UcBasicInfo_age=年龄,UcBasicInfo_gender=性别 ）
     * @param paramNames 参数名称   （例子：UcBasicInfo_age=年龄,UcBasicInfo_gender=性别 ）
     */
    public void setParamNames(String paramNames) {
        this.paramNames = paramNames == null ? null : paramNames.trim();
    }
}