package com.risk.engine.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.engine.test.model.ModelResultHitItem;
import com.engine.test.util.MathUtils;


/**
 * 引擎执行结果
 * @author Peter 马克
 *
 */
public class Result implements Serializable{

	/**
	 * 是否通过
	 */
	private boolean pass;
	
	/**
	 * 总分值 orderPoints + decisionPoints
	 */
	private BigDecimal points;
	
	/**
	 * 序列分值
	 */
	private BigDecimal orderPoints;
	
	/**
	 * 决策树分值
	 */
	private BigDecimal decisionPoints;
	
	/**
	 * 模型执行 过程消息
	 */
	private List<String> messages;
	
	/**
	 * 拒绝原因id
	 */
	private List<String> refuseReason;
	
	private List<ModelResultHitItem> hitItems;
	
	public static Result create(){
		Result r = new Result();
		r.setMessages(new ArrayList<>());
		return r;
	}

	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}

	public BigDecimal getPoints() {
		return points;
	}

	private void setPoints() {
		
		this.points =  MathUtils.defaultZero(this.decisionPoints).add(MathUtils.defaultZero(this.orderPoints));
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public BigDecimal getOrderPoints() {
		
		return MathUtils.defaultZero(orderPoints);
	}

	public void setOrderPoints(BigDecimal orderPoints) {
		this.orderPoints = orderPoints;
		setPoints();
	}

	public BigDecimal getDecisionPoints() {
		
		return MathUtils.defaultZero(decisionPoints);
	}

	public void setDecisionPoints(BigDecimal decisionPoints) {
		this.decisionPoints = decisionPoints;
		setPoints();
	}

	public List<ModelResultHitItem> getHitItems() {
		return hitItems;
	}

	public void setHitItems(List<ModelResultHitItem> hitItems) {
		this.hitItems = hitItems;
	}

	public void setPoints(BigDecimal points) {
		this.points = points;
	}

	public List<String> getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(List<String> refuseReason) {
		this.refuseReason = refuseReason;
	}
	
	
	
	
	
}
