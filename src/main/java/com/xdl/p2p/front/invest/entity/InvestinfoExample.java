package com.xdl.p2p.front.invest.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvestinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvestinfoExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBrrowidIsNull() {
            addCriterion("brrowid is null");
            return (Criteria) this;
        }

        public Criteria andBrrowidIsNotNull() {
            addCriterion("brrowid is not null");
            return (Criteria) this;
        }

        public Criteria andBrrowidEqualTo(Integer value) {
            addCriterion("brrowid =", value, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidNotEqualTo(Integer value) {
            addCriterion("brrowid <>", value, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidGreaterThan(Integer value) {
            addCriterion("brrowid >", value, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brrowid >=", value, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidLessThan(Integer value) {
            addCriterion("brrowid <", value, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidLessThanOrEqualTo(Integer value) {
            addCriterion("brrowid <=", value, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidIn(List<Integer> values) {
            addCriterion("brrowid in", values, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidNotIn(List<Integer> values) {
            addCriterion("brrowid not in", values, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidBetween(Integer value1, Integer value2) {
            addCriterion("brrowid between", value1, value2, "brrowid");
            return (Criteria) this;
        }

        public Criteria andBrrowidNotBetween(Integer value1, Integer value2) {
            addCriterion("brrowid not between", value1, value2, "brrowid");
            return (Criteria) this;
        }

        public Criteria andInmoneyIsNull() {
            addCriterion("inmoney is null");
            return (Criteria) this;
        }

        public Criteria andInmoneyIsNotNull() {
            addCriterion("inmoney is not null");
            return (Criteria) this;
        }

        public Criteria andInmoneyEqualTo(BigDecimal value) {
            addCriterion("inmoney =", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyNotEqualTo(BigDecimal value) {
            addCriterion("inmoney <>", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyGreaterThan(BigDecimal value) {
            addCriterion("inmoney >", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inmoney >=", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyLessThan(BigDecimal value) {
            addCriterion("inmoney <", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inmoney <=", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyIn(List<BigDecimal> values) {
            addCriterion("inmoney in", values, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyNotIn(List<BigDecimal> values) {
            addCriterion("inmoney not in", values, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inmoney between", value1, value2, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inmoney not between", value1, value2, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInstatusIsNull() {
            addCriterion("instatus is null");
            return (Criteria) this;
        }

        public Criteria andInstatusIsNotNull() {
            addCriterion("instatus is not null");
            return (Criteria) this;
        }

        public Criteria andInstatusEqualTo(String value) {
            addCriterion("instatus =", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusNotEqualTo(String value) {
            addCriterion("instatus <>", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusGreaterThan(String value) {
            addCriterion("instatus >", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusGreaterThanOrEqualTo(String value) {
            addCriterion("instatus >=", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusLessThan(String value) {
            addCriterion("instatus <", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusLessThanOrEqualTo(String value) {
            addCriterion("instatus <=", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusLike(String value) {
            addCriterion("instatus like", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusNotLike(String value) {
            addCriterion("instatus not like", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusIn(List<String> values) {
            addCriterion("instatus in", values, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusNotIn(List<String> values) {
            addCriterion("instatus not in", values, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusBetween(String value1, String value2) {
            addCriterion("instatus between", value1, value2, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusNotBetween(String value1, String value2) {
            addCriterion("instatus not between", value1, value2, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstyleIsNull() {
            addCriterion("instyle is null");
            return (Criteria) this;
        }

        public Criteria andInstyleIsNotNull() {
            addCriterion("instyle is not null");
            return (Criteria) this;
        }

        public Criteria andInstyleEqualTo(String value) {
            addCriterion("instyle =", value, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleNotEqualTo(String value) {
            addCriterion("instyle <>", value, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleGreaterThan(String value) {
            addCriterion("instyle >", value, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleGreaterThanOrEqualTo(String value) {
            addCriterion("instyle >=", value, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleLessThan(String value) {
            addCriterion("instyle <", value, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleLessThanOrEqualTo(String value) {
            addCriterion("instyle <=", value, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleLike(String value) {
            addCriterion("instyle like", value, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleNotLike(String value) {
            addCriterion("instyle not like", value, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleIn(List<String> values) {
            addCriterion("instyle in", values, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleNotIn(List<String> values) {
            addCriterion("instyle not in", values, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleBetween(String value1, String value2) {
            addCriterion("instyle between", value1, value2, "instyle");
            return (Criteria) this;
        }

        public Criteria andInstyleNotBetween(String value1, String value2) {
            addCriterion("instyle not between", value1, value2, "instyle");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusIsNull() {
            addCriterion("brrowstatus is null");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusIsNotNull() {
            addCriterion("brrowstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusEqualTo(String value) {
            addCriterion("brrowstatus =", value, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusNotEqualTo(String value) {
            addCriterion("brrowstatus <>", value, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusGreaterThan(String value) {
            addCriterion("brrowstatus >", value, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusGreaterThanOrEqualTo(String value) {
            addCriterion("brrowstatus >=", value, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusLessThan(String value) {
            addCriterion("brrowstatus <", value, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusLessThanOrEqualTo(String value) {
            addCriterion("brrowstatus <=", value, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusLike(String value) {
            addCriterion("brrowstatus like", value, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusNotLike(String value) {
            addCriterion("brrowstatus not like", value, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusIn(List<String> values) {
            addCriterion("brrowstatus in", values, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusNotIn(List<String> values) {
            addCriterion("brrowstatus not in", values, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusBetween(String value1, String value2) {
            addCriterion("brrowstatus between", value1, value2, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andBrrowstatusNotBetween(String value1, String value2) {
            addCriterion("brrowstatus not between", value1, value2, "brrowstatus");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(String value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(String value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(String value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(String value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(String value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(String value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLike(String value) {
            addCriterion("interest like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotLike(String value) {
            addCriterion("interest not like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<String> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<String> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(String value1, String value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(String value1, String value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andProfitmodelIsNull() {
            addCriterion("profitmodel is null");
            return (Criteria) this;
        }

        public Criteria andProfitmodelIsNotNull() {
            addCriterion("profitmodel is not null");
            return (Criteria) this;
        }

        public Criteria andProfitmodelEqualTo(String value) {
            addCriterion("profitmodel =", value, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelNotEqualTo(String value) {
            addCriterion("profitmodel <>", value, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelGreaterThan(String value) {
            addCriterion("profitmodel >", value, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelGreaterThanOrEqualTo(String value) {
            addCriterion("profitmodel >=", value, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelLessThan(String value) {
            addCriterion("profitmodel <", value, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelLessThanOrEqualTo(String value) {
            addCriterion("profitmodel <=", value, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelLike(String value) {
            addCriterion("profitmodel like", value, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelNotLike(String value) {
            addCriterion("profitmodel not like", value, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelIn(List<String> values) {
            addCriterion("profitmodel in", values, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelNotIn(List<String> values) {
            addCriterion("profitmodel not in", values, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelBetween(String value1, String value2) {
            addCriterion("profitmodel between", value1, value2, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmodelNotBetween(String value1, String value2) {
            addCriterion("profitmodel not between", value1, value2, "profitmodel");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyIsNull() {
            addCriterion("profitmoney is null");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyIsNotNull() {
            addCriterion("profitmoney is not null");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyEqualTo(BigDecimal value) {
            addCriterion("profitmoney =", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyNotEqualTo(BigDecimal value) {
            addCriterion("profitmoney <>", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyGreaterThan(BigDecimal value) {
            addCriterion("profitmoney >", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profitmoney >=", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyLessThan(BigDecimal value) {
            addCriterion("profitmoney <", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profitmoney <=", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyIn(List<BigDecimal> values) {
            addCriterion("profitmoney in", values, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyNotIn(List<BigDecimal> values) {
            addCriterion("profitmoney not in", values, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profitmoney between", value1, value2, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profitmoney not between", value1, value2, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("indate is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("indate is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(Date value) {
            addCriterion("indate =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(Date value) {
            addCriterion("indate <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(Date value) {
            addCriterion("indate >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(Date value) {
            addCriterion("indate >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(Date value) {
            addCriterion("indate <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(Date value) {
            addCriterion("indate <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<Date> values) {
            addCriterion("indate in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<Date> values) {
            addCriterion("indate not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(Date value1, Date value2) {
            addCriterion("indate between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(Date value1, Date value2) {
            addCriterion("indate not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andReplaydateIsNull() {
            addCriterion("replaydate is null");
            return (Criteria) this;
        }

        public Criteria andReplaydateIsNotNull() {
            addCriterion("replaydate is not null");
            return (Criteria) this;
        }

        public Criteria andReplaydateEqualTo(String value) {
            addCriterion("replaydate =", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateNotEqualTo(String value) {
            addCriterion("replaydate <>", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateGreaterThan(String value) {
            addCriterion("replaydate >", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateGreaterThanOrEqualTo(String value) {
            addCriterion("replaydate >=", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateLessThan(String value) {
            addCriterion("replaydate <", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateLessThanOrEqualTo(String value) {
            addCriterion("replaydate <=", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateLike(String value) {
            addCriterion("replaydate like", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateNotLike(String value) {
            addCriterion("replaydate not like", value, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateIn(List<String> values) {
            addCriterion("replaydate in", values, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateNotIn(List<String> values) {
            addCriterion("replaydate not in", values, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateBetween(String value1, String value2) {
            addCriterion("replaydate between", value1, value2, "replaydate");
            return (Criteria) this;
        }

        public Criteria andReplaydateNotBetween(String value1, String value2) {
            addCriterion("replaydate not between", value1, value2, "replaydate");
            return (Criteria) this;
        }

        public Criteria andMarkstatusIsNull() {
            addCriterion("markstatus is null");
            return (Criteria) this;
        }

        public Criteria andMarkstatusIsNotNull() {
            addCriterion("markstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMarkstatusEqualTo(Integer value) {
            addCriterion("markstatus =", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusNotEqualTo(Integer value) {
            addCriterion("markstatus <>", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusGreaterThan(Integer value) {
            addCriterion("markstatus >", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("markstatus >=", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusLessThan(Integer value) {
            addCriterion("markstatus <", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusLessThanOrEqualTo(Integer value) {
            addCriterion("markstatus <=", value, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusIn(List<Integer> values) {
            addCriterion("markstatus in", values, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusNotIn(List<Integer> values) {
            addCriterion("markstatus not in", values, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusBetween(Integer value1, Integer value2) {
            addCriterion("markstatus between", value1, value2, "markstatus");
            return (Criteria) this;
        }

        public Criteria andMarkstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("markstatus not between", value1, value2, "markstatus");
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