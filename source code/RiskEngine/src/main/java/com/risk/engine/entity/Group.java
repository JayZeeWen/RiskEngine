package com.risk.engine.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * group定义
 * @author Peter 马克
 *
 */
public class Group {
	
	private String name;
	
	private String desc;

	private String gid;
	
//	private String togid;
	
	private boolean start;
	
	private List<GItem> items;
	
	private BigDecimal points;
	
	private List<Next> nextList;

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

//	public String getTogid() {
//		return togid;
//	}
//
//	public void setTogid(String togid) {
//		this.togid = togid;
//	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public List<GItem> getItems() {
		return items;
	}

	public void setItems(List<GItem> items) {
		this.items = items;
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

	public BigDecimal getPoints() {
		return points;
	}

	public void setPoints(BigDecimal points) {
		this.points = points;
	}

	public List<Next> getNextList() {
		return nextList;
	}

	public void setNextList(List<Next> nextList) {
		this.nextList = nextList;
	}
	
}
