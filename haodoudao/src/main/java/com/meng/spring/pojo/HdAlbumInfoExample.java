package com.meng.spring.pojo;

import java.util.ArrayList;
import java.util.List;

public class HdAlbumInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HdAlbumInfoExample() {
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

        public Criteria andAluminfoIdIsNull() {
            addCriterion("aluminfo_id is null");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdIsNotNull() {
            addCriterion("aluminfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdEqualTo(Integer value) {
            addCriterion("aluminfo_id =", value, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdNotEqualTo(Integer value) {
            addCriterion("aluminfo_id <>", value, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdGreaterThan(Integer value) {
            addCriterion("aluminfo_id >", value, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aluminfo_id >=", value, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdLessThan(Integer value) {
            addCriterion("aluminfo_id <", value, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("aluminfo_id <=", value, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdIn(List<Integer> values) {
            addCriterion("aluminfo_id in", values, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdNotIn(List<Integer> values) {
            addCriterion("aluminfo_id not in", values, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdBetween(Integer value1, Integer value2) {
            addCriterion("aluminfo_id between", value1, value2, "aluminfoId");
            return (Criteria) this;
        }

        public Criteria andAluminfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aluminfo_id not between", value1, value2, "aluminfoId");
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

        public Criteria andAlumIdIsNull() {
            addCriterion("alum_id is null");
            return (Criteria) this;
        }

        public Criteria andAlumIdIsNotNull() {
            addCriterion("alum_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlumIdEqualTo(Integer value) {
            addCriterion("alum_id =", value, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdNotEqualTo(Integer value) {
            addCriterion("alum_id <>", value, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdGreaterThan(Integer value) {
            addCriterion("alum_id >", value, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("alum_id >=", value, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdLessThan(Integer value) {
            addCriterion("alum_id <", value, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdLessThanOrEqualTo(Integer value) {
            addCriterion("alum_id <=", value, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdIn(List<Integer> values) {
            addCriterion("alum_id in", values, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdNotIn(List<Integer> values) {
            addCriterion("alum_id not in", values, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdBetween(Integer value1, Integer value2) {
            addCriterion("alum_id between", value1, value2, "alumId");
            return (Criteria) this;
        }

        public Criteria andAlumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("alum_id not between", value1, value2, "alumId");
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