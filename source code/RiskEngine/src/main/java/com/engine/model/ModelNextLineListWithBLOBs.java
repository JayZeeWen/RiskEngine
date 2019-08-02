package com.engine.model;

public class ModelNextLineListWithBLOBs extends ModelNextLineList {
    /**
     * 表达式
     */
    private String exp;

    /**
     * 参数
     */
    private String params;

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
     * 参数
     * @return params 参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 参数
     * @param params 参数
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
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