package com.engine.model;

import java.math.BigDecimal;
import java.util.Date;

public class ModleGroupItem {
    /**
     * 
     */
    private String id;

    /**
     * 模型orderId
     */
    private String groupId;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String descri;

    /**
     * 对应xml配置的id
     */
    private String itemNo;

    /**
     * 排序(对应配置中的order)
     */
    private Integer sort;

    /**
     * 
     */
    private Boolean start;

    /**
     * 未命中是否跳出group（continue     break）
     */
    private String falseContinue;

    /**
     * 命中是否跳出group   （continue     break）
     */
    private String trueContinue;

    /**
     * 标签
     */
    private String tag;

    /**
     * 
     */
    private String parentFalsecontinue;

    /**
     * 分值
     */
    private BigDecimal points;

    /**
     * 表达式
     */
    private String exp;

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
     * 参数名称   （例子：UcBasicInfo_age=年龄,UcBasicInfo_gender=性别 ）
     */
    private String paramNames;

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
     * 模型orderId
     * @return group_id 模型orderId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 模型orderId
     * @param groupId 模型orderId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 描述
     * @return descri 描述
     */
    public String getDescri() {
        return descri;
    }

    /**
     * 描述
     * @param descri 描述
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
     * 排序(对应配置中的order)
     * @return sort 排序(对应配置中的order)
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序(对应配置中的order)
     * @param sort 排序(对应配置中的order)
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 
     * @return start 
     */
    public Boolean getStart() {
        return start;
    }

    /**
     * 
     * @param start 
     */
    public void setStart(Boolean start) {
        this.start = start;
    }

    /**
     * 未命中是否跳出group（continue     break）
     * @return false_continue 未命中是否跳出group（continue     break）
     */
    public String getFalseContinue() {
        return falseContinue;
    }

    /**
     * 未命中是否跳出group（continue     break）
     * @param falseContinue 未命中是否跳出group（continue     break）
     */
    public void setFalseContinue(String falseContinue) {
        this.falseContinue = falseContinue == null ? null : falseContinue.trim();
    }

    /**
     * 命中是否跳出group   （continue     break）
     * @return true_continue 命中是否跳出group   （continue     break）
     */
    public String getTrueContinue() {
        return trueContinue;
    }

    /**
     * 命中是否跳出group   （continue     break）
     * @param trueContinue 命中是否跳出group   （continue     break）
     */
    public void setTrueContinue(String trueContinue) {
        this.trueContinue = trueContinue == null ? null : trueContinue.trim();
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
     * 
     * @return parent_falsecontinue 
     */
    public String getParentFalsecontinue() {
        return parentFalsecontinue;
    }

    /**
     * 
     * @param parentFalsecontinue 
     */
    public void setParentFalsecontinue(String parentFalsecontinue) {
        this.parentFalsecontinue = parentFalsecontinue == null ? null : parentFalsecontinue.trim();
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