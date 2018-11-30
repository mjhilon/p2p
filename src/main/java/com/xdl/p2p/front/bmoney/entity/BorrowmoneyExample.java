package com.xdl.p2p.front.bmoney.entity;

import java.util.ArrayList;
import java.util.List;

public class BorrowmoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowmoneyExample() {
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

        public Criteria andBserialIsNull() {
            addCriterion("bserial is null");
            return (Criteria) this;
        }

        public Criteria andBserialIsNotNull() {
            addCriterion("bserial is not null");
            return (Criteria) this;
        }

        public Criteria andBserialEqualTo(String value) {
            addCriterion("bserial =", value, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialNotEqualTo(String value) {
            addCriterion("bserial <>", value, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialGreaterThan(String value) {
            addCriterion("bserial >", value, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialGreaterThanOrEqualTo(String value) {
            addCriterion("bserial >=", value, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialLessThan(String value) {
            addCriterion("bserial <", value, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialLessThanOrEqualTo(String value) {
            addCriterion("bserial <=", value, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialLike(String value) {
            addCriterion("bserial like", value, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialNotLike(String value) {
            addCriterion("bserial not like", value, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialIn(List<String> values) {
            addCriterion("bserial in", values, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialNotIn(List<String> values) {
            addCriterion("bserial not in", values, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialBetween(String value1, String value2) {
            addCriterion("bserial between", value1, value2, "bserial");
            return (Criteria) this;
        }

        public Criteria andBserialNotBetween(String value1, String value2) {
            addCriterion("bserial not between", value1, value2, "bserial");
            return (Criteria) this;
        }

        public Criteria andBuseridIsNull() {
            addCriterion("buserid is null");
            return (Criteria) this;
        }

        public Criteria andBuseridIsNotNull() {
            addCriterion("buserid is not null");
            return (Criteria) this;
        }

        public Criteria andBuseridEqualTo(String value) {
            addCriterion("buserid =", value, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridNotEqualTo(String value) {
            addCriterion("buserid <>", value, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridGreaterThan(String value) {
            addCriterion("buserid >", value, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridGreaterThanOrEqualTo(String value) {
            addCriterion("buserid >=", value, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridLessThan(String value) {
            addCriterion("buserid <", value, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridLessThanOrEqualTo(String value) {
            addCriterion("buserid <=", value, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridLike(String value) {
            addCriterion("buserid like", value, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridNotLike(String value) {
            addCriterion("buserid not like", value, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridIn(List<String> values) {
            addCriterion("buserid in", values, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridNotIn(List<String> values) {
            addCriterion("buserid not in", values, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridBetween(String value1, String value2) {
            addCriterion("buserid between", value1, value2, "buserid");
            return (Criteria) this;
        }

        public Criteria andBuseridNotBetween(String value1, String value2) {
            addCriterion("buserid not between", value1, value2, "buserid");
            return (Criteria) this;
        }

        public Criteria andBusernameIsNull() {
            addCriterion("busername is null");
            return (Criteria) this;
        }

        public Criteria andBusernameIsNotNull() {
            addCriterion("busername is not null");
            return (Criteria) this;
        }

        public Criteria andBusernameEqualTo(String value) {
            addCriterion("busername =", value, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameNotEqualTo(String value) {
            addCriterion("busername <>", value, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameGreaterThan(String value) {
            addCriterion("busername >", value, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameGreaterThanOrEqualTo(String value) {
            addCriterion("busername >=", value, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameLessThan(String value) {
            addCriterion("busername <", value, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameLessThanOrEqualTo(String value) {
            addCriterion("busername <=", value, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameLike(String value) {
            addCriterion("busername like", value, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameNotLike(String value) {
            addCriterion("busername not like", value, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameIn(List<String> values) {
            addCriterion("busername in", values, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameNotIn(List<String> values) {
            addCriterion("busername not in", values, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameBetween(String value1, String value2) {
            addCriterion("busername between", value1, value2, "busername");
            return (Criteria) this;
        }

        public Criteria andBusernameNotBetween(String value1, String value2) {
            addCriterion("busername not between", value1, value2, "busername");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNull() {
            addCriterion("bphone is null");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNotNull() {
            addCriterion("bphone is not null");
            return (Criteria) this;
        }

        public Criteria andBphoneEqualTo(String value) {
            addCriterion("bphone =", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotEqualTo(String value) {
            addCriterion("bphone <>", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThan(String value) {
            addCriterion("bphone >", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThanOrEqualTo(String value) {
            addCriterion("bphone >=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThan(String value) {
            addCriterion("bphone <", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThanOrEqualTo(String value) {
            addCriterion("bphone <=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLike(String value) {
            addCriterion("bphone like", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotLike(String value) {
            addCriterion("bphone not like", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneIn(List<String> values) {
            addCriterion("bphone in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotIn(List<String> values) {
            addCriterion("bphone not in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneBetween(String value1, String value2) {
            addCriterion("bphone between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotBetween(String value1, String value2) {
            addCriterion("bphone not between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBtypeIsNull() {
            addCriterion("btype is null");
            return (Criteria) this;
        }

        public Criteria andBtypeIsNotNull() {
            addCriterion("btype is not null");
            return (Criteria) this;
        }

        public Criteria andBtypeEqualTo(String value) {
            addCriterion("btype =", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotEqualTo(String value) {
            addCriterion("btype <>", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeGreaterThan(String value) {
            addCriterion("btype >", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeGreaterThanOrEqualTo(String value) {
            addCriterion("btype >=", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLessThan(String value) {
            addCriterion("btype <", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLessThanOrEqualTo(String value) {
            addCriterion("btype <=", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLike(String value) {
            addCriterion("btype like", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotLike(String value) {
            addCriterion("btype not like", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeIn(List<String> values) {
            addCriterion("btype in", values, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotIn(List<String> values) {
            addCriterion("btype not in", values, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeBetween(String value1, String value2) {
            addCriterion("btype between", value1, value2, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotBetween(String value1, String value2) {
            addCriterion("btype not between", value1, value2, "btype");
            return (Criteria) this;
        }

        public Criteria andBtitleIsNull() {
            addCriterion("btitle is null");
            return (Criteria) this;
        }

        public Criteria andBtitleIsNotNull() {
            addCriterion("btitle is not null");
            return (Criteria) this;
        }

        public Criteria andBtitleEqualTo(String value) {
            addCriterion("btitle =", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotEqualTo(String value) {
            addCriterion("btitle <>", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleGreaterThan(String value) {
            addCriterion("btitle >", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleGreaterThanOrEqualTo(String value) {
            addCriterion("btitle >=", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLessThan(String value) {
            addCriterion("btitle <", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLessThanOrEqualTo(String value) {
            addCriterion("btitle <=", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLike(String value) {
            addCriterion("btitle like", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotLike(String value) {
            addCriterion("btitle not like", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleIn(List<String> values) {
            addCriterion("btitle in", values, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotIn(List<String> values) {
            addCriterion("btitle not in", values, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleBetween(String value1, String value2) {
            addCriterion("btitle between", value1, value2, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotBetween(String value1, String value2) {
            addCriterion("btitle not between", value1, value2, "btitle");
            return (Criteria) this;
        }

        public Criteria andBmoneyIsNull() {
            addCriterion("bmoney is null");
            return (Criteria) this;
        }

        public Criteria andBmoneyIsNotNull() {
            addCriterion("bmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBmoneyEqualTo(String value) {
            addCriterion("bmoney =", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotEqualTo(String value) {
            addCriterion("bmoney <>", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyGreaterThan(String value) {
            addCriterion("bmoney >", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("bmoney >=", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLessThan(String value) {
            addCriterion("bmoney <", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLessThanOrEqualTo(String value) {
            addCriterion("bmoney <=", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLike(String value) {
            addCriterion("bmoney like", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotLike(String value) {
            addCriterion("bmoney not like", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyIn(List<String> values) {
            addCriterion("bmoney in", values, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotIn(List<String> values) {
            addCriterion("bmoney not in", values, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyBetween(String value1, String value2) {
            addCriterion("bmoney between", value1, value2, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotBetween(String value1, String value2) {
            addCriterion("bmoney not between", value1, value2, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBrateIsNull() {
            addCriterion("brate is null");
            return (Criteria) this;
        }

        public Criteria andBrateIsNotNull() {
            addCriterion("brate is not null");
            return (Criteria) this;
        }

        public Criteria andBrateEqualTo(String value) {
            addCriterion("brate =", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateNotEqualTo(String value) {
            addCriterion("brate <>", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateGreaterThan(String value) {
            addCriterion("brate >", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateGreaterThanOrEqualTo(String value) {
            addCriterion("brate >=", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateLessThan(String value) {
            addCriterion("brate <", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateLessThanOrEqualTo(String value) {
            addCriterion("brate <=", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateLike(String value) {
            addCriterion("brate like", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateNotLike(String value) {
            addCriterion("brate not like", value, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateIn(List<String> values) {
            addCriterion("brate in", values, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateNotIn(List<String> values) {
            addCriterion("brate not in", values, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateBetween(String value1, String value2) {
            addCriterion("brate between", value1, value2, "brate");
            return (Criteria) this;
        }

        public Criteria andBrateNotBetween(String value1, String value2) {
            addCriterion("brate not between", value1, value2, "brate");
            return (Criteria) this;
        }

        public Criteria andBtimelimitIsNull() {
            addCriterion("btimelimit is null");
            return (Criteria) this;
        }

        public Criteria andBtimelimitIsNotNull() {
            addCriterion("btimelimit is not null");
            return (Criteria) this;
        }

        public Criteria andBtimelimitEqualTo(String value) {
            addCriterion("btimelimit =", value, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitNotEqualTo(String value) {
            addCriterion("btimelimit <>", value, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitGreaterThan(String value) {
            addCriterion("btimelimit >", value, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitGreaterThanOrEqualTo(String value) {
            addCriterion("btimelimit >=", value, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitLessThan(String value) {
            addCriterion("btimelimit <", value, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitLessThanOrEqualTo(String value) {
            addCriterion("btimelimit <=", value, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitLike(String value) {
            addCriterion("btimelimit like", value, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitNotLike(String value) {
            addCriterion("btimelimit not like", value, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitIn(List<String> values) {
            addCriterion("btimelimit in", values, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitNotIn(List<String> values) {
            addCriterion("btimelimit not in", values, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitBetween(String value1, String value2) {
            addCriterion("btimelimit between", value1, value2, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBtimelimitNotBetween(String value1, String value2) {
            addCriterion("btimelimit not between", value1, value2, "btimelimit");
            return (Criteria) this;
        }

        public Criteria andBlimitIsNull() {
            addCriterion("blimit is null");
            return (Criteria) this;
        }

        public Criteria andBlimitIsNotNull() {
            addCriterion("blimit is not null");
            return (Criteria) this;
        }

        public Criteria andBlimitEqualTo(String value) {
            addCriterion("blimit =", value, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitNotEqualTo(String value) {
            addCriterion("blimit <>", value, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitGreaterThan(String value) {
            addCriterion("blimit >", value, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitGreaterThanOrEqualTo(String value) {
            addCriterion("blimit >=", value, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitLessThan(String value) {
            addCriterion("blimit <", value, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitLessThanOrEqualTo(String value) {
            addCriterion("blimit <=", value, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitLike(String value) {
            addCriterion("blimit like", value, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitNotLike(String value) {
            addCriterion("blimit not like", value, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitIn(List<String> values) {
            addCriterion("blimit in", values, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitNotIn(List<String> values) {
            addCriterion("blimit not in", values, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitBetween(String value1, String value2) {
            addCriterion("blimit between", value1, value2, "blimit");
            return (Criteria) this;
        }

        public Criteria andBlimitNotBetween(String value1, String value2) {
            addCriterion("blimit not between", value1, value2, "blimit");
            return (Criteria) this;
        }

        public Criteria andBstateIsNull() {
            addCriterion("bstate is null");
            return (Criteria) this;
        }

        public Criteria andBstateIsNotNull() {
            addCriterion("bstate is not null");
            return (Criteria) this;
        }

        public Criteria andBstateEqualTo(String value) {
            addCriterion("bstate =", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotEqualTo(String value) {
            addCriterion("bstate <>", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateGreaterThan(String value) {
            addCriterion("bstate >", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateGreaterThanOrEqualTo(String value) {
            addCriterion("bstate >=", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateLessThan(String value) {
            addCriterion("bstate <", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateLessThanOrEqualTo(String value) {
            addCriterion("bstate <=", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateLike(String value) {
            addCriterion("bstate like", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotLike(String value) {
            addCriterion("bstate not like", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateIn(List<String> values) {
            addCriterion("bstate in", values, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotIn(List<String> values) {
            addCriterion("bstate not in", values, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateBetween(String value1, String value2) {
            addCriterion("bstate between", value1, value2, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotBetween(String value1, String value2) {
            addCriterion("bstate not between", value1, value2, "bstate");
            return (Criteria) this;
        }

        public Criteria andBrecommendIsNull() {
            addCriterion("brecommend is null");
            return (Criteria) this;
        }

        public Criteria andBrecommendIsNotNull() {
            addCriterion("brecommend is not null");
            return (Criteria) this;
        }

        public Criteria andBrecommendEqualTo(String value) {
            addCriterion("brecommend =", value, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendNotEqualTo(String value) {
            addCriterion("brecommend <>", value, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendGreaterThan(String value) {
            addCriterion("brecommend >", value, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendGreaterThanOrEqualTo(String value) {
            addCriterion("brecommend >=", value, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendLessThan(String value) {
            addCriterion("brecommend <", value, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendLessThanOrEqualTo(String value) {
            addCriterion("brecommend <=", value, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendLike(String value) {
            addCriterion("brecommend like", value, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendNotLike(String value) {
            addCriterion("brecommend not like", value, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendIn(List<String> values) {
            addCriterion("brecommend in", values, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendNotIn(List<String> values) {
            addCriterion("brecommend not in", values, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendBetween(String value1, String value2) {
            addCriterion("brecommend between", value1, value2, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBrecommendNotBetween(String value1, String value2) {
            addCriterion("brecommend not between", value1, value2, "brecommend");
            return (Criteria) this;
        }

        public Criteria andBleixingIsNull() {
            addCriterion("bleixing is null");
            return (Criteria) this;
        }

        public Criteria andBleixingIsNotNull() {
            addCriterion("bleixing is not null");
            return (Criteria) this;
        }

        public Criteria andBleixingEqualTo(String value) {
            addCriterion("bleixing =", value, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingNotEqualTo(String value) {
            addCriterion("bleixing <>", value, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingGreaterThan(String value) {
            addCriterion("bleixing >", value, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingGreaterThanOrEqualTo(String value) {
            addCriterion("bleixing >=", value, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingLessThan(String value) {
            addCriterion("bleixing <", value, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingLessThanOrEqualTo(String value) {
            addCriterion("bleixing <=", value, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingLike(String value) {
            addCriterion("bleixing like", value, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingNotLike(String value) {
            addCriterion("bleixing not like", value, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingIn(List<String> values) {
            addCriterion("bleixing in", values, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingNotIn(List<String> values) {
            addCriterion("bleixing not in", values, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingBetween(String value1, String value2) {
            addCriterion("bleixing between", value1, value2, "bleixing");
            return (Criteria) this;
        }

        public Criteria andBleixingNotBetween(String value1, String value2) {
            addCriterion("bleixing not between", value1, value2, "bleixing");
            return (Criteria) this;
        }

        public Criteria andNote1IsNull() {
            addCriterion("note1 is null");
            return (Criteria) this;
        }

        public Criteria andNote1IsNotNull() {
            addCriterion("note1 is not null");
            return (Criteria) this;
        }

        public Criteria andNote1EqualTo(String value) {
            addCriterion("note1 =", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotEqualTo(String value) {
            addCriterion("note1 <>", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1GreaterThan(String value) {
            addCriterion("note1 >", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1GreaterThanOrEqualTo(String value) {
            addCriterion("note1 >=", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1LessThan(String value) {
            addCriterion("note1 <", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1LessThanOrEqualTo(String value) {
            addCriterion("note1 <=", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1Like(String value) {
            addCriterion("note1 like", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotLike(String value) {
            addCriterion("note1 not like", value, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1In(List<String> values) {
            addCriterion("note1 in", values, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotIn(List<String> values) {
            addCriterion("note1 not in", values, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1Between(String value1, String value2) {
            addCriterion("note1 between", value1, value2, "note1");
            return (Criteria) this;
        }

        public Criteria andNote1NotBetween(String value1, String value2) {
            addCriterion("note1 not between", value1, value2, "note1");
            return (Criteria) this;
        }

        public Criteria andNote2IsNull() {
            addCriterion("note2 is null");
            return (Criteria) this;
        }

        public Criteria andNote2IsNotNull() {
            addCriterion("note2 is not null");
            return (Criteria) this;
        }

        public Criteria andNote2EqualTo(String value) {
            addCriterion("note2 =", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2NotEqualTo(String value) {
            addCriterion("note2 <>", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2GreaterThan(String value) {
            addCriterion("note2 >", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2GreaterThanOrEqualTo(String value) {
            addCriterion("note2 >=", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2LessThan(String value) {
            addCriterion("note2 <", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2LessThanOrEqualTo(String value) {
            addCriterion("note2 <=", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2Like(String value) {
            addCriterion("note2 like", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2NotLike(String value) {
            addCriterion("note2 not like", value, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2In(List<String> values) {
            addCriterion("note2 in", values, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2NotIn(List<String> values) {
            addCriterion("note2 not in", values, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2Between(String value1, String value2) {
            addCriterion("note2 between", value1, value2, "note2");
            return (Criteria) this;
        }

        public Criteria andNote2NotBetween(String value1, String value2) {
            addCriterion("note2 not between", value1, value2, "note2");
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