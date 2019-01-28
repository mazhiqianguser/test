package com.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\28 0028 10:22
 * @Description:
 */
public class SysRoleExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria = new ArrayList();

    public SysRoleExample() {
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return this.orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public List<SysRoleExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(SysRoleExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public SysRoleExample.Criteria or() {
        SysRoleExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public SysRoleExample.Criteria createCriteria() {
        SysRoleExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected SysRoleExample.Criteria createCriteriaInternal() {
        SysRoleExample.Criteria criteria = new SysRoleExample.Criteria();
        return criteria;
    }

    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
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
            return this.condition;
        }

        public Object getValue() {
            return this.value;
        }

        public Object getSecondValue() {
            return this.secondValue;
        }

        public boolean isNoValue() {
            return this.noValue;
        }

        public boolean isSingleValue() {
            return this.singleValue;
        }

        public boolean isBetweenValue() {
            return this.betweenValue;
        }

        public boolean isListValue() {
            return this.listValue;
        }

        public String getTypeHandler() {
            return this.typeHandler;
        }

        protected Criterion(String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }

        }

        protected Criterion(String condition, Object value) {
            this(condition, value, (String)null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, (String)null);
        }
    }

    public static class Criteria extends SysRoleExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<SysRoleExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<SysRoleExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<SysRoleExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new SysRoleExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new SysRoleExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new SysRoleExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public SysRoleExample.Criteria andRole_idIsNull() {
            this.addCriterion("role_id is null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idIsNotNull() {
            this.addCriterion("role_id is not null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idEqualTo(Integer value) {
            this.addCriterion("role_id =", value, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idNotEqualTo(Integer value) {
            this.addCriterion("role_id <>", value, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idGreaterThan(Integer value) {
            this.addCriterion("role_id >", value, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("role_id >=", value, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idLessThan(Integer value) {
            this.addCriterion("role_id <", value, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idLessThanOrEqualTo(Integer value) {
            this.addCriterion("role_id <=", value, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idIn(List<Integer> values) {
            this.addCriterion("role_id in", values, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idNotIn(List<Integer> values) {
            this.addCriterion("role_id not in", values, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idBetween(Integer value1, Integer value2) {
            this.addCriterion("role_id between", value1, value2, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_idNotBetween(Integer value1, Integer value2) {
            this.addCriterion("role_id not between", value1, value2, "role_id");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameIsNull() {
            this.addCriterion("role_name is null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameIsNotNull() {
            this.addCriterion("role_name is not null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameEqualTo(String value) {
            this.addCriterion("role_name =", value, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameNotEqualTo(String value) {
            this.addCriterion("role_name <>", value, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameGreaterThan(String value) {
            this.addCriterion("role_name >", value, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameGreaterThanOrEqualTo(String value) {
            this.addCriterion("role_name >=", value, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameLessThan(String value) {
            this.addCriterion("role_name <", value, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameLessThanOrEqualTo(String value) {
            this.addCriterion("role_name <=", value, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameLike(String value) {
            this.addCriterion("role_name like", value, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameNotLike(String value) {
            this.addCriterion("role_name not like", value, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameIn(List<String> values) {
            this.addCriterion("role_name in", values, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameNotIn(List<String> values) {
            this.addCriterion("role_name not in", values, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameBetween(String value1, String value2) {
            this.addCriterion("role_name between", value1, value2, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_nameNotBetween(String value1, String value2) {
            this.addCriterion("role_name not between", value1, value2, "role_name");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateIsNull() {
            this.addCriterion("role_state is null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateIsNotNull() {
            this.addCriterion("role_state is not null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateEqualTo(Integer value) {
            this.addCriterion("role_state =", value, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateNotEqualTo(Integer value) {
            this.addCriterion("role_state <>", value, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateGreaterThan(Integer value) {
            this.addCriterion("role_state >", value, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("role_state >=", value, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateLessThan(Integer value) {
            this.addCriterion("role_state <", value, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateLessThanOrEqualTo(Integer value) {
            this.addCriterion("role_state <=", value, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateIn(List<Integer> values) {
            this.addCriterion("role_state in", values, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateNotIn(List<Integer> values) {
            this.addCriterion("role_state not in", values, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateBetween(Integer value1, Integer value2) {
            this.addCriterion("role_state between", value1, value2, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_stateNotBetween(Integer value1, Integer value2) {
            this.addCriterion("role_state not between", value1, value2, "role_state");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeIsNull() {
            this.addCriterion("role_code is null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeIsNotNull() {
            this.addCriterion("role_code is not null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeEqualTo(String value) {
            this.addCriterion("role_code =", value, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeNotEqualTo(String value) {
            this.addCriterion("role_code <>", value, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeGreaterThan(String value) {
            this.addCriterion("role_code >", value, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeGreaterThanOrEqualTo(String value) {
            this.addCriterion("role_code >=", value, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeLessThan(String value) {
            this.addCriterion("role_code <", value, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeLessThanOrEqualTo(String value) {
            this.addCriterion("role_code <=", value, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeLike(String value) {
            this.addCriterion("role_code like", value, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeNotLike(String value) {
            this.addCriterion("role_code not like", value, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeIn(List<String> values) {
            this.addCriterion("role_code in", values, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeNotIn(List<String> values) {
            this.addCriterion("role_code not in", values, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeBetween(String value1, String value2) {
            this.addCriterion("role_code between", value1, value2, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_codeNotBetween(String value1, String value2) {
            this.addCriterion("role_code not between", value1, value2, "role_code");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeIsNull() {
            this.addCriterion("role_describe is null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeIsNotNull() {
            this.addCriterion("role_describe is not null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeEqualTo(String value) {
            this.addCriterion("role_describe =", value, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeNotEqualTo(String value) {
            this.addCriterion("role_describe <>", value, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeGreaterThan(String value) {
            this.addCriterion("role_describe >", value, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeGreaterThanOrEqualTo(String value) {
            this.addCriterion("role_describe >=", value, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeLessThan(String value) {
            this.addCriterion("role_describe <", value, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeLessThanOrEqualTo(String value) {
            this.addCriterion("role_describe <=", value, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeLike(String value) {
            this.addCriterion("role_describe like", value, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeNotLike(String value) {
            this.addCriterion("role_describe not like", value, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeIn(List<String> values) {
            this.addCriterion("role_describe in", values, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeNotIn(List<String> values) {
            this.addCriterion("role_describe not in", values, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeBetween(String value1, String value2) {
            this.addCriterion("role_describe between", value1, value2, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andRole_describeNotBetween(String value1, String value2) {
            this.addCriterion("role_describe not between", value1, value2, "role_describe");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeIsNull() {
            this.addCriterion("create_time is null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeIsNotNull() {
            this.addCriterion("create_time is not null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeEqualTo(Date value) {
            this.addCriterion("create_time =", value, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeNotEqualTo(Date value) {
            this.addCriterion("create_time <>", value, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeGreaterThan(Date value) {
            this.addCriterion("create_time >", value, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            this.addCriterion("create_time >=", value, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeLessThan(Date value) {
            this.addCriterion("create_time <", value, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            this.addCriterion("create_time <=", value, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeIn(List<Date> values) {
            this.addCriterion("create_time in", values, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeNotIn(List<Date> values) {
            this.addCriterion("create_time not in", values, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeBetween(Date value1, Date value2) {
            this.addCriterion("create_time between", value1, value2, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            this.addCriterion("create_time not between", value1, value2, "create_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeIsNull() {
            this.addCriterion("update_time is null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeIsNotNull() {
            this.addCriterion("update_time is not null");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeEqualTo(Date value) {
            this.addCriterion("update_time =", value, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeNotEqualTo(Date value) {
            this.addCriterion("update_time <>", value, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeGreaterThan(Date value) {
            this.addCriterion("update_time >", value, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            this.addCriterion("update_time >=", value, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeLessThan(Date value) {
            this.addCriterion("update_time <", value, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            this.addCriterion("update_time <=", value, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeIn(List<Date> values) {
            this.addCriterion("update_time in", values, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeNotIn(List<Date> values) {
            this.addCriterion("update_time not in", values, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeBetween(Date value1, Date value2) {
            this.addCriterion("update_time between", value1, value2, "update_time");
            return (SysRoleExample.Criteria)this;
        }

        public SysRoleExample.Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            this.addCriterion("update_time not between", value1, value2, "update_time");
            return (SysRoleExample.Criteria)this;
        }
    }
}
