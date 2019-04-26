package com.engine.test.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUrgeFollowRecordExample {
    /**
     * t_urge_follow_record
     */
    protected String orderByClause;

    /**
     * t_urge_follow_record
     */
    protected boolean distinct;

    /**
     * t_urge_follow_record
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public TUrgeFollowRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * t_urge_follow_record 2019-04-26
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUrgeResultIsNull() {
            addCriterion("urge_result is null");
            return (Criteria) this;
        }

        public Criteria andUrgeResultIsNotNull() {
            addCriterion("urge_result is not null");
            return (Criteria) this;
        }

        public Criteria andUrgeResultEqualTo(String value) {
            addCriterion("urge_result =", value, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultNotEqualTo(String value) {
            addCriterion("urge_result <>", value, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultGreaterThan(String value) {
            addCriterion("urge_result >", value, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultGreaterThanOrEqualTo(String value) {
            addCriterion("urge_result >=", value, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultLessThan(String value) {
            addCriterion("urge_result <", value, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultLessThanOrEqualTo(String value) {
            addCriterion("urge_result <=", value, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultLike(String value) {
            addCriterion("urge_result like", value, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultNotLike(String value) {
            addCriterion("urge_result not like", value, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultIn(List<String> values) {
            addCriterion("urge_result in", values, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultNotIn(List<String> values) {
            addCriterion("urge_result not in", values, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultBetween(String value1, String value2) {
            addCriterion("urge_result between", value1, value2, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andUrgeResultNotBetween(String value1, String value2) {
            addCriterion("urge_result not between", value1, value2, "urgeResult");
            return (Criteria) this;
        }

        public Criteria andFollowModeIsNull() {
            addCriterion("follow_mode is null");
            return (Criteria) this;
        }

        public Criteria andFollowModeIsNotNull() {
            addCriterion("follow_mode is not null");
            return (Criteria) this;
        }

        public Criteria andFollowModeEqualTo(String value) {
            addCriterion("follow_mode =", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeNotEqualTo(String value) {
            addCriterion("follow_mode <>", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeGreaterThan(String value) {
            addCriterion("follow_mode >", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeGreaterThanOrEqualTo(String value) {
            addCriterion("follow_mode >=", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeLessThan(String value) {
            addCriterion("follow_mode <", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeLessThanOrEqualTo(String value) {
            addCriterion("follow_mode <=", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeLike(String value) {
            addCriterion("follow_mode like", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeNotLike(String value) {
            addCriterion("follow_mode not like", value, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeIn(List<String> values) {
            addCriterion("follow_mode in", values, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeNotIn(List<String> values) {
            addCriterion("follow_mode not in", values, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeBetween(String value1, String value2) {
            addCriterion("follow_mode between", value1, value2, "followMode");
            return (Criteria) this;
        }

        public Criteria andFollowModeNotBetween(String value1, String value2) {
            addCriterion("follow_mode not between", value1, value2, "followMode");
            return (Criteria) this;
        }

        public Criteria andContCategIsNull() {
            addCriterion("cont_categ is null");
            return (Criteria) this;
        }

        public Criteria andContCategIsNotNull() {
            addCriterion("cont_categ is not null");
            return (Criteria) this;
        }

        public Criteria andContCategEqualTo(String value) {
            addCriterion("cont_categ =", value, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategNotEqualTo(String value) {
            addCriterion("cont_categ <>", value, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategGreaterThan(String value) {
            addCriterion("cont_categ >", value, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategGreaterThanOrEqualTo(String value) {
            addCriterion("cont_categ >=", value, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategLessThan(String value) {
            addCriterion("cont_categ <", value, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategLessThanOrEqualTo(String value) {
            addCriterion("cont_categ <=", value, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategLike(String value) {
            addCriterion("cont_categ like", value, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategNotLike(String value) {
            addCriterion("cont_categ not like", value, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategIn(List<String> values) {
            addCriterion("cont_categ in", values, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategNotIn(List<String> values) {
            addCriterion("cont_categ not in", values, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategBetween(String value1, String value2) {
            addCriterion("cont_categ between", value1, value2, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContCategNotBetween(String value1, String value2) {
            addCriterion("cont_categ not between", value1, value2, "contCateg");
            return (Criteria) this;
        }

        public Criteria andContTelIsNull() {
            addCriterion("cont_tel is null");
            return (Criteria) this;
        }

        public Criteria andContTelIsNotNull() {
            addCriterion("cont_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContTelEqualTo(String value) {
            addCriterion("cont_tel =", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotEqualTo(String value) {
            addCriterion("cont_tel <>", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelGreaterThan(String value) {
            addCriterion("cont_tel >", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelGreaterThanOrEqualTo(String value) {
            addCriterion("cont_tel >=", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLessThan(String value) {
            addCriterion("cont_tel <", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLessThanOrEqualTo(String value) {
            addCriterion("cont_tel <=", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLike(String value) {
            addCriterion("cont_tel like", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotLike(String value) {
            addCriterion("cont_tel not like", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelIn(List<String> values) {
            addCriterion("cont_tel in", values, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotIn(List<String> values) {
            addCriterion("cont_tel not in", values, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelBetween(String value1, String value2) {
            addCriterion("cont_tel between", value1, value2, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotBetween(String value1, String value2) {
            addCriterion("cont_tel not between", value1, value2, "contTel");
            return (Criteria) this;
        }

        public Criteria andDecideModeIsNull() {
            addCriterion("decide_mode is null");
            return (Criteria) this;
        }

        public Criteria andDecideModeIsNotNull() {
            addCriterion("decide_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDecideModeEqualTo(String value) {
            addCriterion("decide_mode =", value, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeNotEqualTo(String value) {
            addCriterion("decide_mode <>", value, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeGreaterThan(String value) {
            addCriterion("decide_mode >", value, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeGreaterThanOrEqualTo(String value) {
            addCriterion("decide_mode >=", value, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeLessThan(String value) {
            addCriterion("decide_mode <", value, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeLessThanOrEqualTo(String value) {
            addCriterion("decide_mode <=", value, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeLike(String value) {
            addCriterion("decide_mode like", value, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeNotLike(String value) {
            addCriterion("decide_mode not like", value, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeIn(List<String> values) {
            addCriterion("decide_mode in", values, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeNotIn(List<String> values) {
            addCriterion("decide_mode not in", values, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeBetween(String value1, String value2) {
            addCriterion("decide_mode between", value1, value2, "decideMode");
            return (Criteria) this;
        }

        public Criteria andDecideModeNotBetween(String value1, String value2) {
            addCriterion("decide_mode not between", value1, value2, "decideMode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdIsNull() {
            addCriterion("urge_coner_id is null");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdIsNotNull() {
            addCriterion("urge_coner_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdEqualTo(String value) {
            addCriterion("urge_coner_id =", value, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdNotEqualTo(String value) {
            addCriterion("urge_coner_id <>", value, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdGreaterThan(String value) {
            addCriterion("urge_coner_id >", value, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdGreaterThanOrEqualTo(String value) {
            addCriterion("urge_coner_id >=", value, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdLessThan(String value) {
            addCriterion("urge_coner_id <", value, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdLessThanOrEqualTo(String value) {
            addCriterion("urge_coner_id <=", value, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdLike(String value) {
            addCriterion("urge_coner_id like", value, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdNotLike(String value) {
            addCriterion("urge_coner_id not like", value, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdIn(List<String> values) {
            addCriterion("urge_coner_id in", values, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdNotIn(List<String> values) {
            addCriterion("urge_coner_id not in", values, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdBetween(String value1, String value2) {
            addCriterion("urge_coner_id between", value1, value2, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerIdNotBetween(String value1, String value2) {
            addCriterion("urge_coner_id not between", value1, value2, "urgeConerId");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameIsNull() {
            addCriterion("urge_coner_name is null");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameIsNotNull() {
            addCriterion("urge_coner_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameEqualTo(String value) {
            addCriterion("urge_coner_name =", value, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameNotEqualTo(String value) {
            addCriterion("urge_coner_name <>", value, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameGreaterThan(String value) {
            addCriterion("urge_coner_name >", value, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameGreaterThanOrEqualTo(String value) {
            addCriterion("urge_coner_name >=", value, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameLessThan(String value) {
            addCriterion("urge_coner_name <", value, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameLessThanOrEqualTo(String value) {
            addCriterion("urge_coner_name <=", value, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameLike(String value) {
            addCriterion("urge_coner_name like", value, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameNotLike(String value) {
            addCriterion("urge_coner_name not like", value, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameIn(List<String> values) {
            addCriterion("urge_coner_name in", values, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameNotIn(List<String> values) {
            addCriterion("urge_coner_name not in", values, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameBetween(String value1, String value2) {
            addCriterion("urge_coner_name between", value1, value2, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andUrgeConerNameNotBetween(String value1, String value2) {
            addCriterion("urge_coner_name not between", value1, value2, "urgeConerName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTempViewIsNull() {
            addCriterion("temp_view is null");
            return (Criteria) this;
        }

        public Criteria andTempViewIsNotNull() {
            addCriterion("temp_view is not null");
            return (Criteria) this;
        }

        public Criteria andTempViewEqualTo(String value) {
            addCriterion("temp_view =", value, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewNotEqualTo(String value) {
            addCriterion("temp_view <>", value, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewGreaterThan(String value) {
            addCriterion("temp_view >", value, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewGreaterThanOrEqualTo(String value) {
            addCriterion("temp_view >=", value, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewLessThan(String value) {
            addCriterion("temp_view <", value, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewLessThanOrEqualTo(String value) {
            addCriterion("temp_view <=", value, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewLike(String value) {
            addCriterion("temp_view like", value, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewNotLike(String value) {
            addCriterion("temp_view not like", value, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewIn(List<String> values) {
            addCriterion("temp_view in", values, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewNotIn(List<String> values) {
            addCriterion("temp_view not in", values, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewBetween(String value1, String value2) {
            addCriterion("temp_view between", value1, value2, "tempView");
            return (Criteria) this;
        }

        public Criteria andTempViewNotBetween(String value1, String value2) {
            addCriterion("temp_view not between", value1, value2, "tempView");
            return (Criteria) this;
        }
    }

    /**
     * t_urge_follow_record
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * t_urge_follow_record 2019-04-26
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}