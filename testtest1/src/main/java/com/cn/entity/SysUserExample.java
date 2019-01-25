package com.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 15:17
 * @Description:
 */
public class SysUserExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria = new ArrayList();

    public SysUserExample() {
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

    public List<SysUserExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(SysUserExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public SysUserExample.Criteria or() {
        SysUserExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public SysUserExample.Criteria createCriteria() {
        SysUserExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected SysUserExample.Criteria createCriteriaInternal() {
        SysUserExample.Criteria criteria = new SysUserExample.Criteria();
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

    public static class Criteria extends SysUserExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<SysUserExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<SysUserExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<SysUserExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new SysUserExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new SysUserExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new SysUserExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public SysUserExample.Criteria andUser_idIsNull() {
            this.addCriterion("user_id is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idIsNotNull() {
            this.addCriterion("user_id is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idEqualTo(Integer value) {
            this.addCriterion("user_id =", value, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idNotEqualTo(Integer value) {
            this.addCriterion("user_id <>", value, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idGreaterThan(Integer value) {
            this.addCriterion("user_id >", value, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("user_id >=", value, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idLessThan(Integer value) {
            this.addCriterion("user_id <", value, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idLessThanOrEqualTo(Integer value) {
            this.addCriterion("user_id <=", value, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idIn(List<Integer> values) {
            this.addCriterion("user_id in", values, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idNotIn(List<Integer> values) {
            this.addCriterion("user_id not in", values, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idBetween(Integer value1, Integer value2) {
            this.addCriterion("user_id between", value1, value2, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            this.addCriterion("user_id not between", value1, value2, "user_id");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameIsNull() {
            this.addCriterion("user_name is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameIsNotNull() {
            this.addCriterion("user_name is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameEqualTo(String value) {
            this.addCriterion("user_name =", value, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameNotEqualTo(String value) {
            this.addCriterion("user_name <>", value, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameGreaterThan(String value) {
            this.addCriterion("user_name >", value, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            this.addCriterion("user_name >=", value, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameLessThan(String value) {
            this.addCriterion("user_name <", value, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameLessThanOrEqualTo(String value) {
            this.addCriterion("user_name <=", value, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameLike(String value) {
            this.addCriterion("user_name like", value, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameNotLike(String value) {
            this.addCriterion("user_name not like", value, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameIn(List<String> values) {
            this.addCriterion("user_name in", values, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameNotIn(List<String> values) {
            this.addCriterion("user_name not in", values, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameBetween(String value1, String value2) {
            this.addCriterion("user_name between", value1, value2, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUser_nameNotBetween(String value1, String value2) {
            this.addCriterion("user_name not between", value1, value2, "user_name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordIsNull() {
            this.addCriterion("password is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordIsNotNull() {
            this.addCriterion("password is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordEqualTo(String value) {
            this.addCriterion("password =", value, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordNotEqualTo(String value) {
            this.addCriterion("password <>", value, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordGreaterThan(String value) {
            this.addCriterion("password >", value, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
            this.addCriterion("password >=", value, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordLessThan(String value) {
            this.addCriterion("password <", value, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
            this.addCriterion("password <=", value, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordLike(String value) {
            this.addCriterion("password like", value, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordNotLike(String value) {
            this.addCriterion("password not like", value, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordIn(List<String> values) {
            this.addCriterion("password in", values, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordNotIn(List<String> values) {
            this.addCriterion("password not in", values, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordBetween(String value1, String value2) {
            this.addCriterion("password between", value1, value2, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPasswordNotBetween(String value1, String value2) {
            this.addCriterion("password not between", value1, value2, "password");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameIsNull() {
            this.addCriterion("name is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameIsNotNull() {
            this.addCriterion("name is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameEqualTo(String value) {
            this.addCriterion("name =", value, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameNotEqualTo(String value) {
            this.addCriterion("name <>", value, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameGreaterThan(String value) {
            this.addCriterion("name >", value, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameGreaterThanOrEqualTo(String value) {
            this.addCriterion("name >=", value, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameLessThan(String value) {
            this.addCriterion("name <", value, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameLessThanOrEqualTo(String value) {
            this.addCriterion("name <=", value, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameLike(String value) {
            this.addCriterion("name like", value, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameNotLike(String value) {
            this.addCriterion("name not like", value, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameIn(List<String> values) {
            this.addCriterion("name in", values, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameNotIn(List<String> values) {
            this.addCriterion("name not in", values, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameBetween(String value1, String value2) {
            this.addCriterion("name between", value1, value2, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andNameNotBetween(String value1, String value2) {
            this.addCriterion("name not between", value1, value2, "name");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusIsNull() {
            this.addCriterion("status is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusIsNotNull() {
            this.addCriterion("status is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusEqualTo(Integer value) {
            this.addCriterion("status =", value, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusNotEqualTo(Integer value) {
            this.addCriterion("status <>", value, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusGreaterThan(Integer value) {
            this.addCriterion("status >", value, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("status >=", value, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusLessThan(Integer value) {
            this.addCriterion("status <", value, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
            this.addCriterion("status <=", value, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusIn(List<Integer> values) {
            this.addCriterion("status in", values, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusNotIn(List<Integer> values) {
            this.addCriterion("status not in", values, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusBetween(Integer value1, Integer value2) {
            this.addCriterion("status between", value1, value2, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
            this.addCriterion("status not between", value1, value2, "status");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginIsNull() {
            this.addCriterion("last_login is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginIsNotNull() {
            this.addCriterion("last_login is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginEqualTo(String value) {
            this.addCriterion("last_login =", value, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginNotEqualTo(String value) {
            this.addCriterion("last_login <>", value, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginGreaterThan(String value) {
            this.addCriterion("last_login >", value, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginGreaterThanOrEqualTo(String value) {
            this.addCriterion("last_login >=", value, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginLessThan(String value) {
            this.addCriterion("last_login <", value, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginLessThanOrEqualTo(String value) {
            this.addCriterion("last_login <=", value, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginLike(String value) {
            this.addCriterion("last_login like", value, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginNotLike(String value) {
            this.addCriterion("last_login not like", value, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginIn(List<String> values) {
            this.addCriterion("last_login in", values, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginNotIn(List<String> values) {
            this.addCriterion("last_login not in", values, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginBetween(String value1, String value2) {
            this.addCriterion("last_login between", value1, value2, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andLast_loginNotBetween(String value1, String value2) {
            this.addCriterion("last_login not between", value1, value2, "last_login");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpIsNull() {
            this.addCriterion("ip is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpIsNotNull() {
            this.addCriterion("ip is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpEqualTo(String value) {
            this.addCriterion("ip =", value, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpNotEqualTo(String value) {
            this.addCriterion("ip <>", value, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpGreaterThan(String value) {
            this.addCriterion("ip >", value, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpGreaterThanOrEqualTo(String value) {
            this.addCriterion("ip >=", value, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpLessThan(String value) {
            this.addCriterion("ip <", value, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpLessThanOrEqualTo(String value) {
            this.addCriterion("ip <=", value, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpLike(String value) {
            this.addCriterion("ip like", value, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpNotLike(String value) {
            this.addCriterion("ip not like", value, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpIn(List<String> values) {
            this.addCriterion("ip in", values, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpNotIn(List<String> values) {
            this.addCriterion("ip not in", values, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpBetween(String value1, String value2) {
            this.addCriterion("ip between", value1, value2, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andIpNotBetween(String value1, String value2) {
            this.addCriterion("ip not between", value1, value2, "ip");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailIsNull() {
            this.addCriterion("email is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailIsNotNull() {
            this.addCriterion("email is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailEqualTo(String value) {
            this.addCriterion("email =", value, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailNotEqualTo(String value) {
            this.addCriterion("email <>", value, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailGreaterThan(String value) {
            this.addCriterion("email >", value, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailGreaterThanOrEqualTo(String value) {
            this.addCriterion("email >=", value, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailLessThan(String value) {
            this.addCriterion("email <", value, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailLessThanOrEqualTo(String value) {
            this.addCriterion("email <=", value, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailLike(String value) {
            this.addCriterion("email like", value, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailNotLike(String value) {
            this.addCriterion("email not like", value, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailIn(List<String> values) {
            this.addCriterion("email in", values, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailNotIn(List<String> values) {
            this.addCriterion("email not in", values, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailBetween(String value1, String value2) {
            this.addCriterion("email between", value1, value2, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andEmailNotBetween(String value1, String value2) {
            this.addCriterion("email not between", value1, value2, "email");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneIsNull() {
            this.addCriterion("phone is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneIsNotNull() {
            this.addCriterion("phone is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneEqualTo(String value) {
            this.addCriterion("phone =", value, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneNotEqualTo(String value) {
            this.addCriterion("phone <>", value, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneGreaterThan(String value) {
            this.addCriterion("phone >", value, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneGreaterThanOrEqualTo(String value) {
            this.addCriterion("phone >=", value, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneLessThan(String value) {
            this.addCriterion("phone <", value, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneLessThanOrEqualTo(String value) {
            this.addCriterion("phone <=", value, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneLike(String value) {
            this.addCriterion("phone like", value, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneNotLike(String value) {
            this.addCriterion("phone not like", value, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneIn(List<String> values) {
            this.addCriterion("phone in", values, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneNotIn(List<String> values) {
            this.addCriterion("phone not in", values, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneBetween(String value1, String value2) {
            this.addCriterion("phone between", value1, value2, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andPhoneNotBetween(String value1, String value2) {
            this.addCriterion("phone not between", value1, value2, "phone");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkIsNull() {
            this.addCriterion("remark is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkIsNotNull() {
            this.addCriterion("remark is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkEqualTo(String value) {
            this.addCriterion("remark =", value, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkNotEqualTo(String value) {
            this.addCriterion("remark <>", value, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkGreaterThan(String value) {
            this.addCriterion("remark >", value, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkGreaterThanOrEqualTo(String value) {
            this.addCriterion("remark >=", value, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkLessThan(String value) {
            this.addCriterion("remark <", value, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkLessThanOrEqualTo(String value) {
            this.addCriterion("remark <=", value, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkLike(String value) {
            this.addCriterion("remark like", value, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkNotLike(String value) {
            this.addCriterion("remark not like", value, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkIn(List<String> values) {
            this.addCriterion("remark in", values, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkNotIn(List<String> values) {
            this.addCriterion("remark not in", values, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkBetween(String value1, String value2) {
            this.addCriterion("remark between", value1, value2, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andRemarkNotBetween(String value1, String value2) {
            this.addCriterion("remark not between", value1, value2, "remark");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeIsNull() {
            this.addCriterion("create_time is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeIsNotNull() {
            this.addCriterion("create_time is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeEqualTo(Date value) {
            this.addCriterion("create_time =", value, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeNotEqualTo(Date value) {
            this.addCriterion("create_time <>", value, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeGreaterThan(Date value) {
            this.addCriterion("create_time >", value, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            this.addCriterion("create_time >=", value, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeLessThan(Date value) {
            this.addCriterion("create_time <", value, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            this.addCriterion("create_time <=", value, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeIn(List<Date> values) {
            this.addCriterion("create_time in", values, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeNotIn(List<Date> values) {
            this.addCriterion("create_time not in", values, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeBetween(Date value1, Date value2) {
            this.addCriterion("create_time between", value1, value2, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            this.addCriterion("create_time not between", value1, value2, "create_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeIsNull() {
            this.addCriterion("update_time is null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeIsNotNull() {
            this.addCriterion("update_time is not null");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeEqualTo(Date value) {
            this.addCriterion("update_time =", value, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeNotEqualTo(Date value) {
            this.addCriterion("update_time <>", value, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeGreaterThan(Date value) {
            this.addCriterion("update_time >", value, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            this.addCriterion("update_time >=", value, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeLessThan(Date value) {
            this.addCriterion("update_time <", value, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            this.addCriterion("update_time <=", value, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeIn(List<Date> values) {
            this.addCriterion("update_time in", values, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeNotIn(List<Date> values) {
            this.addCriterion("update_time not in", values, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeBetween(Date value1, Date value2) {
            this.addCriterion("update_time between", value1, value2, "update_time");
            return (SysUserExample.Criteria)this;
        }

        public SysUserExample.Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            this.addCriterion("update_time not between", value1, value2, "update_time");
            return (SysUserExample.Criteria)this;
        }
    }
}
