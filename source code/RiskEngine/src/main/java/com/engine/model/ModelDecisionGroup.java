package com.engine.model;

import java.math.BigDecimal;
import java.util.Date;

public class ModelDecisionGroup {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String modelId;

    /**
     * 模型项id
     */
    private String modelItemId;

    /**
     * 
     */
    private String groupName;

    /**
     * 
     */
    private String groupDesc;

    /**
     * 对应xml配置的gid
     */
    private String groupNo;

    /**
     * 是否该组开始
     */
    private Boolean isStart;

    /**
     * 标签
     */
    private String tag;

    /**
     * 分值
     */
    private BigDecimal points;

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
     * @return model_id 
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 
     * @param modelId 
     */
    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    /**
     * 模型项id
     * @return model_item_id 模型项id
     */
    public String getModelItemId() {
        return modelItemId;
    }

    /**
     * 模型项id
     * @param modelItemId 模型项id
     */
    public void setModelItemId(String modelItemId) {
        this.modelItemId = modelItemId == null ? null : modelItemId.trim();
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
     * 对应xml配置的gid
     * @return group_no 对应xml配置的gid
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * 对应xml配置的gid
     * @param groupNo 对应xml配置的gid
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo == null ? null : groupNo.trim();
    }

    /**
     * 是否该组开始
     * @return is_start 是否该组开始
     */
    public Boolean getIsStart() {
        return isStart;
    }

    /**
     * 是否该组开始
     * @param isStart 是否该组开始
     */
    public void setIsStart(Boolean isStart) {
        this.isStart = isStart;
    }

    /**
     * 标签
     * @return tag 标签
     */
    public String getTag() {
        return tag;
    }

    /**
     * 标签
     * @param tag 标签
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * 分值
     * @return points 分值
     */
    public BigDecimal getPoints() {
        return points;
    }

    /**
     * 分值
     * @param points 分值
     */
    public void setPoints(BigDecimal points) {
        this.points = points;
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