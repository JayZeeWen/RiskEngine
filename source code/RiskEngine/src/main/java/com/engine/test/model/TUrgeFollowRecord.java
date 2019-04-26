package com.engine.test.model;

import java.util.Date;

public class TUrgeFollowRecord {
    /**
     * 
     */
    private Integer id;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 催收结果
     */
    private String urgeResult;

    /**
     * 跟进方式
     */
    private String followMode;

    /**
     * 联系人类别
     */
    private String contCateg;

    /**
     * 联系电话
     */
    private String contTel;

    /**
     * 特殊案件类型(保留催收，外访，委外)
     */
    private String decideMode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 跟进人ID
     */
    private String urgeConerId;

    /**
     * 跟进人姓名
     */
    private String urgeConerName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 模板阅览
     */
    private String tempView;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 订单号
     * @return order_id 订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 订单号
     * @param orderId 订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 催收结果
     * @return urge_result 催收结果
     */
    public String getUrgeResult() {
        return urgeResult;
    }

    /**
     * 催收结果
     * @param urgeResult 催收结果
     */
    public void setUrgeResult(String urgeResult) {
        this.urgeResult = urgeResult == null ? null : urgeResult.trim();
    }

    /**
     * 跟进方式
     * @return follow_mode 跟进方式
     */
    public String getFollowMode() {
        return followMode;
    }

    /**
     * 跟进方式
     * @param followMode 跟进方式
     */
    public void setFollowMode(String followMode) {
        this.followMode = followMode == null ? null : followMode.trim();
    }

    /**
     * 联系人类别
     * @return cont_categ 联系人类别
     */
    public String getContCateg() {
        return contCateg;
    }

    /**
     * 联系人类别
     * @param contCateg 联系人类别
     */
    public void setContCateg(String contCateg) {
        this.contCateg = contCateg == null ? null : contCateg.trim();
    }

    /**
     * 联系电话
     * @return cont_tel 联系电话
     */
    public String getContTel() {
        return contTel;
    }

    /**
     * 联系电话
     * @param contTel 联系电话
     */
    public void setContTel(String contTel) {
        this.contTel = contTel == null ? null : contTel.trim();
    }

    /**
     * 特殊案件类型(保留催收，外访，委外)
     * @return decide_mode 特殊案件类型(保留催收，外访，委外)
     */
    public String getDecideMode() {
        return decideMode;
    }

    /**
     * 特殊案件类型(保留催收，外访，委外)
     * @param decideMode 特殊案件类型(保留催收，外访，委外)
     */
    public void setDecideMode(String decideMode) {
        this.decideMode = decideMode == null ? null : decideMode.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 跟进人ID
     * @return urge_coner_id 跟进人ID
     */
    public String getUrgeConerId() {
        return urgeConerId;
    }

    /**
     * 跟进人ID
     * @param urgeConerId 跟进人ID
     */
    public void setUrgeConerId(String urgeConerId) {
        this.urgeConerId = urgeConerId == null ? null : urgeConerId.trim();
    }

    /**
     * 跟进人姓名
     * @return urge_coner_name 跟进人姓名
     */
    public String getUrgeConerName() {
        return urgeConerName;
    }

    /**
     * 跟进人姓名
     * @param urgeConerName 跟进人姓名
     */
    public void setUrgeConerName(String urgeConerName) {
        this.urgeConerName = urgeConerName == null ? null : urgeConerName.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 模板阅览
     * @return temp_view 模板阅览
     */
    public String getTempView() {
        return tempView;
    }

    /**
     * 模板阅览
     * @param tempView 模板阅览
     */
    public void setTempView(String tempView) {
        this.tempView = tempView == null ? null : tempView.trim();
    }
}