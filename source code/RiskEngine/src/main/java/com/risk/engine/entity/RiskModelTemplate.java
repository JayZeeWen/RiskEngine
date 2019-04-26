package com.risk.engine.entity;

import java.util.List;
import java.util.Map;

public class RiskModelTemplate {
	
	private String id;
	
	private String modelName ; 
	
	private List<Item> orders;
	
	private Map<String, Group> decisions;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setModelName(String name){
		this.modelName = name;
	}

	public List<Item> getOrders() {
		return orders;
	}

	public void setOrders(List<Item> orders) {
		this.orders = orders;
	}

	public Map<String, Group> getDecisions() {
		return decisions;
	}
	
	public String getModelName() {
		return modelName;
	}

	public void setDecisions(Map<String, Group> decisions) {
		this.decisions = decisions;
	}

}
