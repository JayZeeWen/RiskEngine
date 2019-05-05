package com.engine.model;


public class ModelResultHitItemExt  extends ModelResultHitItem {

	/**
	 * 传入值详情
	 */
	private String valueDetail;
	
	/**
	 * 处理方式
	 */
	private String dealWay;

	public String getValueDetail() {
		return valueDetail;
	}

	public void setValueDetail(String valueDetail) {
		this.valueDetail = valueDetail;
	}

	public String getDealWay() {
		return dealWay;
	}

	public void setDealWay(String dealWay) {
		this.dealWay = dealWay;
	}
	
}
