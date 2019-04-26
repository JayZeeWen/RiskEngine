package com.engine.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UcBasicInfoExample {
    /**
     * uc_basic_info
     */
    protected String orderByClause;

    /**
     * uc_basic_info
     */
    protected boolean distinct;

    /**
     * uc_basic_info
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-04-26
     */
    public UcBasicInfoExample() {
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
     * uc_basic_info 2019-04-26
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("residence is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("residence is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("residence =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("residence <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("residence >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("residence >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("residence <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("residence <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("residence like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("residence not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("residence in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("residence not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("residence between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("residence not between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andMarryStateIsNull() {
            addCriterion("marry_state is null");
            return (Criteria) this;
        }

        public Criteria andMarryStateIsNotNull() {
            addCriterion("marry_state is not null");
            return (Criteria) this;
        }

        public Criteria andMarryStateEqualTo(String value) {
            addCriterion("marry_state =", value, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateNotEqualTo(String value) {
            addCriterion("marry_state <>", value, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateGreaterThan(String value) {
            addCriterion("marry_state >", value, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateGreaterThanOrEqualTo(String value) {
            addCriterion("marry_state >=", value, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateLessThan(String value) {
            addCriterion("marry_state <", value, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateLessThanOrEqualTo(String value) {
            addCriterion("marry_state <=", value, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateLike(String value) {
            addCriterion("marry_state like", value, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateNotLike(String value) {
            addCriterion("marry_state not like", value, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateIn(List<String> values) {
            addCriterion("marry_state in", values, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateNotIn(List<String> values) {
            addCriterion("marry_state not in", values, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateBetween(String value1, String value2) {
            addCriterion("marry_state between", value1, value2, "marryState");
            return (Criteria) this;
        }

        public Criteria andMarryStateNotBetween(String value1, String value2) {
            addCriterion("marry_state not between", value1, value2, "marryState");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("rent is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("rent is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(BigDecimal value) {
            addCriterion("rent =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(BigDecimal value) {
            addCriterion("rent <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(BigDecimal value) {
            addCriterion("rent >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rent >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(BigDecimal value) {
            addCriterion("rent <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rent <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<BigDecimal> values) {
            addCriterion("rent in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<BigDecimal> values) {
            addCriterion("rent not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent not between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andResiProvinceIsNull() {
            addCriterion("resi_province is null");
            return (Criteria) this;
        }

        public Criteria andResiProvinceIsNotNull() {
            addCriterion("resi_province is not null");
            return (Criteria) this;
        }

        public Criteria andResiProvinceEqualTo(String value) {
            addCriterion("resi_province =", value, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceNotEqualTo(String value) {
            addCriterion("resi_province <>", value, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceGreaterThan(String value) {
            addCriterion("resi_province >", value, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("resi_province >=", value, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceLessThan(String value) {
            addCriterion("resi_province <", value, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceLessThanOrEqualTo(String value) {
            addCriterion("resi_province <=", value, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceLike(String value) {
            addCriterion("resi_province like", value, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceNotLike(String value) {
            addCriterion("resi_province not like", value, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceIn(List<String> values) {
            addCriterion("resi_province in", values, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceNotIn(List<String> values) {
            addCriterion("resi_province not in", values, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceBetween(String value1, String value2) {
            addCriterion("resi_province between", value1, value2, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andResiProvinceNotBetween(String value1, String value2) {
            addCriterion("resi_province not between", value1, value2, "resiProvince");
            return (Criteria) this;
        }

        public Criteria andHouseProveIsNull() {
            addCriterion("house_prove is null");
            return (Criteria) this;
        }

        public Criteria andHouseProveIsNotNull() {
            addCriterion("house_prove is not null");
            return (Criteria) this;
        }

        public Criteria andHouseProveEqualTo(String value) {
            addCriterion("house_prove =", value, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveNotEqualTo(String value) {
            addCriterion("house_prove <>", value, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveGreaterThan(String value) {
            addCriterion("house_prove >", value, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveGreaterThanOrEqualTo(String value) {
            addCriterion("house_prove >=", value, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveLessThan(String value) {
            addCriterion("house_prove <", value, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveLessThanOrEqualTo(String value) {
            addCriterion("house_prove <=", value, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveLike(String value) {
            addCriterion("house_prove like", value, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveNotLike(String value) {
            addCriterion("house_prove not like", value, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveIn(List<String> values) {
            addCriterion("house_prove in", values, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveNotIn(List<String> values) {
            addCriterion("house_prove not in", values, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveBetween(String value1, String value2) {
            addCriterion("house_prove between", value1, value2, "houseProve");
            return (Criteria) this;
        }

        public Criteria andHouseProveNotBetween(String value1, String value2) {
            addCriterion("house_prove not between", value1, value2, "houseProve");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryIsNull() {
            addCriterion("verify_salary is null");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryIsNotNull() {
            addCriterion("verify_salary is not null");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryEqualTo(BigDecimal value) {
            addCriterion("verify_salary =", value, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryNotEqualTo(BigDecimal value) {
            addCriterion("verify_salary <>", value, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryGreaterThan(BigDecimal value) {
            addCriterion("verify_salary >", value, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("verify_salary >=", value, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryLessThan(BigDecimal value) {
            addCriterion("verify_salary <", value, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("verify_salary <=", value, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryIn(List<BigDecimal> values) {
            addCriterion("verify_salary in", values, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryNotIn(List<BigDecimal> values) {
            addCriterion("verify_salary not in", values, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("verify_salary between", value1, value2, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andVerifySalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("verify_salary not between", value1, value2, "verifySalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIsNull() {
            addCriterion("real_salary is null");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIsNotNull() {
            addCriterion("real_salary is not null");
            return (Criteria) this;
        }

        public Criteria andRealSalaryEqualTo(BigDecimal value) {
            addCriterion("real_salary =", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotEqualTo(BigDecimal value) {
            addCriterion("real_salary <>", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryGreaterThan(BigDecimal value) {
            addCriterion("real_salary >", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_salary >=", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryLessThan(BigDecimal value) {
            addCriterion("real_salary <", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_salary <=", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIn(List<BigDecimal> values) {
            addCriterion("real_salary in", values, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotIn(List<BigDecimal> values) {
            addCriterion("real_salary not in", values, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_salary between", value1, value2, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_salary not between", value1, value2, "realSalary");
            return (Criteria) this;
        }

        public Criteria andQqLengthIsNull() {
            addCriterion("qq_length is null");
            return (Criteria) this;
        }

        public Criteria andQqLengthIsNotNull() {
            addCriterion("qq_length is not null");
            return (Criteria) this;
        }

        public Criteria andQqLengthEqualTo(Integer value) {
            addCriterion("qq_length =", value, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthNotEqualTo(Integer value) {
            addCriterion("qq_length <>", value, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthGreaterThan(Integer value) {
            addCriterion("qq_length >", value, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("qq_length >=", value, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthLessThan(Integer value) {
            addCriterion("qq_length <", value, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthLessThanOrEqualTo(Integer value) {
            addCriterion("qq_length <=", value, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthIn(List<Integer> values) {
            addCriterion("qq_length in", values, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthNotIn(List<Integer> values) {
            addCriterion("qq_length not in", values, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthBetween(Integer value1, Integer value2) {
            addCriterion("qq_length between", value1, value2, "qqLength");
            return (Criteria) this;
        }

        public Criteria andQqLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("qq_length not between", value1, value2, "qqLength");
            return (Criteria) this;
        }

        public Criteria andProfitAmountIsNull() {
            addCriterion("profit_amount is null");
            return (Criteria) this;
        }

        public Criteria andProfitAmountIsNotNull() {
            addCriterion("profit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProfitAmountEqualTo(BigDecimal value) {
            addCriterion("profit_amount =", value, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountNotEqualTo(BigDecimal value) {
            addCriterion("profit_amount <>", value, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountGreaterThan(BigDecimal value) {
            addCriterion("profit_amount >", value, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_amount >=", value, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountLessThan(BigDecimal value) {
            addCriterion("profit_amount <", value, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_amount <=", value, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountIn(List<BigDecimal> values) {
            addCriterion("profit_amount in", values, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountNotIn(List<BigDecimal> values) {
            addCriterion("profit_amount not in", values, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_amount between", value1, value2, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andProfitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_amount not between", value1, value2, "profitAmount");
            return (Criteria) this;
        }

        public Criteria andLoanCityIsNull() {
            addCriterion("loan_city is null");
            return (Criteria) this;
        }

        public Criteria andLoanCityIsNotNull() {
            addCriterion("loan_city is not null");
            return (Criteria) this;
        }

        public Criteria andLoanCityEqualTo(String value) {
            addCriterion("loan_city =", value, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityNotEqualTo(String value) {
            addCriterion("loan_city <>", value, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityGreaterThan(String value) {
            addCriterion("loan_city >", value, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityGreaterThanOrEqualTo(String value) {
            addCriterion("loan_city >=", value, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityLessThan(String value) {
            addCriterion("loan_city <", value, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityLessThanOrEqualTo(String value) {
            addCriterion("loan_city <=", value, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityLike(String value) {
            addCriterion("loan_city like", value, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityNotLike(String value) {
            addCriterion("loan_city not like", value, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityIn(List<String> values) {
            addCriterion("loan_city in", values, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityNotIn(List<String> values) {
            addCriterion("loan_city not in", values, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityBetween(String value1, String value2) {
            addCriterion("loan_city between", value1, value2, "loanCity");
            return (Criteria) this;
        }

        public Criteria andLoanCityNotBetween(String value1, String value2) {
            addCriterion("loan_city not between", value1, value2, "loanCity");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthIsNull() {
            addCriterion("now_work_month is null");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthIsNotNull() {
            addCriterion("now_work_month is not null");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthEqualTo(Integer value) {
            addCriterion("now_work_month =", value, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthNotEqualTo(Integer value) {
            addCriterion("now_work_month <>", value, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthGreaterThan(Integer value) {
            addCriterion("now_work_month >", value, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_work_month >=", value, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthLessThan(Integer value) {
            addCriterion("now_work_month <", value, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthLessThanOrEqualTo(Integer value) {
            addCriterion("now_work_month <=", value, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthIn(List<Integer> values) {
            addCriterion("now_work_month in", values, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthNotIn(List<Integer> values) {
            addCriterion("now_work_month not in", values, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthBetween(Integer value1, Integer value2) {
            addCriterion("now_work_month between", value1, value2, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andNowWorkMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("now_work_month not between", value1, value2, "nowWorkMonth");
            return (Criteria) this;
        }

        public Criteria andSecondRelationIsNull() {
            addCriterion("second_relation is null");
            return (Criteria) this;
        }

        public Criteria andSecondRelationIsNotNull() {
            addCriterion("second_relation is not null");
            return (Criteria) this;
        }

        public Criteria andSecondRelationEqualTo(String value) {
            addCriterion("second_relation =", value, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationNotEqualTo(String value) {
            addCriterion("second_relation <>", value, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationGreaterThan(String value) {
            addCriterion("second_relation >", value, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationGreaterThanOrEqualTo(String value) {
            addCriterion("second_relation >=", value, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationLessThan(String value) {
            addCriterion("second_relation <", value, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationLessThanOrEqualTo(String value) {
            addCriterion("second_relation <=", value, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationLike(String value) {
            addCriterion("second_relation like", value, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationNotLike(String value) {
            addCriterion("second_relation not like", value, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationIn(List<String> values) {
            addCriterion("second_relation in", values, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationNotIn(List<String> values) {
            addCriterion("second_relation not in", values, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationBetween(String value1, String value2) {
            addCriterion("second_relation between", value1, value2, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andSecondRelationNotBetween(String value1, String value2) {
            addCriterion("second_relation not between", value1, value2, "secondRelation");
            return (Criteria) this;
        }

        public Criteria andHourseTypeIsNull() {
            addCriterion("hourse_type is null");
            return (Criteria) this;
        }

        public Criteria andHourseTypeIsNotNull() {
            addCriterion("hourse_type is not null");
            return (Criteria) this;
        }

        public Criteria andHourseTypeEqualTo(String value) {
            addCriterion("hourse_type =", value, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeNotEqualTo(String value) {
            addCriterion("hourse_type <>", value, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeGreaterThan(String value) {
            addCriterion("hourse_type >", value, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hourse_type >=", value, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeLessThan(String value) {
            addCriterion("hourse_type <", value, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeLessThanOrEqualTo(String value) {
            addCriterion("hourse_type <=", value, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeLike(String value) {
            addCriterion("hourse_type like", value, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeNotLike(String value) {
            addCriterion("hourse_type not like", value, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeIn(List<String> values) {
            addCriterion("hourse_type in", values, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeNotIn(List<String> values) {
            addCriterion("hourse_type not in", values, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeBetween(String value1, String value2) {
            addCriterion("hourse_type between", value1, value2, "hourseType");
            return (Criteria) this;
        }

        public Criteria andHourseTypeNotBetween(String value1, String value2) {
            addCriterion("hourse_type not between", value1, value2, "hourseType");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsIsNull() {
            addCriterion("wechat_loan_months is null");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsIsNotNull() {
            addCriterion("wechat_loan_months is not null");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsEqualTo(Integer value) {
            addCriterion("wechat_loan_months =", value, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsNotEqualTo(Integer value) {
            addCriterion("wechat_loan_months <>", value, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsGreaterThan(Integer value) {
            addCriterion("wechat_loan_months >", value, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_loan_months >=", value, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsLessThan(Integer value) {
            addCriterion("wechat_loan_months <", value, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_loan_months <=", value, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsIn(List<Integer> values) {
            addCriterion("wechat_loan_months in", values, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsNotIn(List<Integer> values) {
            addCriterion("wechat_loan_months not in", values, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsBetween(Integer value1, Integer value2) {
            addCriterion("wechat_loan_months between", value1, value2, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanMonthsNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_loan_months not between", value1, value2, "wechatLoanMonths");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountIsNull() {
            addCriterion("wechat_loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountIsNotNull() {
            addCriterion("wechat_loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountEqualTo(BigDecimal value) {
            addCriterion("wechat_loan_amount =", value, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("wechat_loan_amount <>", value, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("wechat_loan_amount >", value, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_loan_amount >=", value, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountLessThan(BigDecimal value) {
            addCriterion("wechat_loan_amount <", value, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_loan_amount <=", value, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountIn(List<BigDecimal> values) {
            addCriterion("wechat_loan_amount in", values, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("wechat_loan_amount not in", values, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_loan_amount between", value1, value2, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_loan_amount not between", value1, value2, "wechatLoanAmount");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateIsNull() {
            addCriterion("wechat_loan_rate is null");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateIsNotNull() {
            addCriterion("wechat_loan_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateEqualTo(BigDecimal value) {
            addCriterion("wechat_loan_rate =", value, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateNotEqualTo(BigDecimal value) {
            addCriterion("wechat_loan_rate <>", value, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateGreaterThan(BigDecimal value) {
            addCriterion("wechat_loan_rate >", value, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_loan_rate >=", value, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateLessThan(BigDecimal value) {
            addCriterion("wechat_loan_rate <", value, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_loan_rate <=", value, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateIn(List<BigDecimal> values) {
            addCriterion("wechat_loan_rate in", values, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateNotIn(List<BigDecimal> values) {
            addCriterion("wechat_loan_rate not in", values, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_loan_rate between", value1, value2, "wechatLoanRate");
            return (Criteria) this;
        }

        public Criteria andWechatLoanRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_loan_rate not between", value1, value2, "wechatLoanRate");
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
     * uc_basic_info
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * uc_basic_info 2019-04-26
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