package com.engine.model;

import java.util.Date;

public class ModelNextLineList {
    /**
     * 
     */
    private String id;

    /**
     * 模型项id
     */
    private String modelId;

    /**
     * 前节点
     */
    private String preId;

    /**
     * 后节点
     */
    private String nextId;

    /**
     * 0 :item    1 : group
     */
    private Integer lineType;

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
     * 前节点
     * @return pre_id 前节点
     */
    public String getPreId() {
        return preId;
    }

    /**
     * 前节点
     * @param preId 前节点
     */
    public void setPreId(String preId) {
        this.preId = preId == null ? null : preId.trim();
    }

    /**
     * 后节点
     * @return next_id 后节点
     */
    public String getNextId() {
        return nextId;
    }

    /**
     * 后节点
     * @param nextId 后节点
     */
    public void setNextId(String nextId) {
        this.nextId = nextId == null ? null : nextId.trim();
    }

    /**
     * 0 :item    1 : group
     * @return line_type 0 :item    1 : group
     */
    public Integer getLineType() {
        return lineType;
    }

    /**
     * 0 :item    1 : group
     * @param lineType 0 :item    1 : group
     */
    public void setLineType(Integer lineType) {
        this.lineType = lineType;
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