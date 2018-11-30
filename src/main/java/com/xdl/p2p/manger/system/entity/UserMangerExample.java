package com.xdl.p2p.manger.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMangerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMangerExample() {
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

        public Criteria andUseridmIsNull() {
            addCriterion("userIDM is null");
            return (Criteria) this;
        }

        public Criteria andUseridmIsNotNull() {
            addCriterion("userIDM is not null");
            return (Criteria) this;
        }

        public Criteria andUseridmEqualTo(Long value) {
            addCriterion("userIDM =", value, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmNotEqualTo(Long value) {
            addCriterion("userIDM <>", value, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmGreaterThan(Long value) {
            addCriterion("userIDM >", value, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmGreaterThanOrEqualTo(Long value) {
            addCriterion("userIDM >=", value, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmLessThan(Long value) {
            addCriterion("userIDM <", value, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmLessThanOrEqualTo(Long value) {
            addCriterion("userIDM <=", value, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmIn(List<Long> values) {
            addCriterion("userIDM in", values, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmNotIn(List<Long> values) {
            addCriterion("userIDM not in", values, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmBetween(Long value1, Long value2) {
            addCriterion("userIDM between", value1, value2, "useridm");
            return (Criteria) this;
        }

        public Criteria andUseridmNotBetween(Long value1, Long value2) {
            addCriterion("userIDM not between", value1, value2, "useridm");
            return (Criteria) this;
        }

        public Criteria andUsernamemIsNull() {
            addCriterion("usernameM is null");
            return (Criteria) this;
        }

        public Criteria andUsernamemIsNotNull() {
            addCriterion("usernameM is not null");
            return (Criteria) this;
        }

        public Criteria andUsernamemEqualTo(String value) {
            addCriterion("usernameM =", value, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemNotEqualTo(String value) {
            addCriterion("usernameM <>", value, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemGreaterThan(String value) {
            addCriterion("usernameM >", value, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemGreaterThanOrEqualTo(String value) {
            addCriterion("usernameM >=", value, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemLessThan(String value) {
            addCriterion("usernameM <", value, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemLessThanOrEqualTo(String value) {
            addCriterion("usernameM <=", value, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemLike(String value) {
            addCriterion("usernameM like", value, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemNotLike(String value) {
            addCriterion("usernameM not like", value, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemIn(List<String> values) {
            addCriterion("usernameM in", values, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemNotIn(List<String> values) {
            addCriterion("usernameM not in", values, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemBetween(String value1, String value2) {
            addCriterion("usernameM between", value1, value2, "usernamem");
            return (Criteria) this;
        }

        public Criteria andUsernamemNotBetween(String value1, String value2) {
            addCriterion("usernameM not between", value1, value2, "usernamem");
            return (Criteria) this;
        }

        public Criteria andPasswordmIsNull() {
            addCriterion("passwordM is null");
            return (Criteria) this;
        }

        public Criteria andPasswordmIsNotNull() {
            addCriterion("passwordM is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordmEqualTo(String value) {
            addCriterion("passwordM =", value, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmNotEqualTo(String value) {
            addCriterion("passwordM <>", value, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmGreaterThan(String value) {
            addCriterion("passwordM >", value, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmGreaterThanOrEqualTo(String value) {
            addCriterion("passwordM >=", value, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmLessThan(String value) {
            addCriterion("passwordM <", value, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmLessThanOrEqualTo(String value) {
            addCriterion("passwordM <=", value, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmLike(String value) {
            addCriterion("passwordM like", value, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmNotLike(String value) {
            addCriterion("passwordM not like", value, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmIn(List<String> values) {
            addCriterion("passwordM in", values, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmNotIn(List<String> values) {
            addCriterion("passwordM not in", values, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmBetween(String value1, String value2) {
            addCriterion("passwordM between", value1, value2, "passwordm");
            return (Criteria) this;
        }

        public Criteria andPasswordmNotBetween(String value1, String value2) {
            addCriterion("passwordM not between", value1, value2, "passwordm");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("dr is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("dr is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Integer value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Integer value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Integer value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Integer value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Integer value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Integer> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Integer> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Integer value1, Integer value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Integer value1, Integer value2) {
            addCriterion("dr not between", value1, value2, "dr");
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