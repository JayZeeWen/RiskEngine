package com.engine.model;

import java.math.BigDecimal;
import java.util.Date;

public class ModelOrderItem {
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
    private String name;

    /**
     * 
     */
    private String descri;

    /**
     * 对应xml配置的id
     */
    private String itemNo;

    /**
     * 排序 （ 对应配置中的 order）
     */
    private Integer sort;

    /**
     * 是否继续执行
     */
    private Boolean isRefuse;

    /**
     * 分值
     */
    private BigDecimal points;

    /**
     * 标签
     */
    private String tag;

    /**
     * 参数（以 逗号分隔）
     */
    private String params;

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
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return descri 
     */
    public String getDescri() {
        return descri;
    }

    /**
     * 
     * @param descri 
     */
    public void setDescri(String descri) {
        this.descri = descri == null ? null : descri.trim();
    }

    /**
     * 对应xml配置的id
     * @return item_no 对应xml配置的id
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * 对应xml配置的id
     * @param itemNo 对应xml配置的id
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    /**
     * 排序 （ 对应配置中的 order）
     * @return sort 排序 （ 对应配置中的 order）
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序 （ 对应配置中的 order）
     * @param sort 排序 （ 对应配置中的 order）
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 是否继续执行
     * @return is_refuse 是否继续执行
     */
    public Boolean getIsRefuse() {
        return isRefuse;
    }

    /**
     * 是否继续执行
     * @param isRefuse 是否继续执行
     */
    public void setIsRefuse(Boolean isRefuse) {
        this.isRefuse = isRefuse;
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
     * 参数（以 逗号分隔）
     * @return params 参数（以 逗号分隔）
     */
    public String getParams() {
        return params;
    }

    /**
     * 参数（以 逗号分隔）
     * @param params 参数（以 逗号分隔）
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
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