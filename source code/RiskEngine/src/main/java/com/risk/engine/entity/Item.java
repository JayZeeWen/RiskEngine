package com.risk.engine.entity;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

/**
 * item配置类型定义
 * @author Peter 马克
 *
 */
public class Item {
	
	private String name;
	
	private String desc;
	
	private String id;
	
	private int order;
	
	private boolean refuse;
	
	private boolean refuseBreak;
	
	private BigDecimal points;
	
	private String expression;
	
	private List<String> paramNames;
	
	private String refuseReason;
	
	private String paramDescs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public boolean isRefuse() {
		return refuse;
	}

	public void setRefuse(boolean refuse) {
		this.refuse = refuse;
	}

	public BigDecimal getPoints() {
		return points;
	}

	public void setPoints(BigDecimal points) {
		this.points = points;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<String> getParamNames() {
		return paramNames;
	}

	public void setParamNames(List<String> paramNames) {
		this.paramNames = paramNames;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getParamDescs() {
		return paramDescs;
	}

	public void setParamDescs(String paramDescs) {
		this.paramDescs = paramDescs;
	}

	public boolean isRefuseBreak() {
		return refuseBreak;
	}

	public void setRefuseBreak(boolean refuseBreak) {
		this.refuseBreak = refuseBreak;
	}
	
	

}

