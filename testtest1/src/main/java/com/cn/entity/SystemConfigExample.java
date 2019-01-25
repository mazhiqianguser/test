package com.cn.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\25 0025 10:30
 * @Description:
 */
public class SystemConfigExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria = new ArrayList();

    public SystemConfigExample() {
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

    public List<SystemConfigExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(SystemConfigExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public SystemConfigExample.Criteria or() {
        SystemConfigExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public SystemConfigExample.Criteria createCriteria() {
        SystemConfigExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected SystemConfigExample.Criteria createCriteriaInternal() {
        SystemConfigExample.Criteria criteria = new SystemConfigExample.Criteria();
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

    public static class Criteria extends SystemConfigExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<SystemConfigExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<SystemConfigExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<SystemConfigExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new SystemConfigExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new SystemConfigExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new SystemConfigExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public SystemConfigExample.Criteria andIdIsNull() {
            this.addCriterion("id is null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdIsNotNull() {
            this.addCriterion("id is not null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdEqualTo(Integer value) {
            this.addCriterion("id =", value, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdNotEqualTo(Integer value) {
            this.addCriterion("id <>", value, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdGreaterThan(Integer value) {
            this.addCriterion("id >", value, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("id >=", value, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdLessThan(Integer value) {
            this.addCriterion("id <", value, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("id <=", value, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdIn(List<Integer> values) {
            this.addCriterion("id in", values, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdNotIn(List<Integer> values) {
            this.addCriterion("id not in", values, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdBetween(Integer value1, Integer value2) {
            this.addCriterion("id between", value1, value2, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("id not between", value1, value2, "id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameIsNull() {
            this.addCriterion("project_name is null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameIsNotNull() {
            this.addCriterion("project_name is not null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameEqualTo(String value) {
            this.addCriterion("project_name =", value, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameNotEqualTo(String value) {
            this.addCriterion("project_name <>", value, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameGreaterThan(String value) {
            this.addCriterion("project_name >", value, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameGreaterThanOrEqualTo(String value) {
            this.addCriterion("project_name >=", value, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameLessThan(String value) {
            this.addCriterion("project_name <", value, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameLessThanOrEqualTo(String value) {
            this.addCriterion("project_name <=", value, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameLike(String value) {
            this.addCriterion("project_name like", value, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameNotLike(String value) {
            this.addCriterion("project_name not like", value, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameIn(List<String> values) {
            this.addCriterion("project_name in", values, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameNotIn(List<String> values) {
            this.addCriterion("project_name not in", values, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameBetween(String value1, String value2) {
            this.addCriterion("project_name between", value1, value2, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andProject_nameNotBetween(String value1, String value2) {
            this.addCriterion("project_name not between", value1, value2, "project_name");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryIsNull() {
            this.addCriterion("page_directory is null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryIsNotNull() {
            this.addCriterion("page_directory is not null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryEqualTo(String value) {
            this.addCriterion("page_directory =", value, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryNotEqualTo(String value) {
            this.addCriterion("page_directory <>", value, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryGreaterThan(String value) {
            this.addCriterion("page_directory >", value, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryGreaterThanOrEqualTo(String value) {
            this.addCriterion("page_directory >=", value, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryLessThan(String value) {
            this.addCriterion("page_directory <", value, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryLessThanOrEqualTo(String value) {
            this.addCriterion("page_directory <=", value, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryLike(String value) {
            this.addCriterion("page_directory like", value, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryNotLike(String value) {
            this.addCriterion("page_directory not like", value, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryIn(List<String> values) {
            this.addCriterion("page_directory in", values, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryNotIn(List<String> values) {
            this.addCriterion("page_directory not in", values, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryBetween(String value1, String value2) {
            this.addCriterion("page_directory between", value1, value2, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andPage_directoryNotBetween(String value1, String value2) {
            this.addCriterion("page_directory not between", value1, value2, "page_directory");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idIsNull() {
            this.addCriterion("menu_bar1_id is null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idIsNotNull() {
            this.addCriterion("menu_bar1_id is not null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idEqualTo(Integer value) {
            this.addCriterion("menu_bar1_id =", value, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idNotEqualTo(Integer value) {
            this.addCriterion("menu_bar1_id <>", value, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idGreaterThan(Integer value) {
            this.addCriterion("menu_bar1_id >", value, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("menu_bar1_id >=", value, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idLessThan(Integer value) {
            this.addCriterion("menu_bar1_id <", value, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idLessThanOrEqualTo(Integer value) {
            this.addCriterion("menu_bar1_id <=", value, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idIn(List<Integer> values) {
            this.addCriterion("menu_bar1_id in", values, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idNotIn(List<Integer> values) {
            this.addCriterion("menu_bar1_id not in", values, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idBetween(Integer value1, Integer value2) {
            this.addCriterion("menu_bar1_id between", value1, value2, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar1_idNotBetween(Integer value1, Integer value2) {
            this.addCriterion("menu_bar1_id not between", value1, value2, "menu_bar1_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idIsNull() {
            this.addCriterion("menu_bar2_id is null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idIsNotNull() {
            this.addCriterion("menu_bar2_id is not null");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idEqualTo(Integer value) {
            this.addCriterion("menu_bar2_id =", value, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idNotEqualTo(Integer value) {
            this.addCriterion("menu_bar2_id <>", value, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idGreaterThan(Integer value) {
            this.addCriterion("menu_bar2_id >", value, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("menu_bar2_id >=", value, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idLessThan(Integer value) {
            this.addCriterion("menu_bar2_id <", value, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idLessThanOrEqualTo(Integer value) {
            this.addCriterion("menu_bar2_id <=", value, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idIn(List<Integer> values) {
            this.addCriterion("menu_bar2_id in", values, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idNotIn(List<Integer> values) {
            this.addCriterion("menu_bar2_id not in", values, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idBetween(Integer value1, Integer value2) {
            this.addCriterion("menu_bar2_id between", value1, value2, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }

        public SystemConfigExample.Criteria andMenu_bar2_idNotBetween(Integer value1, Integer value2) {
            this.addCriterion("menu_bar2_id not between", value1, value2, "menu_bar2_id");
            return (SystemConfigExample.Criteria)this;
        }
    }
}
