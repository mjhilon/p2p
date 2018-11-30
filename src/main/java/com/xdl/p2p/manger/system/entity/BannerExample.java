package com.xdl.p2p.manger.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBannertypeIsNull() {
            addCriterion("bannerType is null");
            return (Criteria) this;
        }

        public Criteria andBannertypeIsNotNull() {
            addCriterion("bannerType is not null");
            return (Criteria) this;
        }

        public Criteria andBannertypeEqualTo(Long value) {
            addCriterion("bannerType =", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeNotEqualTo(Long value) {
            addCriterion("bannerType <>", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeGreaterThan(Long value) {
            addCriterion("bannerType >", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeGreaterThanOrEqualTo(Long value) {
            addCriterion("bannerType >=", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeLessThan(Long value) {
            addCriterion("bannerType <", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeLessThanOrEqualTo(Long value) {
            addCriterion("bannerType <=", value, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeIn(List<Long> values) {
            addCriterion("bannerType in", values, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeNotIn(List<Long> values) {
            addCriterion("bannerType not in", values, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeBetween(Long value1, Long value2) {
            addCriterion("bannerType between", value1, value2, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertypeNotBetween(Long value1, Long value2) {
            addCriterion("bannerType not between", value1, value2, "bannertype");
            return (Criteria) this;
        }

        public Criteria andBannertitleIsNull() {
            addCriterion("bannerTitle is null");
            return (Criteria) this;
        }

        public Criteria andBannertitleIsNotNull() {
            addCriterion("bannerTitle is not null");
            return (Criteria) this;
        }

        public Criteria andBannertitleEqualTo(String value) {
            addCriterion("bannerTitle =", value, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleNotEqualTo(String value) {
            addCriterion("bannerTitle <>", value, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleGreaterThan(String value) {
            addCriterion("bannerTitle >", value, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleGreaterThanOrEqualTo(String value) {
            addCriterion("bannerTitle >=", value, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleLessThan(String value) {
            addCriterion("bannerTitle <", value, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleLessThanOrEqualTo(String value) {
            addCriterion("bannerTitle <=", value, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleLike(String value) {
            addCriterion("bannerTitle like", value, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleNotLike(String value) {
            addCriterion("bannerTitle not like", value, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleIn(List<String> values) {
            addCriterion("bannerTitle in", values, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleNotIn(List<String> values) {
            addCriterion("bannerTitle not in", values, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleBetween(String value1, String value2) {
            addCriterion("bannerTitle between", value1, value2, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannertitleNotBetween(String value1, String value2) {
            addCriterion("bannerTitle not between", value1, value2, "bannertitle");
            return (Criteria) this;
        }

        public Criteria andBannerimgIsNull() {
            addCriterion("bannerimg is null");
            return (Criteria) this;
        }

        public Criteria andBannerimgIsNotNull() {
            addCriterion("bannerimg is not null");
            return (Criteria) this;
        }

        public Criteria andBannerimgEqualTo(String value) {
            addCriterion("bannerimg =", value, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgNotEqualTo(String value) {
            addCriterion("bannerimg <>", value, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgGreaterThan(String value) {
            addCriterion("bannerimg >", value, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgGreaterThanOrEqualTo(String value) {
            addCriterion("bannerimg >=", value, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgLessThan(String value) {
            addCriterion("bannerimg <", value, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgLessThanOrEqualTo(String value) {
            addCriterion("bannerimg <=", value, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgLike(String value) {
            addCriterion("bannerimg like", value, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgNotLike(String value) {
            addCriterion("bannerimg not like", value, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgIn(List<String> values) {
            addCriterion("bannerimg in", values, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgNotIn(List<String> values) {
            addCriterion("bannerimg not in", values, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgBetween(String value1, String value2) {
            addCriterion("bannerimg between", value1, value2, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andBannerimgNotBetween(String value1, String value2) {
            addCriterion("bannerimg not between", value1, value2, "bannerimg");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("is_use is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("is_use is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(Integer value) {
            addCriterion("is_use =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(Integer value) {
            addCriterion("is_use <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(Integer value) {
            addCriterion("is_use >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_use >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(Integer value) {
            addCriterion("is_use <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(Integer value) {
            addCriterion("is_use <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Integer> values) {
            addCriterion("is_use in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Integer> values) {
            addCriterion("is_use not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(Integer value1, Integer value2) {
            addCriterion("is_use between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_use not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("terminal_type is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("terminal_type is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(Integer value) {
            addCriterion("terminal_type =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(Integer value) {
            addCriterion("terminal_type <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(Integer value) {
            addCriterion("terminal_type >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminal_type >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(Integer value) {
            addCriterion("terminal_type <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(Integer value) {
            addCriterion("terminal_type <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<Integer> values) {
            addCriterion("terminal_type in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<Integer> values) {
            addCriterion("terminal_type not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(Integer value1, Integer value2) {
            addCriterion("terminal_type between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("terminal_type not between", value1, value2, "terminalType");
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

        public Criteria andBannerurlIsNull() {
            addCriterion("bannerUrl is null");
            return (Criteria) this;
        }

        public Criteria andBannerurlIsNotNull() {
            addCriterion("bannerUrl is not null");
            return (Criteria) this;
        }

        public Criteria andBannerurlEqualTo(String value) {
            addCriterion("bannerUrl =", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotEqualTo(String value) {
            addCriterion("bannerUrl <>", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlGreaterThan(String value) {
            addCriterion("bannerUrl >", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlGreaterThanOrEqualTo(String value) {
            addCriterion("bannerUrl >=", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLessThan(String value) {
            addCriterion("bannerUrl <", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLessThanOrEqualTo(String value) {
            addCriterion("bannerUrl <=", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLike(String value) {
            addCriterion("bannerUrl like", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotLike(String value) {
            addCriterion("bannerUrl not like", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlIn(List<String> values) {
            addCriterion("bannerUrl in", values, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotIn(List<String> values) {
            addCriterion("bannerUrl not in", values, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlBetween(String value1, String value2) {
            addCriterion("bannerUrl between", value1, value2, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotBetween(String value1, String value2) {
            addCriterion("bannerUrl not between", value1, value2, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannernoIsNull() {
            addCriterion("bannerno is null");
            return (Criteria) this;
        }

        public Criteria andBannernoIsNotNull() {
            addCriterion("bannerno is not null");
            return (Criteria) this;
        }

        public Criteria andBannernoEqualTo(Integer value) {
            addCriterion("bannerno =", value, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoNotEqualTo(Integer value) {
            addCriterion("bannerno <>", value, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoGreaterThan(Integer value) {
            addCriterion("bannerno >", value, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("bannerno >=", value, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoLessThan(Integer value) {
            addCriterion("bannerno <", value, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoLessThanOrEqualTo(Integer value) {
            addCriterion("bannerno <=", value, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoIn(List<Integer> values) {
            addCriterion("bannerno in", values, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoNotIn(List<Integer> values) {
            addCriterion("bannerno not in", values, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoBetween(Integer value1, Integer value2) {
            addCriterion("bannerno between", value1, value2, "bannerno");
            return (Criteria) this;
        }

        public Criteria andBannernoNotBetween(Integer value1, Integer value2) {
            addCriterion("bannerno not between", value1, value2, "bannerno");
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