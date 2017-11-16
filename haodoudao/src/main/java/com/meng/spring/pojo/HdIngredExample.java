package com.meng.spring.pojo;

import java.util.ArrayList;
import java.util.List;

public class HdIngredExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HdIngredExample() {
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

        public Criteria andIngredIdIsNull() {
            addCriterion("ingred_id is null");
            return (Criteria) this;
        }

        public Criteria andIngredIdIsNotNull() {
            addCriterion("ingred_id is not null");
            return (Criteria) this;
        }

        public Criteria andIngredIdEqualTo(Integer value) {
            addCriterion("ingred_id =", value, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdNotEqualTo(Integer value) {
            addCriterion("ingred_id <>", value, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdGreaterThan(Integer value) {
            addCriterion("ingred_id >", value, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ingred_id >=", value, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdLessThan(Integer value) {
            addCriterion("ingred_id <", value, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdLessThanOrEqualTo(Integer value) {
            addCriterion("ingred_id <=", value, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdIn(List<Integer> values) {
            addCriterion("ingred_id in", values, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdNotIn(List<Integer> values) {
            addCriterion("ingred_id not in", values, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdBetween(Integer value1, Integer value2) {
            addCriterion("ingred_id between", value1, value2, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ingred_id not between", value1, value2, "ingredId");
            return (Criteria) this;
        }

        public Criteria andIngredTypeIsNull() {
            addCriterion("ingred_type is null");
            return (Criteria) this;
        }

        public Criteria andIngredTypeIsNotNull() {
            addCriterion("ingred_type is not null");
            return (Criteria) this;
        }

        public Criteria andIngredTypeEqualTo(String value) {
            addCriterion("ingred_type =", value, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeNotEqualTo(String value) {
            addCriterion("ingred_type <>", value, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeGreaterThan(String value) {
            addCriterion("ingred_type >", value, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ingred_type >=", value, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeLessThan(String value) {
            addCriterion("ingred_type <", value, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeLessThanOrEqualTo(String value) {
            addCriterion("ingred_type <=", value, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeLike(String value) {
            addCriterion("ingred_type like", value, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeNotLike(String value) {
            addCriterion("ingred_type not like", value, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeIn(List<String> values) {
            addCriterion("ingred_type in", values, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeNotIn(List<String> values) {
            addCriterion("ingred_type not in", values, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeBetween(String value1, String value2) {
            addCriterion("ingred_type between", value1, value2, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredTypeNotBetween(String value1, String value2) {
            addCriterion("ingred_type not between", value1, value2, "ingredType");
            return (Criteria) this;
        }

        public Criteria andIngredNameIsNull() {
            addCriterion("ingred_name is null");
            return (Criteria) this;
        }

        public Criteria andIngredNameIsNotNull() {
            addCriterion("ingred_name is not null");
            return (Criteria) this;
        }

        public Criteria andIngredNameEqualTo(String value) {
            addCriterion("ingred_name =", value, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameNotEqualTo(String value) {
            addCriterion("ingred_name <>", value, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameGreaterThan(String value) {
            addCriterion("ingred_name >", value, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameGreaterThanOrEqualTo(String value) {
            addCriterion("ingred_name >=", value, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameLessThan(String value) {
            addCriterion("ingred_name <", value, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameLessThanOrEqualTo(String value) {
            addCriterion("ingred_name <=", value, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameLike(String value) {
            addCriterion("ingred_name like", value, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameNotLike(String value) {
            addCriterion("ingred_name not like", value, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameIn(List<String> values) {
            addCriterion("ingred_name in", values, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameNotIn(List<String> values) {
            addCriterion("ingred_name not in", values, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameBetween(String value1, String value2) {
            addCriterion("ingred_name between", value1, value2, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNameNotBetween(String value1, String value2) {
            addCriterion("ingred_name not between", value1, value2, "ingredName");
            return (Criteria) this;
        }

        public Criteria andIngredNumIsNull() {
            addCriterion("ingred_num is null");
            return (Criteria) this;
        }

        public Criteria andIngredNumIsNotNull() {
            addCriterion("ingred_num is not null");
            return (Criteria) this;
        }

        public Criteria andIngredNumEqualTo(String value) {
            addCriterion("ingred_num =", value, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumNotEqualTo(String value) {
            addCriterion("ingred_num <>", value, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumGreaterThan(String value) {
            addCriterion("ingred_num >", value, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumGreaterThanOrEqualTo(String value) {
            addCriterion("ingred_num >=", value, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumLessThan(String value) {
            addCriterion("ingred_num <", value, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumLessThanOrEqualTo(String value) {
            addCriterion("ingred_num <=", value, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumLike(String value) {
            addCriterion("ingred_num like", value, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumNotLike(String value) {
            addCriterion("ingred_num not like", value, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumIn(List<String> values) {
            addCriterion("ingred_num in", values, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumNotIn(List<String> values) {
            addCriterion("ingred_num not in", values, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumBetween(String value1, String value2) {
            addCriterion("ingred_num between", value1, value2, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andIngredNumNotBetween(String value1, String value2) {
            addCriterion("ingred_num not between", value1, value2, "ingredNum");
            return (Criteria) this;
        }

        public Criteria andCookIdIsNull() {
            addCriterion("cook_id is null");
            return (Criteria) this;
        }

        public Criteria andCookIdIsNotNull() {
            addCriterion("cook_id is not null");
            return (Criteria) this;
        }

        public Criteria andCookIdEqualTo(Integer value) {
            addCriterion("cook_id =", value, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdNotEqualTo(Integer value) {
            addCriterion("cook_id <>", value, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdGreaterThan(Integer value) {
            addCriterion("cook_id >", value, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cook_id >=", value, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdLessThan(Integer value) {
            addCriterion("cook_id <", value, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdLessThanOrEqualTo(Integer value) {
            addCriterion("cook_id <=", value, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdIn(List<Integer> values) {
            addCriterion("cook_id in", values, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdNotIn(List<Integer> values) {
            addCriterion("cook_id not in", values, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdBetween(Integer value1, Integer value2) {
            addCriterion("cook_id between", value1, value2, "cookId");
            return (Criteria) this;
        }

        public Criteria andCookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cook_id not between", value1, value2, "cookId");
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
}