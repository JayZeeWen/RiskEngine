package com.engine.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModleDecisionGroupExample {
    /**
     * modle_decision_group
     */
    protected String orderByClause;

    /**
     * modle_decision_group
     */
    protected boolean distinct;

    /**
     * modle_decision_group
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public ModleDecisionGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-08-02
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
     * @mbggenerated 2019-08-02
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-08-02
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * modle_decision_group 2019-08-02
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(String value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(String value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(String value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(String value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(String value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(String value) {
            addCriterion("model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(String value) {
            addCriterion("model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<String> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<String> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(String value1, String value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(String value1, String value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdIsNull() {
            addCriterion("model_item_id is null");
            return (Criteria) this;
        }

        public Criteria andModelItemIdIsNotNull() {
            addCriterion("model_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelItemIdEqualTo(String value) {
            addCriterion("model_item_id =", value, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdNotEqualTo(String value) {
            addCriterion("model_item_id <>", value, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdGreaterThan(String value) {
            addCriterion("model_item_id >", value, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("model_item_id >=", value, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdLessThan(String value) {
            addCriterion("model_item_id <", value, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdLessThanOrEqualTo(String value) {
            addCriterion("model_item_id <=", value, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdLike(String value) {
            addCriterion("model_item_id like", value, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdNotLike(String value) {
            addCriterion("model_item_id not like", value, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdIn(List<String> values) {
            addCriterion("model_item_id in", values, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdNotIn(List<String> values) {
            addCriterion("model_item_id not in", values, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdBetween(String value1, String value2) {
            addCriterion("model_item_id between", value1, value2, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andModelItemIdNotBetween(String value1, String value2) {
            addCriterion("model_item_id not between", value1, value2, "modelItemId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupDescIsNull() {
            addCriterion("group_desc is null");
            return (Criteria) this;
        }

        public Criteria andGroupDescIsNotNull() {
            addCriterion("group_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDescEqualTo(String value) {
            addCriterion("group_desc =", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotEqualTo(String value) {
            addCriterion("group_desc <>", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescGreaterThan(String value) {
            addCriterion("group_desc >", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescGreaterThanOrEqualTo(String value) {
            addCriterion("group_desc >=", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLessThan(String value) {
            addCriterion("group_desc <", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLessThanOrEqualTo(String value) {
            addCriterion("group_desc <=", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLike(String value) {
            addCriterion("group_desc like", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotLike(String value) {
            addCriterion("group_desc not like", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescIn(List<String> values) {
            addCriterion("group_desc in", values, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotIn(List<String> values) {
            addCriterion("group_desc not in", values, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescBetween(String value1, String value2) {
            addCriterion("group_desc between", value1, value2, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotBetween(String value1, String value2) {
            addCriterion("group_desc not between", value1, value2, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupNoIsNull() {
            addCriterion("group_no is null");
            return (Criteria) this;
        }

        public Criteria andGroupNoIsNotNull() {
            addCriterion("group_no is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNoEqualTo(String value) {
            addCriterion("group_no =", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoNotEqualTo(String value) {
            addCriterion("group_no <>", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoGreaterThan(String value) {
            addCriterion("group_no >", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoGreaterThanOrEqualTo(String value) {
            addCriterion("group_no >=", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoLessThan(String value) {
            addCriterion("group_no <", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoLessThanOrEqualTo(String value) {
            addCriterion("group_no <=", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoLike(String value) {
            addCriterion("group_no like", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoNotLike(String value) {
            addCriterion("group_no not like", value, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoIn(List<String> values) {
            addCriterion("group_no in", values, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoNotIn(List<String> values) {
            addCriterion("group_no not in", values, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoBetween(String value1, String value2) {
            addCriterion("group_no between", value1, value2, "groupNo");
            return (Criteria) this;
        }

        public Criteria andGroupNoNotBetween(String value1, String value2) {
            addCriterion("group_no not between", value1, value2, "groupNo");
            return (Criteria) this;
        }

        public Criteria andIsStartIsNull() {
            addCriterion("is_start is null");
            return (Criteria) this;
        }

        public Criteria andIsStartIsNotNull() {
            addCriterion("is_start is not null");
            return (Criteria) this;
        }

        public Criteria andIsStartEqualTo(Boolean value) {
            addCriterion("is_start =", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotEqualTo(Boolean value) {
            addCriterion("is_start <>", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartGreaterThan(Boolean value) {
            addCriterion("is_start >", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_start >=", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartLessThan(Boolean value) {
            addCriterion("is_start <", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartLessThanOrEqualTo(Boolean value) {
            addCriterion("is_start <=", value, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartIn(List<Boolean> values) {
            addCriterion("is_start in", values, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotIn(List<Boolean> values) {
            addCriterion("is_start not in", values, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartBetween(Boolean value1, Boolean value2) {
            addCriterion("is_start between", value1, value2, "isStart");
            return (Criteria) this;
        }

        public Criteria andIsStartNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_start not between", value1, value2, "isStart");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(BigDecimal value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(BigDecimal value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(BigDecimal value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(BigDecimal value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<BigDecimal> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<BigDecimal> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * modle_decision_group
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * modle_decision_group 2019-08-02
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