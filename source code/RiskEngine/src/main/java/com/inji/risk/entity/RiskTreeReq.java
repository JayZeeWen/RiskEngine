package com.inji.risk.entity;

/**
 * 决策树请求参数
 * @author tfs
 *
 */
public class RiskTreeReq {

	/**
	 * 
	 */
	private String uid;
	
	/**
	 * 产品编号
	 */
	private String productCode; 
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * 身份证
	 */
	private String idcard;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 请求流水号
	 */
	private String requestNo;
	
	/**
	 * 节点类型：1-初审，2-终审
	 */
	private String type;
	
	/**
	 * 订单申请时间
	 */
	private String applyTime;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	
	
}
