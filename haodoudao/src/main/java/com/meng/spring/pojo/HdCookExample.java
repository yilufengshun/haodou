package com.meng.spring.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HdCookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HdCookExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCookNameIsNull() {
            addCriterion("cook_name is null");
            return (Criteria) this;
        }

        public Criteria andCookNameIsNotNull() {
            addCriterion("cook_name is not null");
            return (Criteria) this;
        }

        public Criteria andCookNameEqualTo(String value) {
            addCriterion("cook_name =", value, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameNotEqualTo(String value) {
            addCriterion("cook_name <>", value, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameGreaterThan(String value) {
            addCriterion("cook_name >", value, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameGreaterThanOrEqualTo(String value) {
            addCriterion("cook_name >=", value, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameLessThan(String value) {
            addCriterion("cook_name <", value, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameLessThanOrEqualTo(String value) {
            addCriterion("cook_name <=", value, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameLike(String value) {
            addCriterion("cook_name like", value, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameNotLike(String value) {
            addCriterion("cook_name not like", value, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameIn(List<String> values) {
            addCriterion("cook_name in", values, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameNotIn(List<String> values) {
            addCriterion("cook_name not in", values, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameBetween(String value1, String value2) {
            addCriterion("cook_name between", value1, value2, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookNameNotBetween(String value1, String value2) {
            addCriterion("cook_name not between", value1, value2, "cookName");
            return (Criteria) this;
        }

        public Criteria andCookPicIsNull() {
            addCriterion("cook_pic is null");
            return (Criteria) this;
        }

        public Criteria andCookPicIsNotNull() {
            addCriterion("cook_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCookPicEqualTo(String value) {
            addCriterion("cook_pic =", value, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicNotEqualTo(String value) {
            addCriterion("cook_pic <>", value, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicGreaterThan(String value) {
            addCriterion("cook_pic >", value, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicGreaterThanOrEqualTo(String value) {
            addCriterion("cook_pic >=", value, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicLessThan(String value) {
            addCriterion("cook_pic <", value, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicLessThanOrEqualTo(String value) {
            addCriterion("cook_pic <=", value, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicLike(String value) {
            addCriterion("cook_pic like", value, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicNotLike(String value) {
            addCriterion("cook_pic not like", value, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicIn(List<String> values) {
            addCriterion("cook_pic in", values, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicNotIn(List<String> values) {
            addCriterion("cook_pic not in", values, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicBetween(String value1, String value2) {
            addCriterion("cook_pic between", value1, value2, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookPicNotBetween(String value1, String value2) {
            addCriterion("cook_pic not between", value1, value2, "cookPic");
            return (Criteria) this;
        }

        public Criteria andCookIntroIsNull() {
            addCriterion("cook_intro is null");
            return (Criteria) this;
        }

        public Criteria andCookIntroIsNotNull() {
            addCriterion("cook_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCookIntroEqualTo(String value) {
            addCriterion("cook_intro =", value, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroNotEqualTo(String value) {
            addCriterion("cook_intro <>", value, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroGreaterThan(String value) {
            addCriterion("cook_intro >", value, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroGreaterThanOrEqualTo(String value) {
            addCriterion("cook_intro >=", value, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroLessThan(String value) {
            addCriterion("cook_intro <", value, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroLessThanOrEqualTo(String value) {
            addCriterion("cook_intro <=", value, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroLike(String value) {
            addCriterion("cook_intro like", value, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroNotLike(String value) {
            addCriterion("cook_intro not like", value, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroIn(List<String> values) {
            addCriterion("cook_intro in", values, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroNotIn(List<String> values) {
            addCriterion("cook_intro not in", values, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroBetween(String value1, String value2) {
            addCriterion("cook_intro between", value1, value2, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andCookIntroNotBetween(String value1, String value2) {
            addCriterion("cook_intro not between", value1, value2, "cookIntro");
            return (Criteria) this;
        }

        public Criteria andReadyTimeIsNull() {
            addCriterion("ready_time is null");
            return (Criteria) this;
        }

        public Criteria andReadyTimeIsNotNull() {
            addCriterion("ready_time is not null");
            return (Criteria) this;
        }

        public Criteria andReadyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ready_time =", value, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ready_time <>", value, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ready_time >", value, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ready_time >=", value, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeLessThan(Date value) {
            addCriterionForJDBCDate("ready_time <", value, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ready_time <=", value, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ready_time in", values, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ready_time not in", values, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ready_time between", value1, value2, "readyTime");
            return (Criteria) this;
        }

        public Criteria andReadyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ready_time not between", value1, value2, "readyTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeIsNull() {
            addCriterion("make_time is null");
            return (Criteria) this;
        }

        public Criteria andMakeTimeIsNotNull() {
            addCriterion("make_time is not null");
            return (Criteria) this;
        }

        public Criteria andMakeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("make_time =", value, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("make_time <>", value, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("make_time >", value, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("make_time >=", value, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeLessThan(Date value) {
            addCriterionForJDBCDate("make_time <", value, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("make_time <=", value, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("make_time in", values, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("make_time not in", values, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("make_time between", value1, value2, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMakeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("make_time not between", value1, value2, "makeTime");
            return (Criteria) this;
        }

        public Criteria andMealsnumIsNull() {
            addCriterion("mealsnum is null");
            return (Criteria) this;
        }

        public Criteria andMealsnumIsNotNull() {
            addCriterion("mealsnum is not null");
            return (Criteria) this;
        }

        public Criteria andMealsnumEqualTo(String value) {
            addCriterion("mealsnum =", value, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumNotEqualTo(String value) {
            addCriterion("mealsnum <>", value, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumGreaterThan(String value) {
            addCriterion("mealsnum >", value, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumGreaterThanOrEqualTo(String value) {
            addCriterion("mealsnum >=", value, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumLessThan(String value) {
            addCriterion("mealsnum <", value, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumLessThanOrEqualTo(String value) {
            addCriterion("mealsnum <=", value, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumLike(String value) {
            addCriterion("mealsnum like", value, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumNotLike(String value) {
            addCriterion("mealsnum not like", value, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumIn(List<String> values) {
            addCriterion("mealsnum in", values, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumNotIn(List<String> values) {
            addCriterion("mealsnum not in", values, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumBetween(String value1, String value2) {
            addCriterion("mealsnum between", value1, value2, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andMealsnumNotBetween(String value1, String value2) {
            addCriterion("mealsnum not between", value1, value2, "mealsnum");
            return (Criteria) this;
        }

        public Criteria andCookstepIsNull() {
            addCriterion("cookstep is null");
            return (Criteria) this;
        }

        public Criteria andCookstepIsNotNull() {
            addCriterion("cookstep is not null");
            return (Criteria) this;
        }

        public Criteria andCookstepEqualTo(String value) {
            addCriterion("cookstep =", value, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepNotEqualTo(String value) {
            addCriterion("cookstep <>", value, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepGreaterThan(String value) {
            addCriterion("cookstep >", value, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepGreaterThanOrEqualTo(String value) {
            addCriterion("cookstep >=", value, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepLessThan(String value) {
            addCriterion("cookstep <", value, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepLessThanOrEqualTo(String value) {
            addCriterion("cookstep <=", value, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepLike(String value) {
            addCriterion("cookstep like", value, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepNotLike(String value) {
            addCriterion("cookstep not like", value, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepIn(List<String> values) {
            addCriterion("cookstep in", values, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepNotIn(List<String> values) {
            addCriterion("cookstep not in", values, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepBetween(String value1, String value2) {
            addCriterion("cookstep between", value1, value2, "cookstep");
            return (Criteria) this;
        }

        public Criteria andCookstepNotBetween(String value1, String value2) {
            addCriterion("cookstep not between", value1, value2, "cookstep");
            return (Criteria) this;
        }

        public Criteria andArtificeIsNull() {
            addCriterion("artifice is null");
            return (Criteria) this;
        }

        public Criteria andArtificeIsNotNull() {
            addCriterion("artifice is not null");
            return (Criteria) this;
        }

        public Criteria andArtificeEqualTo(String value) {
            addCriterion("artifice =", value, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeNotEqualTo(String value) {
            addCriterion("artifice <>", value, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeGreaterThan(String value) {
            addCriterion("artifice >", value, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeGreaterThanOrEqualTo(String value) {
            addCriterion("artifice >=", value, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeLessThan(String value) {
            addCriterion("artifice <", value, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeLessThanOrEqualTo(String value) {
            addCriterion("artifice <=", value, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeLike(String value) {
            addCriterion("artifice like", value, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeNotLike(String value) {
            addCriterion("artifice not like", value, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeIn(List<String> values) {
            addCriterion("artifice in", values, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeNotIn(List<String> values) {
            addCriterion("artifice not in", values, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeBetween(String value1, String value2) {
            addCriterion("artifice between", value1, value2, "artifice");
            return (Criteria) this;
        }

        public Criteria andArtificeNotBetween(String value1, String value2) {
            addCriterion("artifice not between", value1, value2, "artifice");
            return (Criteria) this;
        }

        public Criteria andCookLabelIsNull() {
            addCriterion("cook_label is null");
            return (Criteria) this;
        }

        public Criteria andCookLabelIsNotNull() {
            addCriterion("cook_label is not null");
            return (Criteria) this;
        }

        public Criteria andCookLabelEqualTo(String value) {
            addCriterion("cook_label =", value, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelNotEqualTo(String value) {
            addCriterion("cook_label <>", value, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelGreaterThan(String value) {
            addCriterion("cook_label >", value, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelGreaterThanOrEqualTo(String value) {
            addCriterion("cook_label >=", value, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelLessThan(String value) {
            addCriterion("cook_label <", value, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelLessThanOrEqualTo(String value) {
            addCriterion("cook_label <=", value, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelLike(String value) {
            addCriterion("cook_label like", value, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelNotLike(String value) {
            addCriterion("cook_label not like", value, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelIn(List<String> values) {
            addCriterion("cook_label in", values, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelNotIn(List<String> values) {
            addCriterion("cook_label not in", values, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelBetween(String value1, String value2) {
            addCriterion("cook_label between", value1, value2, "cookLabel");
            return (Criteria) this;
        }

        public Criteria andCookLabelNotBetween(String value1, String value2) {
            addCriterion("cook_label not between", value1, value2, "cookLabel");
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