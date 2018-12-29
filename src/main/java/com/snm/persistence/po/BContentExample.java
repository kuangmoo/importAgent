package com.snm.persistence.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BContentExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleCnIsNull() {
            addCriterion("title_cn is null");
            return (Criteria) this;
        }

        public Criteria andTitleCnIsNotNull() {
            addCriterion("title_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTitleCnEqualTo(String value) {
            addCriterion("title_cn =", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotEqualTo(String value) {
            addCriterion("title_cn <>", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnGreaterThan(String value) {
            addCriterion("title_cn >", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnGreaterThanOrEqualTo(String value) {
            addCriterion("title_cn >=", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLessThan(String value) {
            addCriterion("title_cn <", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLessThanOrEqualTo(String value) {
            addCriterion("title_cn <=", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnLike(String value) {
            addCriterion("title_cn like", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotLike(String value) {
            addCriterion("title_cn not like", value, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnIn(List<String> values) {
            addCriterion("title_cn in", values, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotIn(List<String> values) {
            addCriterion("title_cn not in", values, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnBetween(String value1, String value2) {
            addCriterion("title_cn between", value1, value2, "titleCn");
            return (Criteria) this;
        }

        public Criteria andTitleCnNotBetween(String value1, String value2) {
            addCriterion("title_cn not between", value1, value2, "titleCn");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andContentCodeIsNull() {
            addCriterion("content_code is null");
            return (Criteria) this;
        }

        public Criteria andContentCodeIsNotNull() {
            addCriterion("content_code is not null");
            return (Criteria) this;
        }

        public Criteria andContentCodeEqualTo(String value) {
            addCriterion("content_code =", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeNotEqualTo(String value) {
            addCriterion("content_code <>", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeGreaterThan(String value) {
            addCriterion("content_code >", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("content_code >=", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeLessThan(String value) {
            addCriterion("content_code <", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeLessThanOrEqualTo(String value) {
            addCriterion("content_code <=", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeLike(String value) {
            addCriterion("content_code like", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeNotLike(String value) {
            addCriterion("content_code not like", value, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeIn(List<String> values) {
            addCriterion("content_code in", values, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeNotIn(List<String> values) {
            addCriterion("content_code not in", values, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeBetween(String value1, String value2) {
            addCriterion("content_code between", value1, value2, "contentCode");
            return (Criteria) this;
        }

        public Criteria andContentCodeNotBetween(String value1, String value2) {
            addCriterion("content_code not between", value1, value2, "contentCode");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNull() {
            addCriterion("provider_id is null");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNotNull() {
            addCriterion("provider_id is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIdEqualTo(String value) {
            addCriterion("provider_id =", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotEqualTo(String value) {
            addCriterion("provider_id <>", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThan(String value) {
            addCriterion("provider_id >", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThanOrEqualTo(String value) {
            addCriterion("provider_id >=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThan(String value) {
            addCriterion("provider_id <", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThanOrEqualTo(String value) {
            addCriterion("provider_id <=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLike(String value) {
            addCriterion("provider_id like", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotLike(String value) {
            addCriterion("provider_id not like", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIn(List<String> values) {
            addCriterion("provider_id in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotIn(List<String> values) {
            addCriterion("provider_id not in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdBetween(String value1, String value2) {
            addCriterion("provider_id between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotBetween(String value1, String value2) {
            addCriterion("provider_id not between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdIsNull() {
            addCriterion("onelevel_id is null");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdIsNotNull() {
            addCriterion("onelevel_id is not null");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdEqualTo(String value) {
            addCriterion("onelevel_id =", value, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdNotEqualTo(String value) {
            addCriterion("onelevel_id <>", value, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdGreaterThan(String value) {
            addCriterion("onelevel_id >", value, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("onelevel_id >=", value, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdLessThan(String value) {
            addCriterion("onelevel_id <", value, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdLessThanOrEqualTo(String value) {
            addCriterion("onelevel_id <=", value, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdLike(String value) {
            addCriterion("onelevel_id like", value, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdNotLike(String value) {
            addCriterion("onelevel_id not like", value, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdIn(List<String> values) {
            addCriterion("onelevel_id in", values, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdNotIn(List<String> values) {
            addCriterion("onelevel_id not in", values, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdBetween(String value1, String value2) {
            addCriterion("onelevel_id between", value1, value2, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andOnelevelIdNotBetween(String value1, String value2) {
            addCriterion("onelevel_id not between", value1, value2, "onelevelId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdIsNull() {
            addCriterion("correlate_id is null");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdIsNotNull() {
            addCriterion("correlate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdEqualTo(String value) {
            addCriterion("correlate_id =", value, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdNotEqualTo(String value) {
            addCriterion("correlate_id <>", value, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdGreaterThan(String value) {
            addCriterion("correlate_id >", value, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdGreaterThanOrEqualTo(String value) {
            addCriterion("correlate_id >=", value, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdLessThan(String value) {
            addCriterion("correlate_id <", value, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdLessThanOrEqualTo(String value) {
            addCriterion("correlate_id <=", value, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdLike(String value) {
            addCriterion("correlate_id like", value, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdNotLike(String value) {
            addCriterion("correlate_id not like", value, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdIn(List<String> values) {
            addCriterion("correlate_id in", values, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdNotIn(List<String> values) {
            addCriterion("correlate_id not in", values, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdBetween(String value1, String value2) {
            addCriterion("correlate_id between", value1, value2, "correlateId");
            return (Criteria) this;
        }

        public Criteria andCorrelateIdNotBetween(String value1, String value2) {
            addCriterion("correlate_id not between", value1, value2, "correlateId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusIsNull() {
            addCriterion("dispatch_status is null");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusIsNotNull() {
            addCriterion("dispatch_status is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusEqualTo(Integer value) {
            addCriterion("dispatch_status =", value, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusNotEqualTo(Integer value) {
            addCriterion("dispatch_status <>", value, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusGreaterThan(Integer value) {
            addCriterion("dispatch_status >", value, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatch_status >=", value, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusLessThan(Integer value) {
            addCriterion("dispatch_status <", value, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dispatch_status <=", value, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusIn(List<Integer> values) {
            addCriterion("dispatch_status in", values, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusNotIn(List<Integer> values) {
            addCriterion("dispatch_status not in", values, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_status between", value1, value2, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andDispatchStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_status not between", value1, value2, "dispatchStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusIsNull() {
            addCriterion("cdn_status is null");
            return (Criteria) this;
        }

        public Criteria andCdnStatusIsNotNull() {
            addCriterion("cdn_status is not null");
            return (Criteria) this;
        }

        public Criteria andCdnStatusEqualTo(Integer value) {
            addCriterion("cdn_status =", value, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusNotEqualTo(Integer value) {
            addCriterion("cdn_status <>", value, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusGreaterThan(Integer value) {
            addCriterion("cdn_status >", value, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cdn_status >=", value, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusLessThan(Integer value) {
            addCriterion("cdn_status <", value, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cdn_status <=", value, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusIn(List<Integer> values) {
            addCriterion("cdn_status in", values, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusNotIn(List<Integer> values) {
            addCriterion("cdn_status not in", values, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusBetween(Integer value1, Integer value2) {
            addCriterion("cdn_status between", value1, value2, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andCdnStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cdn_status not between", value1, value2, "cdnStatus");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNull() {
            addCriterion("oper_type is null");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNotNull() {
            addCriterion("oper_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperTypeEqualTo(Integer value) {
            addCriterion("oper_type =", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotEqualTo(Integer value) {
            addCriterion("oper_type <>", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThan(Integer value) {
            addCriterion("oper_type >", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("oper_type >=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThan(Integer value) {
            addCriterion("oper_type <", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThanOrEqualTo(Integer value) {
            addCriterion("oper_type <=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIn(List<Integer> values) {
            addCriterion("oper_type in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotIn(List<Integer> values) {
            addCriterion("oper_type not in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeBetween(Integer value1, Integer value2) {
            addCriterion("oper_type between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("oper_type not between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("service_code is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("service_code is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(String value) {
            addCriterion("service_code =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(String value) {
            addCriterion("service_code <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(String value) {
            addCriterion("service_code >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("service_code >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(String value) {
            addCriterion("service_code <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("service_code <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLike(String value) {
            addCriterion("service_code like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotLike(String value) {
            addCriterion("service_code not like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<String> values) {
            addCriterion("service_code in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<String> values) {
            addCriterion("service_code not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(String value1, String value2) {
            addCriterion("service_code between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(String value1, String value2) {
            addCriterion("service_code not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(Integer value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(Integer value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(Integer value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(Integer value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<Integer> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<Integer> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(Integer value1, Integer value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeIsNull() {
            addCriterion("series_type is null");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeIsNotNull() {
            addCriterion("series_type is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeEqualTo(Integer value) {
            addCriterion("series_type =", value, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeNotEqualTo(Integer value) {
            addCriterion("series_type <>", value, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeGreaterThan(Integer value) {
            addCriterion("series_type >", value, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("series_type >=", value, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeLessThan(Integer value) {
            addCriterion("series_type <", value, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeLessThanOrEqualTo(Integer value) {
            addCriterion("series_type <=", value, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeIn(List<Integer> values) {
            addCriterion("series_type in", values, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeNotIn(List<Integer> values) {
            addCriterion("series_type not in", values, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeBetween(Integer value1, Integer value2) {
            addCriterion("series_type between", value1, value2, "seriesType");
            return (Criteria) this;
        }

        public Criteria andSeriesTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("series_type not between", value1, value2, "seriesType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("content_type is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("content_type is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(Integer value) {
            addCriterion("content_type =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(Integer value) {
            addCriterion("content_type <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(Integer value) {
            addCriterion("content_type >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_type >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(Integer value) {
            addCriterion("content_type <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("content_type <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<Integer> values) {
            addCriterion("content_type in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<Integer> values) {
            addCriterion("content_type not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(Integer value1, Integer value2) {
            addCriterion("content_type between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("content_type not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagIsNull() {
            addCriterion("definition_flag is null");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagIsNotNull() {
            addCriterion("definition_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagEqualTo(Integer value) {
            addCriterion("definition_flag =", value, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagNotEqualTo(Integer value) {
            addCriterion("definition_flag <>", value, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagGreaterThan(Integer value) {
            addCriterion("definition_flag >", value, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("definition_flag >=", value, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagLessThan(Integer value) {
            addCriterion("definition_flag <", value, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagLessThanOrEqualTo(Integer value) {
            addCriterion("definition_flag <=", value, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagIn(List<Integer> values) {
            addCriterion("definition_flag in", values, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagNotIn(List<Integer> values) {
            addCriterion("definition_flag not in", values, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagBetween(Integer value1, Integer value2) {
            addCriterion("definition_flag between", value1, value2, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andDefinitionFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("definition_flag not between", value1, value2, "definitionFlag");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(Integer value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(Integer value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(Integer value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(Integer value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(Integer value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<Integer> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<Integer> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(Integer value1, Integer value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("rating not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIsNull() {
            addCriterion("play_time is null");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIsNotNull() {
            addCriterion("play_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTimeEqualTo(Integer value) {
            addCriterion("play_time =", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotEqualTo(Integer value) {
            addCriterion("play_time <>", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeGreaterThan(Integer value) {
            addCriterion("play_time >", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_time >=", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeLessThan(Integer value) {
            addCriterion("play_time <", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("play_time <=", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIn(List<Integer> values) {
            addCriterion("play_time in", values, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotIn(List<Integer> values) {
            addCriterion("play_time not in", values, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeBetween(Integer value1, Integer value2) {
            addCriterion("play_time between", value1, value2, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("play_time not between", value1, value2, "playTime");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andTitleEnIsNull() {
            addCriterion("title_en is null");
            return (Criteria) this;
        }

        public Criteria andTitleEnIsNotNull() {
            addCriterion("title_en is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEnEqualTo(String value) {
            addCriterion("title_en =", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotEqualTo(String value) {
            addCriterion("title_en <>", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThan(String value) {
            addCriterion("title_en >", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("title_en >=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThan(String value) {
            addCriterion("title_en <", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLessThanOrEqualTo(String value) {
            addCriterion("title_en <=", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnLike(String value) {
            addCriterion("title_en like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotLike(String value) {
            addCriterion("title_en not like", value, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnIn(List<String> values) {
            addCriterion("title_en in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotIn(List<String> values) {
            addCriterion("title_en not in", values, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnBetween(String value1, String value2) {
            addCriterion("title_en between", value1, value2, "titleEn");
            return (Criteria) this;
        }

        public Criteria andTitleEnNotBetween(String value1, String value2) {
            addCriterion("title_en not between", value1, value2, "titleEn");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNull() {
            addCriterion("order_seq is null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNotNull() {
            addCriterion("order_seq is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqEqualTo(Integer value) {
            addCriterion("order_seq =", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotEqualTo(Integer value) {
            addCriterion("order_seq <>", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThan(Integer value) {
            addCriterion("order_seq >", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_seq >=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThan(Integer value) {
            addCriterion("order_seq <", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThanOrEqualTo(Integer value) {
            addCriterion("order_seq <=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIn(List<Integer> values) {
            addCriterion("order_seq in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotIn(List<Integer> values) {
            addCriterion("order_seq not in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqBetween(Integer value1, Integer value2) {
            addCriterion("order_seq between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("order_seq not between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andVolumnCountIsNull() {
            addCriterion("volumn_count is null");
            return (Criteria) this;
        }

        public Criteria andVolumnCountIsNotNull() {
            addCriterion("volumn_count is not null");
            return (Criteria) this;
        }

        public Criteria andVolumnCountEqualTo(Integer value) {
            addCriterion("volumn_count =", value, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountNotEqualTo(Integer value) {
            addCriterion("volumn_count <>", value, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountGreaterThan(Integer value) {
            addCriterion("volumn_count >", value, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("volumn_count >=", value, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountLessThan(Integer value) {
            addCriterion("volumn_count <", value, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountLessThanOrEqualTo(Integer value) {
            addCriterion("volumn_count <=", value, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountIn(List<Integer> values) {
            addCriterion("volumn_count in", values, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountNotIn(List<Integer> values) {
            addCriterion("volumn_count not in", values, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountBetween(Integer value1, Integer value2) {
            addCriterion("volumn_count between", value1, value2, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andVolumnCountNotBetween(Integer value1, Integer value2) {
            addCriterion("volumn_count not between", value1, value2, "volumnCount");
            return (Criteria) this;
        }

        public Criteria andActorPlayIsNull() {
            addCriterion("actor_play is null");
            return (Criteria) this;
        }

        public Criteria andActorPlayIsNotNull() {
            addCriterion("actor_play is not null");
            return (Criteria) this;
        }

        public Criteria andActorPlayEqualTo(String value) {
            addCriterion("actor_play =", value, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayNotEqualTo(String value) {
            addCriterion("actor_play <>", value, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayGreaterThan(String value) {
            addCriterion("actor_play >", value, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayGreaterThanOrEqualTo(String value) {
            addCriterion("actor_play >=", value, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayLessThan(String value) {
            addCriterion("actor_play <", value, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayLessThanOrEqualTo(String value) {
            addCriterion("actor_play <=", value, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayLike(String value) {
            addCriterion("actor_play like", value, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayNotLike(String value) {
            addCriterion("actor_play not like", value, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayIn(List<String> values) {
            addCriterion("actor_play in", values, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayNotIn(List<String> values) {
            addCriterion("actor_play not in", values, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayBetween(String value1, String value2) {
            addCriterion("actor_play between", value1, value2, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andActorPlayNotBetween(String value1, String value2) {
            addCriterion("actor_play not between", value1, value2, "actorPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayIsNull() {
            addCriterion("writer_play is null");
            return (Criteria) this;
        }

        public Criteria andWriterPlayIsNotNull() {
            addCriterion("writer_play is not null");
            return (Criteria) this;
        }

        public Criteria andWriterPlayEqualTo(String value) {
            addCriterion("writer_play =", value, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayNotEqualTo(String value) {
            addCriterion("writer_play <>", value, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayGreaterThan(String value) {
            addCriterion("writer_play >", value, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayGreaterThanOrEqualTo(String value) {
            addCriterion("writer_play >=", value, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayLessThan(String value) {
            addCriterion("writer_play <", value, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayLessThanOrEqualTo(String value) {
            addCriterion("writer_play <=", value, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayLike(String value) {
            addCriterion("writer_play like", value, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayNotLike(String value) {
            addCriterion("writer_play not like", value, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayIn(List<String> values) {
            addCriterion("writer_play in", values, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayNotIn(List<String> values) {
            addCriterion("writer_play not in", values, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayBetween(String value1, String value2) {
            addCriterion("writer_play between", value1, value2, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andWriterPlayNotBetween(String value1, String value2) {
            addCriterion("writer_play not between", value1, value2, "writerPlay");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryIsNull() {
            addCriterion("original_country is null");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryIsNotNull() {
            addCriterion("original_country is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryEqualTo(String value) {
            addCriterion("original_country =", value, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryNotEqualTo(String value) {
            addCriterion("original_country <>", value, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryGreaterThan(String value) {
            addCriterion("original_country >", value, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryGreaterThanOrEqualTo(String value) {
            addCriterion("original_country >=", value, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryLessThan(String value) {
            addCriterion("original_country <", value, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryLessThanOrEqualTo(String value) {
            addCriterion("original_country <=", value, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryLike(String value) {
            addCriterion("original_country like", value, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryNotLike(String value) {
            addCriterion("original_country not like", value, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryIn(List<String> values) {
            addCriterion("original_country in", values, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryNotIn(List<String> values) {
            addCriterion("original_country not in", values, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryBetween(String value1, String value2) {
            addCriterion("original_country between", value1, value2, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andOriginalCountryNotBetween(String value1, String value2) {
            addCriterion("original_country not between", value1, value2, "originalCountry");
            return (Criteria) this;
        }

        public Criteria andReleaseYearIsNull() {
            addCriterion("release_year is null");
            return (Criteria) this;
        }

        public Criteria andReleaseYearIsNotNull() {
            addCriterion("release_year is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseYearEqualTo(String value) {
            addCriterion("release_year =", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearNotEqualTo(String value) {
            addCriterion("release_year <>", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearGreaterThan(String value) {
            addCriterion("release_year >", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearGreaterThanOrEqualTo(String value) {
            addCriterion("release_year >=", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearLessThan(String value) {
            addCriterion("release_year <", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearLessThanOrEqualTo(String value) {
            addCriterion("release_year <=", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearLike(String value) {
            addCriterion("release_year like", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearNotLike(String value) {
            addCriterion("release_year not like", value, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearIn(List<String> values) {
            addCriterion("release_year in", values, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearNotIn(List<String> values) {
            addCriterion("release_year not in", values, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearBetween(String value1, String value2) {
            addCriterion("release_year between", value1, value2, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andReleaseYearNotBetween(String value1, String value2) {
            addCriterion("release_year not between", value1, value2, "releaseYear");
            return (Criteria) this;
        }

        public Criteria andOrgairDateIsNull() {
            addCriterion("orgair_date is null");
            return (Criteria) this;
        }

        public Criteria andOrgairDateIsNotNull() {
            addCriterion("orgair_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrgairDateEqualTo(String value) {
            addCriterion("orgair_date =", value, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateNotEqualTo(String value) {
            addCriterion("orgair_date <>", value, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateGreaterThan(String value) {
            addCriterion("orgair_date >", value, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateGreaterThanOrEqualTo(String value) {
            addCriterion("orgair_date >=", value, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateLessThan(String value) {
            addCriterion("orgair_date <", value, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateLessThanOrEqualTo(String value) {
            addCriterion("orgair_date <=", value, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateLike(String value) {
            addCriterion("orgair_date like", value, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateNotLike(String value) {
            addCriterion("orgair_date not like", value, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateIn(List<String> values) {
            addCriterion("orgair_date in", values, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateNotIn(List<String> values) {
            addCriterion("orgair_date not in", values, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateBetween(String value1, String value2) {
            addCriterion("orgair_date between", value1, value2, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andOrgairDateNotBetween(String value1, String value2) {
            addCriterion("orgair_date not between", value1, value2, "orgairDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNull() {
            addCriterion("effective_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNotNull() {
            addCriterion("effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEqualTo(Date value) {
            addCriterion("effective_time =", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotEqualTo(Date value) {
            addCriterion("effective_time <>", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThan(Date value) {
            addCriterion("effective_time >", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_time >=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThan(Date value) {
            addCriterion("effective_time <", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("effective_time <=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIn(List<Date> values) {
            addCriterion("effective_time in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotIn(List<Date> values) {
            addCriterion("effective_time not in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeBetween(Date value1, Date value2) {
            addCriterion("effective_time between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("effective_time not between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andKPeopleIsNull() {
            addCriterion("k_people is null");
            return (Criteria) this;
        }

        public Criteria andKPeopleIsNotNull() {
            addCriterion("k_people is not null");
            return (Criteria) this;
        }

        public Criteria andKPeopleEqualTo(String value) {
            addCriterion("k_people =", value, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleNotEqualTo(String value) {
            addCriterion("k_people <>", value, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleGreaterThan(String value) {
            addCriterion("k_people >", value, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("k_people >=", value, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleLessThan(String value) {
            addCriterion("k_people <", value, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleLessThanOrEqualTo(String value) {
            addCriterion("k_people <=", value, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleLike(String value) {
            addCriterion("k_people like", value, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleNotLike(String value) {
            addCriterion("k_people not like", value, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleIn(List<String> values) {
            addCriterion("k_people in", values, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleNotIn(List<String> values) {
            addCriterion("k_people not in", values, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleBetween(String value1, String value2) {
            addCriterion("k_people between", value1, value2, "kPeople");
            return (Criteria) this;
        }

        public Criteria andKPeopleNotBetween(String value1, String value2) {
            addCriterion("k_people not between", value1, value2, "kPeople");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andScriptWriterIsNull() {
            addCriterion("script_writer is null");
            return (Criteria) this;
        }

        public Criteria andScriptWriterIsNotNull() {
            addCriterion("script_writer is not null");
            return (Criteria) this;
        }

        public Criteria andScriptWriterEqualTo(String value) {
            addCriterion("script_writer =", value, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterNotEqualTo(String value) {
            addCriterion("script_writer <>", value, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterGreaterThan(String value) {
            addCriterion("script_writer >", value, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterGreaterThanOrEqualTo(String value) {
            addCriterion("script_writer >=", value, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterLessThan(String value) {
            addCriterion("script_writer <", value, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterLessThanOrEqualTo(String value) {
            addCriterion("script_writer <=", value, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterLike(String value) {
            addCriterion("script_writer like", value, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterNotLike(String value) {
            addCriterion("script_writer not like", value, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterIn(List<String> values) {
            addCriterion("script_writer in", values, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterNotIn(List<String> values) {
            addCriterion("script_writer not in", values, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterBetween(String value1, String value2) {
            addCriterion("script_writer between", value1, value2, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andScriptWriterNotBetween(String value1, String value2) {
            addCriterion("script_writer not between", value1, value2, "scriptWriter");
            return (Criteria) this;
        }

        public Criteria andCompereIsNull() {
            addCriterion("compere is null");
            return (Criteria) this;
        }

        public Criteria andCompereIsNotNull() {
            addCriterion("compere is not null");
            return (Criteria) this;
        }

        public Criteria andCompereEqualTo(String value) {
            addCriterion("compere =", value, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereNotEqualTo(String value) {
            addCriterion("compere <>", value, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereGreaterThan(String value) {
            addCriterion("compere >", value, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereGreaterThanOrEqualTo(String value) {
            addCriterion("compere >=", value, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereLessThan(String value) {
            addCriterion("compere <", value, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereLessThanOrEqualTo(String value) {
            addCriterion("compere <=", value, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereLike(String value) {
            addCriterion("compere like", value, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereNotLike(String value) {
            addCriterion("compere not like", value, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereIn(List<String> values) {
            addCriterion("compere in", values, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereNotIn(List<String> values) {
            addCriterion("compere not in", values, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereBetween(String value1, String value2) {
            addCriterion("compere between", value1, value2, "compere");
            return (Criteria) this;
        }

        public Criteria andCompereNotBetween(String value1, String value2) {
            addCriterion("compere not between", value1, value2, "compere");
            return (Criteria) this;
        }

        public Criteria andGuestIsNull() {
            addCriterion("guest is null");
            return (Criteria) this;
        }

        public Criteria andGuestIsNotNull() {
            addCriterion("guest is not null");
            return (Criteria) this;
        }

        public Criteria andGuestEqualTo(String value) {
            addCriterion("guest =", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotEqualTo(String value) {
            addCriterion("guest <>", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestGreaterThan(String value) {
            addCriterion("guest >", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestGreaterThanOrEqualTo(String value) {
            addCriterion("guest >=", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestLessThan(String value) {
            addCriterion("guest <", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestLessThanOrEqualTo(String value) {
            addCriterion("guest <=", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestLike(String value) {
            addCriterion("guest like", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotLike(String value) {
            addCriterion("guest not like", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestIn(List<String> values) {
            addCriterion("guest in", values, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotIn(List<String> values) {
            addCriterion("guest not in", values, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestBetween(String value1, String value2) {
            addCriterion("guest between", value1, value2, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotBetween(String value1, String value2) {
            addCriterion("guest not between", value1, value2, "guest");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("reporter not between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andOpinChargeIsNull() {
            addCriterion("opin_charge is null");
            return (Criteria) this;
        }

        public Criteria andOpinChargeIsNotNull() {
            addCriterion("opin_charge is not null");
            return (Criteria) this;
        }

        public Criteria andOpinChargeEqualTo(String value) {
            addCriterion("opin_charge =", value, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeNotEqualTo(String value) {
            addCriterion("opin_charge <>", value, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeGreaterThan(String value) {
            addCriterion("opin_charge >", value, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeGreaterThanOrEqualTo(String value) {
            addCriterion("opin_charge >=", value, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeLessThan(String value) {
            addCriterion("opin_charge <", value, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeLessThanOrEqualTo(String value) {
            addCriterion("opin_charge <=", value, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeLike(String value) {
            addCriterion("opin_charge like", value, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeNotLike(String value) {
            addCriterion("opin_charge not like", value, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeIn(List<String> values) {
            addCriterion("opin_charge in", values, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeNotIn(List<String> values) {
            addCriterion("opin_charge not in", values, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeBetween(String value1, String value2) {
            addCriterion("opin_charge between", value1, value2, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andOpinChargeNotBetween(String value1, String value2) {
            addCriterion("opin_charge not between", value1, value2, "opinCharge");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andExternalOtherIsNull() {
            addCriterion("external_other is null");
            return (Criteria) this;
        }

        public Criteria andExternalOtherIsNotNull() {
            addCriterion("external_other is not null");
            return (Criteria) this;
        }

        public Criteria andExternalOtherEqualTo(String value) {
            addCriterion("external_other =", value, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherNotEqualTo(String value) {
            addCriterion("external_other <>", value, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherGreaterThan(String value) {
            addCriterion("external_other >", value, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherGreaterThanOrEqualTo(String value) {
            addCriterion("external_other >=", value, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherLessThan(String value) {
            addCriterion("external_other <", value, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherLessThanOrEqualTo(String value) {
            addCriterion("external_other <=", value, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherLike(String value) {
            addCriterion("external_other like", value, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherNotLike(String value) {
            addCriterion("external_other not like", value, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherIn(List<String> values) {
            addCriterion("external_other in", values, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherNotIn(List<String> values) {
            addCriterion("external_other not in", values, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherBetween(String value1, String value2) {
            addCriterion("external_other between", value1, value2, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalOtherNotBetween(String value1, String value2) {
            addCriterion("external_other not between", value1, value2, "externalOther");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyIsNull() {
            addCriterion("external_property is null");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyIsNotNull() {
            addCriterion("external_property is not null");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyEqualTo(String value) {
            addCriterion("external_property =", value, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyNotEqualTo(String value) {
            addCriterion("external_property <>", value, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyGreaterThan(String value) {
            addCriterion("external_property >", value, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("external_property >=", value, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyLessThan(String value) {
            addCriterion("external_property <", value, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyLessThanOrEqualTo(String value) {
            addCriterion("external_property <=", value, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyLike(String value) {
            addCriterion("external_property like", value, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyNotLike(String value) {
            addCriterion("external_property not like", value, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyIn(List<String> values) {
            addCriterion("external_property in", values, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyNotIn(List<String> values) {
            addCriterion("external_property not in", values, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyBetween(String value1, String value2) {
            addCriterion("external_property between", value1, value2, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andExternalPropertyNotBetween(String value1, String value2) {
            addCriterion("external_property not between", value1, value2, "externalProperty");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(String value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(String value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(String value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(String value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(String value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(String value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLike(String value) {
            addCriterion("vid like", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotLike(String value) {
            addCriterion("vid not like", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<String> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<String> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(String value1, String value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(String value1, String value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andViewPointIsNull() {
            addCriterion("view_point is null");
            return (Criteria) this;
        }

        public Criteria andViewPointIsNotNull() {
            addCriterion("view_point is not null");
            return (Criteria) this;
        }

        public Criteria andViewPointEqualTo(String value) {
            addCriterion("view_point =", value, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointNotEqualTo(String value) {
            addCriterion("view_point <>", value, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointGreaterThan(String value) {
            addCriterion("view_point >", value, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointGreaterThanOrEqualTo(String value) {
            addCriterion("view_point >=", value, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointLessThan(String value) {
            addCriterion("view_point <", value, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointLessThanOrEqualTo(String value) {
            addCriterion("view_point <=", value, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointLike(String value) {
            addCriterion("view_point like", value, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointNotLike(String value) {
            addCriterion("view_point not like", value, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointIn(List<String> values) {
            addCriterion("view_point in", values, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointNotIn(List<String> values) {
            addCriterion("view_point not in", values, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointBetween(String value1, String value2) {
            addCriterion("view_point between", value1, value2, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andViewPointNotBetween(String value1, String value2) {
            addCriterion("view_point not between", value1, value2, "viewPoint");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdIsNull() {
            addCriterion("content_template_id is null");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdIsNotNull() {
            addCriterion("content_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdEqualTo(Integer value) {
            addCriterion("content_template_id =", value, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdNotEqualTo(Integer value) {
            addCriterion("content_template_id <>", value, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdGreaterThan(Integer value) {
            addCriterion("content_template_id >", value, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_template_id >=", value, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdLessThan(Integer value) {
            addCriterion("content_template_id <", value, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_template_id <=", value, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdIn(List<Integer> values) {
            addCriterion("content_template_id in", values, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdNotIn(List<Integer> values) {
            addCriterion("content_template_id not in", values, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("content_template_id between", value1, value2, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andContentTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_template_id not between", value1, value2, "contentTemplateId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNull() {
            addCriterion("banner_url is null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNotNull() {
            addCriterion("banner_url is not null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlEqualTo(String value) {
            addCriterion("banner_url =", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotEqualTo(String value) {
            addCriterion("banner_url <>", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThan(String value) {
            addCriterion("banner_url >", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("banner_url >=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThan(String value) {
            addCriterion("banner_url <", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThanOrEqualTo(String value) {
            addCriterion("banner_url <=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLike(String value) {
            addCriterion("banner_url like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotLike(String value) {
            addCriterion("banner_url not like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIn(List<String> values) {
            addCriterion("banner_url in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotIn(List<String> values) {
            addCriterion("banner_url not in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlBetween(String value1, String value2) {
            addCriterion("banner_url between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotBetween(String value1, String value2) {
            addCriterion("banner_url not between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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