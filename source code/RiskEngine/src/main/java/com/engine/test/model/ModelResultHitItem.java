package com.engine.test.model;

import java.math.BigDecimal;
import java.util.Date;

public class ModelResultHitItem {
    /**
     * 
     */
    private String id;

    /**
     * 风控模型授信表id
     */
    private String resultId;

    /**
     * 模型id
     */
    private String modeId;

    /**
     * 
     */
    private String hitItemId;

    /**
     * 
     */
    private String hitItemDesc;

    /**
     * 
     */
    private String groupId;

    /**
     * 
     */
    private String groupName;

    /**
     * 
     */
    private String groupDesc;

    /**
     * 
     */
    private BigDecimal points;

    /**
     * 是否命中
     */
    private String isHit;

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
     */
    private String refuseReason;

    /**
     * 
     */
    private String params;

    /**
     * 
     */
    private String paramName;

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
     * 风控模型授信表id
     * @return result_id 风控模型授信表id
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * 风控模型授信表id
     * @param resultId 风控模型授信表id
     */
    public void setResultId(String resultId) {
        this.resultId = resultId == null ? null : resultId.trim();
    }

    /**
     * 模型id
     * @return mode_id 模型id
     */
    public String getModeId() {
        return modeId;
    }

    /**
     * 模型id
     * @param modeId 模型id
     */
    public void setModeId(String modeId) {
        this.modeId = modeId == null ? null : modeId.trim();
    }

    /**
     * 
     * @return hit_item_id 
     */
    public String getHitItemId() {
        return hitItemId;
    }

    /**
     * 
     * @param hitItemId 
     */
    public void setHitItemId(String hitItemId) {
        this.hitItemId = hitItemId == null ? null : hitItemId.trim();
    }

    /**
     * 
     * @return hit_item_desc 
     */
    public String getHitItemDesc() {
        return hitItemDesc;
    }

    /**
     * 
     * @param hitItemDesc 
     */
    public void setHitItemDesc(String hitItemDesc) {
        this.hitItemDesc = hitItemDesc == null ? null : hitItemDesc.trim();
    }

    /**
     * 
     * @return group_id 
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId 
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * 
     * @return group_name 
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 
     * @param groupName 
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 
     * @return group_desc 
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * 
     * @param groupDesc 
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    /**
     * 
     * @return points 
     */
    public BigDecimal getPoints() {
        return points;
    }

    /**
     * 
     * @param points 
     */
    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    /**
     * 是否命中
     * @return is_hit 是否命中
     */
    public String getIsHit() {
        return isHit;
    }

    /**
     * 是否命中
     * @param isHit 是否命中
     */
    public void setIsHit(String isHit) {
        this.isHit = isHit == null ? null : isHit.trim();
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

    /**
     * 
     * @return refuse_reason 
     */
    public String getRefuseReason() {
        return refuseReason;
    }

    /**
     * 
     * @param refuseReason 
     */
    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason == null ? null : refuseReason.trim();
    }

    /**
     * 
     * @return params 
     */
    public String getParams() {
        return params;
    }

    /**
     * 
     * @param params 
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * 
     * @return param_name 
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 
     * @param paramName 
     */
    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }
}