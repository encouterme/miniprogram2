package com.aode.bean;

import java.util.ArrayList;
import java.util.List;

public class Registration_departmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Registration_departmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andReginfoIdIsNull() {
            addCriterion("regInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andReginfoIdIsNotNull() {
            addCriterion("regInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoIdEqualTo(Integer value) {
            addCriterion("regInfo_id =", value, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdNotEqualTo(Integer value) {
            addCriterion("regInfo_id <>", value, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdGreaterThan(Integer value) {
            addCriterion("regInfo_id >", value, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("regInfo_id >=", value, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdLessThan(Integer value) {
            addCriterion("regInfo_id <", value, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("regInfo_id <=", value, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdIn(List<Integer> values) {
            addCriterion("regInfo_id in", values, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdNotIn(List<Integer> values) {
            addCriterion("regInfo_id not in", values, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdBetween(Integer value1, Integer value2) {
            addCriterion("regInfo_id between", value1, value2, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("regInfo_id not between", value1, value2, "reginfoId");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidIsNull() {
            addCriterion("regInfo_departmentId is null");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidIsNotNull() {
            addCriterion("regInfo_departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidEqualTo(Integer value) {
            addCriterion("regInfo_departmentId =", value, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidNotEqualTo(Integer value) {
            addCriterion("regInfo_departmentId <>", value, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidGreaterThan(Integer value) {
            addCriterion("regInfo_departmentId >", value, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("regInfo_departmentId >=", value, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidLessThan(Integer value) {
            addCriterion("regInfo_departmentId <", value, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("regInfo_departmentId <=", value, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidIn(List<Integer> values) {
            addCriterion("regInfo_departmentId in", values, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidNotIn(List<Integer> values) {
            addCriterion("regInfo_departmentId not in", values, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("regInfo_departmentId between", value1, value2, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("regInfo_departmentId not between", value1, value2, "reginfoDepartmentid");
            return (Criteria) this;
        }

        public Criteria andReginfoNameIsNull() {
            addCriterion("regInfo_name is null");
            return (Criteria) this;
        }

        public Criteria andReginfoNameIsNotNull() {
            addCriterion("regInfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoNameEqualTo(String value) {
            addCriterion("regInfo_name =", value, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameNotEqualTo(String value) {
            addCriterion("regInfo_name <>", value, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameGreaterThan(String value) {
            addCriterion("regInfo_name >", value, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("regInfo_name >=", value, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameLessThan(String value) {
            addCriterion("regInfo_name <", value, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameLessThanOrEqualTo(String value) {
            addCriterion("regInfo_name <=", value, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameLike(String value) {
            addCriterion("regInfo_name like", value, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameNotLike(String value) {
            addCriterion("regInfo_name not like", value, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameIn(List<String> values) {
            addCriterion("regInfo_name in", values, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameNotIn(List<String> values) {
            addCriterion("regInfo_name not in", values, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameBetween(String value1, String value2) {
            addCriterion("regInfo_name between", value1, value2, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoNameNotBetween(String value1, String value2) {
            addCriterion("regInfo_name not between", value1, value2, "reginfoName");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentIsNull() {
            addCriterion("regInfo_department is null");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentIsNotNull() {
            addCriterion("regInfo_department is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentEqualTo(String value) {
            addCriterion("regInfo_department =", value, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentNotEqualTo(String value) {
            addCriterion("regInfo_department <>", value, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentGreaterThan(String value) {
            addCriterion("regInfo_department >", value, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("regInfo_department >=", value, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentLessThan(String value) {
            addCriterion("regInfo_department <", value, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentLessThanOrEqualTo(String value) {
            addCriterion("regInfo_department <=", value, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentLike(String value) {
            addCriterion("regInfo_department like", value, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentNotLike(String value) {
            addCriterion("regInfo_department not like", value, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentIn(List<String> values) {
            addCriterion("regInfo_department in", values, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentNotIn(List<String> values) {
            addCriterion("regInfo_department not in", values, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentBetween(String value1, String value2) {
            addCriterion("regInfo_department between", value1, value2, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoDepartmentNotBetween(String value1, String value2) {
            addCriterion("regInfo_department not between", value1, value2, "reginfoDepartment");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorIsNull() {
            addCriterion("regInfo_major is null");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorIsNotNull() {
            addCriterion("regInfo_major is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorEqualTo(String value) {
            addCriterion("regInfo_major =", value, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorNotEqualTo(String value) {
            addCriterion("regInfo_major <>", value, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorGreaterThan(String value) {
            addCriterion("regInfo_major >", value, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorGreaterThanOrEqualTo(String value) {
            addCriterion("regInfo_major >=", value, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorLessThan(String value) {
            addCriterion("regInfo_major <", value, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorLessThanOrEqualTo(String value) {
            addCriterion("regInfo_major <=", value, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorLike(String value) {
            addCriterion("regInfo_major like", value, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorNotLike(String value) {
            addCriterion("regInfo_major not like", value, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorIn(List<String> values) {
            addCriterion("regInfo_major in", values, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorNotIn(List<String> values) {
            addCriterion("regInfo_major not in", values, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorBetween(String value1, String value2) {
            addCriterion("regInfo_major between", value1, value2, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoMajorNotBetween(String value1, String value2) {
            addCriterion("regInfo_major not between", value1, value2, "reginfoMajor");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberIsNull() {
            addCriterion("regInfo_phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberIsNotNull() {
            addCriterion("regInfo_phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberEqualTo(String value) {
            addCriterion("regInfo_phoneNumber =", value, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberNotEqualTo(String value) {
            addCriterion("regInfo_phoneNumber <>", value, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberGreaterThan(String value) {
            addCriterion("regInfo_phoneNumber >", value, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("regInfo_phoneNumber >=", value, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberLessThan(String value) {
            addCriterion("regInfo_phoneNumber <", value, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("regInfo_phoneNumber <=", value, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberLike(String value) {
            addCriterion("regInfo_phoneNumber like", value, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberNotLike(String value) {
            addCriterion("regInfo_phoneNumber not like", value, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberIn(List<String> values) {
            addCriterion("regInfo_phoneNumber in", values, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberNotIn(List<String> values) {
            addCriterion("regInfo_phoneNumber not in", values, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberBetween(String value1, String value2) {
            addCriterion("regInfo_phoneNumber between", value1, value2, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoPhonenumberNotBetween(String value1, String value2) {
            addCriterion("regInfo_phoneNumber not between", value1, value2, "reginfoPhonenumber");
            return (Criteria) this;
        }

        public Criteria andReginfoQqIsNull() {
            addCriterion("regInfo_qq is null");
            return (Criteria) this;
        }

        public Criteria andReginfoQqIsNotNull() {
            addCriterion("regInfo_qq is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoQqEqualTo(String value) {
            addCriterion("regInfo_qq =", value, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqNotEqualTo(String value) {
            addCriterion("regInfo_qq <>", value, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqGreaterThan(String value) {
            addCriterion("regInfo_qq >", value, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqGreaterThanOrEqualTo(String value) {
            addCriterion("regInfo_qq >=", value, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqLessThan(String value) {
            addCriterion("regInfo_qq <", value, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqLessThanOrEqualTo(String value) {
            addCriterion("regInfo_qq <=", value, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqLike(String value) {
            addCriterion("regInfo_qq like", value, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqNotLike(String value) {
            addCriterion("regInfo_qq not like", value, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqIn(List<String> values) {
            addCriterion("regInfo_qq in", values, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqNotIn(List<String> values) {
            addCriterion("regInfo_qq not in", values, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqBetween(String value1, String value2) {
            addCriterion("regInfo_qq between", value1, value2, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoQqNotBetween(String value1, String value2) {
            addCriterion("regInfo_qq not between", value1, value2, "reginfoQq");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharIsNull() {
            addCriterion("regInfo_wechar is null");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharIsNotNull() {
            addCriterion("regInfo_wechar is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharEqualTo(String value) {
            addCriterion("regInfo_wechar =", value, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharNotEqualTo(String value) {
            addCriterion("regInfo_wechar <>", value, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharGreaterThan(String value) {
            addCriterion("regInfo_wechar >", value, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharGreaterThanOrEqualTo(String value) {
            addCriterion("regInfo_wechar >=", value, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharLessThan(String value) {
            addCriterion("regInfo_wechar <", value, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharLessThanOrEqualTo(String value) {
            addCriterion("regInfo_wechar <=", value, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharLike(String value) {
            addCriterion("regInfo_wechar like", value, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharNotLike(String value) {
            addCriterion("regInfo_wechar not like", value, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharIn(List<String> values) {
            addCriterion("regInfo_wechar in", values, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharNotIn(List<String> values) {
            addCriterion("regInfo_wechar not in", values, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharBetween(String value1, String value2) {
            addCriterion("regInfo_wechar between", value1, value2, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoWecharNotBetween(String value1, String value2) {
            addCriterion("regInfo_wechar not between", value1, value2, "reginfoWechar");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsIsNull() {
            addCriterion("regInfo_addReasons is null");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsIsNotNull() {
            addCriterion("regInfo_addReasons is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsEqualTo(String value) {
            addCriterion("regInfo_addReasons =", value, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsNotEqualTo(String value) {
            addCriterion("regInfo_addReasons <>", value, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsGreaterThan(String value) {
            addCriterion("regInfo_addReasons >", value, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsGreaterThanOrEqualTo(String value) {
            addCriterion("regInfo_addReasons >=", value, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsLessThan(String value) {
            addCriterion("regInfo_addReasons <", value, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsLessThanOrEqualTo(String value) {
            addCriterion("regInfo_addReasons <=", value, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsLike(String value) {
            addCriterion("regInfo_addReasons like", value, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsNotLike(String value) {
            addCriterion("regInfo_addReasons not like", value, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsIn(List<String> values) {
            addCriterion("regInfo_addReasons in", values, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsNotIn(List<String> values) {
            addCriterion("regInfo_addReasons not in", values, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsBetween(String value1, String value2) {
            addCriterion("regInfo_addReasons between", value1, value2, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoAddreasonsNotBetween(String value1, String value2) {
            addCriterion("regInfo_addReasons not between", value1, value2, "reginfoAddreasons");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionIsNull() {
            addCriterion("regInfo_introduction is null");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionIsNotNull() {
            addCriterion("regInfo_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionEqualTo(String value) {
            addCriterion("regInfo_introduction =", value, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionNotEqualTo(String value) {
            addCriterion("regInfo_introduction <>", value, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionGreaterThan(String value) {
            addCriterion("regInfo_introduction >", value, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("regInfo_introduction >=", value, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionLessThan(String value) {
            addCriterion("regInfo_introduction <", value, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionLessThanOrEqualTo(String value) {
            addCriterion("regInfo_introduction <=", value, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionLike(String value) {
            addCriterion("regInfo_introduction like", value, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionNotLike(String value) {
            addCriterion("regInfo_introduction not like", value, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionIn(List<String> values) {
            addCriterion("regInfo_introduction in", values, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionNotIn(List<String> values) {
            addCriterion("regInfo_introduction not in", values, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionBetween(String value1, String value2) {
            addCriterion("regInfo_introduction between", value1, value2, "reginfoIntroduction");
            return (Criteria) this;
        }

        public Criteria andReginfoIntroductionNotBetween(String value1, String value2) {
            addCriterion("regInfo_introduction not between", value1, value2, "reginfoIntroduction");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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

    public Registration_departmentExample(String orderByClause, boolean distinct, List<Criteria> oredCriteria) {
        this.orderByClause = orderByClause;
        this.distinct = distinct;
        this.oredCriteria = oredCriteria;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}