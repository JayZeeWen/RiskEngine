package com.risk.engine.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * group 下item配置类型定义
 * @author JayZee 文
 *
 */
public class GItem {
	
	private String name;
	
	private String desc;
	
	private String id;
	
	//private String toid;
	
	private String turecontinue;

	private String falsecontinue;
	
	private String parentfalsecontinue;
	
	private boolean start;
	
	private BigDecimal points;
	
	private String expression;
	
	private List<String> paramNames;
	
	private List<Next> nextList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public String getToid() {
//		return toid;
//	}
//
//	public void setToid(String toid) {
//		this.toid = toid;
//	}

	public String getFalsecontinue() {
		return falsecontinue;
	}

	public void setFalsecontinue(String falsecontinue) {
		this.falsecontinue = falsecontinue;
	}

	public String getParentfalsecontinue() {
		return parentfalsecontinue;
	}

	public void setParentfalsecontinue(String parentfalsecontinue) {
		this.parentfalsecontinue = parentfalsecontinue;
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
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

	public List<Next> getNextList() {
		return nextList;
	}

	public void setNextList(List<Next> nextList) {
		this.nextList = nextList;
	}
	
	public String getTurecontinue() {
		return turecontinue;
	}

	public void setTurecontinue(String turecontinue) {
		this.turecontinue = turecontinue;
	}
	
	

}
