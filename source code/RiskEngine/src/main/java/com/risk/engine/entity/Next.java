package com.risk.engine.entity;

import java.util.List;

/**
 * 下一节点信息
 * @author Peter 马克
 *
 */
public class Next {
	
	private String id;
	
	private String expression;
	
	private List<String> paramNames;
	
	/**
	 * 创建对象
	 * @return
	 */
	public static Next create(){
		return new Next();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public List<String> getParamNames() {
		return paramNames;
	}

	public void setParamNames(List<String> paramNames) {
		this.paramNames = paramNames;
	}

}
