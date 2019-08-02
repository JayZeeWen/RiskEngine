package com.engine.model;

import java.util.Date;

public class ModelItem {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String riskModeId;

    /**
     * 1 order  （顺序执行）  2 decisioin  （根据决策顺序执行）
     */
    private Integer type;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 
     * @return risk_mode_id 
     */
    public String getRiskModeId() {
        return riskModeId;
    }

    /**
     * 
     * @param riskModeId 
     */
    public void setRiskModeId(String riskModeId) {
        this.riskModeId = riskModeId == null ? null : riskModeId.trim();
    }

    /**
     * 1 order  （顺序执行）  2 decisioin  （根据决策顺序执行）
     * @return type 1 order  （顺序执行）  2 decisioin  （根据决策顺序执行）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 1 order  （顺序执行）  2 decisioin  （根据决策顺序执行）
     * @param type 1 order  （顺序执行）  2 decisioin  （根据决策顺序执行）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 
     * @return create_date 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 
     * @param createDate 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 
     * @return update_date 
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 
     * @param updateDate 
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}