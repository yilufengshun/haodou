package com.meng.spring.pojo;

import java.util.ArrayList;
import java.util.List;

public class HdAlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HdAlbumExample() {
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

        public Criteria andAlbumIdIsNull() {
            addCriterion("album_id is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIsNotNull() {
            addCriterion("album_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdEqualTo(Integer value) {
            addCriterion("album_id =", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotEqualTo(Integer value) {
            addCriterion("album_id <>", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThan(Integer value) {
            addCriterion("album_id >", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_id >=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThan(Integer value) {
            addCriterion("album_id <", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThanOrEqualTo(Integer value) {
            addCriterion("album_id <=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIn(List<Integer> values) {
            addCriterion("album_id in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotIn(List<Integer> values) {
            addCriterion("album_id not in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdBetween(Integer value1, Integer value2) {
            addCriterion("album_id between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("album_id not between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroIsNull() {
            addCriterion("album_intro is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroIsNotNull() {
            addCriterion("album_intro is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroEqualTo(String value) {
            addCriterion("album_intro =", value, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroNotEqualTo(String value) {
            addCriterion("album_intro <>", value, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroGreaterThan(String value) {
            addCriterion("album_intro >", value, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroGreaterThanOrEqualTo(String value) {
            addCriterion("album_intro >=", value, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroLessThan(String value) {
            addCriterion("album_intro <", value, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroLessThanOrEqualTo(String value) {
            addCriterion("album_intro <=", value, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroLike(String value) {
            addCriterion("album_intro like", value, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroNotLike(String value) {
            addCriterion("album_intro not like", value, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroIn(List<String> values) {
            addCriterion("album_intro in", values, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroNotIn(List<String> values) {
            addCriterion("album_intro not in", values, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroBetween(String value1, String value2) {
            addCriterion("album_intro between", value1, value2, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumIntroNotBetween(String value1, String value2) {
            addCriterion("album_intro not between", value1, value2, "albumIntro");
            return (Criteria) this;
        }

        public Criteria andAlbumTapIsNull() {
            addCriterion("album_tap is null");
            return (Criteria) this;
        }

        public Criteria andAlbumTapIsNotNull() {
            addCriterion("album_tap is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumTapEqualTo(String value) {
            addCriterion("album_tap =", value, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapNotEqualTo(String value) {
            addCriterion("album_tap <>", value, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapGreaterThan(String value) {
            addCriterion("album_tap >", value, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapGreaterThanOrEqualTo(String value) {
            addCriterion("album_tap >=", value, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapLessThan(String value) {
            addCriterion("album_tap <", value, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapLessThanOrEqualTo(String value) {
            addCriterion("album_tap <=", value, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapLike(String value) {
            addCriterion("album_tap like", value, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapNotLike(String value) {
            addCriterion("album_tap not like", value, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapIn(List<String> values) {
            addCriterion("album_tap in", values, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapNotIn(List<String> values) {
            addCriterion("album_tap not in", values, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapBetween(String value1, String value2) {
            addCriterion("album_tap between", value1, value2, "albumTap");
            return (Criteria) this;
        }

        public Criteria andAlbumTapNotBetween(String value1, String value2) {
            addCriterion("album_tap not between", value1, value2, "albumTap");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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