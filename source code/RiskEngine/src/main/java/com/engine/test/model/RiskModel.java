package com.engine.test.model;

import java.util.Date;

public class RiskModel {
    /**
     * 主键
     */
    private String id;

    /**
     * 模型表述
     */
    private String modelDesc;

    /**
     * 模型类型 0准入  1反欺诈   2评分 
     */
    private String modelType;

    /**
     * 激活状态 1 激活 0 停用
     */
    private String active;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 
     */
    private String version;

    /**
     * 模型配置
     */
    private String config;

    /**
     * 主键
     * @return id 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 模型表述
     * @return model_desc 模型表述
     */
    public String getModelDesc() {
        return modelDesc;
    }

    /**
     * 模型表述
     * @param modelDesc 模型表述
     */
    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc == null ? null : modelDesc.trim();
    }

    /**
     * 模型类型 0准入  1反欺诈   2评分 
     * @return model_type 模型类型 0准入  1反欺诈   2评分 
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * 模型类型 0准入  1反欺诈   2评分 
     * @param modelType 模型类型 0准入  1反欺诈   2评分 
     */
    public void setModelType(String modelType) {
        this.modelType = modelType == null ? null : modelType.trim();
    }

    /**
     * 激活状态 1 激活 0 停用
     * @return active 激活状态 1 激活 0 停用
     */
    public String getActive() {
        return active;
    }

    /**
     * 激活状态 1 激活 0 停用
     * @param active 激活状态 1 激活 0 停用
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * 创建时间
     * @return created 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 创建时间
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 更新时间
     * @return updated 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 更新时间
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 
     * @return version 
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 模型配置
     * @return config 模型配置
     */
    public String getConfig() {
        return config;
    }

    /**
     * 模型配置
     * @param config 模型配置
     */
    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}