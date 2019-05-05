package com.risk.engine.entity;



/**
 * 自定义参数
 * @author tfs
 *
 */
public class RiskParam {
	

	/**
	 * 单张贷记卡或贷款最近5年内逾期月份
	 */
	private int single5yearOverCount ;

	public int getSingle5yearOverCount() {
		return single5yearOverCount;
	}

	public void setSingle5yearOverCount(int single5yearOverCount) {
		this.single5yearOverCount = single5yearOverCount;
	}
	
	
}
