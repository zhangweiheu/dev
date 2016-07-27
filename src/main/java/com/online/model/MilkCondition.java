package com.online.model;

import java.util.ArrayList;
import java.util.List;

public class MilkCondition {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitOffset = -1;

    protected int limitSize = 1;

    public MilkCondition() {
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

    public void setLimitOffset(int limitOffset) {
        this.limitOffset = limitOffset;
    }

    public void setLimitSize(int limitSize) {
        this.limitSize = limitSize;
    }

    public int getLimitOffset() {
        return limitOffset;
    }

    public int getLimitSize() {
        return limitSize;
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

        public Criteria andTitleDesIsNull() {
            addCriterion("title_des is null");
            return (Criteria) this;
        }

        public Criteria andTitleDesIsNotNull() {
            addCriterion("title_des is not null");
            return (Criteria) this;
        }

        public Criteria andTitleDesEqualTo(String value) {
            addCriterion("title_des =", value, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesNotEqualTo(String value) {
            addCriterion("title_des <>", value, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesGreaterThan(String value) {
            addCriterion("title_des >", value, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesGreaterThanOrEqualTo(String value) {
            addCriterion("title_des >=", value, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesLessThan(String value) {
            addCriterion("title_des <", value, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesLessThanOrEqualTo(String value) {
            addCriterion("title_des <=", value, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesLike(String value) {
            addCriterion("title_des like", value, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesNotLike(String value) {
            addCriterion("title_des not like", value, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesIn(List<String> values) {
            addCriterion("title_des in", values, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesNotIn(List<String> values) {
            addCriterion("title_des not in", values, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesBetween(String value1, String value2) {
            addCriterion("title_des between", value1, value2, "titleDes");
            return (Criteria) this;
        }

        public Criteria andTitleDesNotBetween(String value1, String value2) {
            addCriterion("title_des not between", value1, value2, "titleDes");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Integer value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Integer value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Integer value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Integer value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Integer> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Integer> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMilkAddrIsNull() {
            addCriterion("milk_addr is null");
            return (Criteria) this;
        }

        public Criteria andMilkAddrIsNotNull() {
            addCriterion("milk_addr is not null");
            return (Criteria) this;
        }

        public Criteria andMilkAddrEqualTo(String value) {
            addCriterion("milk_addr =", value, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrNotEqualTo(String value) {
            addCriterion("milk_addr <>", value, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrGreaterThan(String value) {
            addCriterion("milk_addr >", value, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrGreaterThanOrEqualTo(String value) {
            addCriterion("milk_addr >=", value, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrLessThan(String value) {
            addCriterion("milk_addr <", value, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrLessThanOrEqualTo(String value) {
            addCriterion("milk_addr <=", value, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrLike(String value) {
            addCriterion("milk_addr like", value, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrNotLike(String value) {
            addCriterion("milk_addr not like", value, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrIn(List<String> values) {
            addCriterion("milk_addr in", values, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrNotIn(List<String> values) {
            addCriterion("milk_addr not in", values, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrBetween(String value1, String value2) {
            addCriterion("milk_addr between", value1, value2, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andMilkAddrNotBetween(String value1, String value2) {
            addCriterion("milk_addr not between", value1, value2, "milkAddr");
            return (Criteria) this;
        }

        public Criteria andIschinaIsNull() {
            addCriterion("Ischina is null");
            return (Criteria) this;
        }

        public Criteria andIschinaIsNotNull() {
            addCriterion("Ischina is not null");
            return (Criteria) this;
        }

        public Criteria andIschinaEqualTo(Integer value) {
            addCriterion("Ischina =", value, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaNotEqualTo(Integer value) {
            addCriterion("Ischina <>", value, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaGreaterThan(Integer value) {
            addCriterion("Ischina >", value, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ischina >=", value, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaLessThan(Integer value) {
            addCriterion("Ischina <", value, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaLessThanOrEqualTo(Integer value) {
            addCriterion("Ischina <=", value, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaIn(List<Integer> values) {
            addCriterion("Ischina in", values, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaNotIn(List<Integer> values) {
            addCriterion("Ischina not in", values, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaBetween(Integer value1, Integer value2) {
            addCriterion("Ischina between", value1, value2, "ischina");
            return (Criteria) this;
        }

        public Criteria andIschinaNotBetween(Integer value1, Integer value2) {
            addCriterion("Ischina not between", value1, value2, "ischina");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitIsNull() {
            addCriterion("packaging_unit is null");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitIsNotNull() {
            addCriterion("packaging_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitEqualTo(String value) {
            addCriterion("packaging_unit =", value, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitNotEqualTo(String value) {
            addCriterion("packaging_unit <>", value, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitGreaterThan(String value) {
            addCriterion("packaging_unit >", value, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("packaging_unit >=", value, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitLessThan(String value) {
            addCriterion("packaging_unit <", value, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitLessThanOrEqualTo(String value) {
            addCriterion("packaging_unit <=", value, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitLike(String value) {
            addCriterion("packaging_unit like", value, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitNotLike(String value) {
            addCriterion("packaging_unit not like", value, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitIn(List<String> values) {
            addCriterion("packaging_unit in", values, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitNotIn(List<String> values) {
            addCriterion("packaging_unit not in", values, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitBetween(String value1, String value2) {
            addCriterion("packaging_unit between", value1, value2, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andPackagingUnitNotBetween(String value1, String value2) {
            addCriterion("packaging_unit not between", value1, value2, "packagingUnit");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNull() {
            addCriterion("formula is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNotNull() {
            addCriterion("formula is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaEqualTo(String value) {
            addCriterion("formula =", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotEqualTo(String value) {
            addCriterion("formula <>", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThan(String value) {
            addCriterion("formula >", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("formula >=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThan(String value) {
            addCriterion("formula <", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThanOrEqualTo(String value) {
            addCriterion("formula <=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLike(String value) {
            addCriterion("formula like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotLike(String value) {
            addCriterion("formula not like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaIn(List<String> values) {
            addCriterion("formula in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotIn(List<String> values) {
            addCriterion("formula not in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaBetween(String value1, String value2) {
            addCriterion("formula between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotBetween(String value1, String value2) {
            addCriterion("formula not between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("catalog is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(Integer value) {
            addCriterion("catalog =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(Integer value) {
            addCriterion("catalog <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(Integer value) {
            addCriterion("catalog >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(Integer value) {
            addCriterion("catalog >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(Integer value) {
            addCriterion("catalog <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(Integer value) {
            addCriterion("catalog <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<Integer> values) {
            addCriterion("catalog in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<Integer> values) {
            addCriterion("catalog not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(Integer value1, Integer value2) {
            addCriterion("catalog between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(Integer value1, Integer value2) {
            addCriterion("catalog not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andNetContentIsNull() {
            addCriterion("net_content is null");
            return (Criteria) this;
        }

        public Criteria andNetContentIsNotNull() {
            addCriterion("net_content is not null");
            return (Criteria) this;
        }

        public Criteria andNetContentEqualTo(String value) {
            addCriterion("net_content =", value, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentNotEqualTo(String value) {
            addCriterion("net_content <>", value, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentGreaterThan(String value) {
            addCriterion("net_content >", value, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentGreaterThanOrEqualTo(String value) {
            addCriterion("net_content >=", value, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentLessThan(String value) {
            addCriterion("net_content <", value, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentLessThanOrEqualTo(String value) {
            addCriterion("net_content <=", value, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentLike(String value) {
            addCriterion("net_content like", value, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentNotLike(String value) {
            addCriterion("net_content not like", value, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentIn(List<String> values) {
            addCriterion("net_content in", values, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentNotIn(List<String> values) {
            addCriterion("net_content not in", values, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentBetween(String value1, String value2) {
            addCriterion("net_content between", value1, value2, "netContent");
            return (Criteria) this;
        }

        public Criteria andNetContentNotBetween(String value1, String value2) {
            addCriterion("net_content not between", value1, value2, "netContent");
            return (Criteria) this;
        }

        public Criteria andMilkSectionIsNull() {
            addCriterion("milk_section is null");
            return (Criteria) this;
        }

        public Criteria andMilkSectionIsNotNull() {
            addCriterion("milk_section is not null");
            return (Criteria) this;
        }

        public Criteria andMilkSectionEqualTo(Integer value) {
            addCriterion("milk_section =", value, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionNotEqualTo(Integer value) {
            addCriterion("milk_section <>", value, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionGreaterThan(Integer value) {
            addCriterion("milk_section >", value, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("milk_section >=", value, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionLessThan(Integer value) {
            addCriterion("milk_section <", value, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionLessThanOrEqualTo(Integer value) {
            addCriterion("milk_section <=", value, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionIn(List<Integer> values) {
            addCriterion("milk_section in", values, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionNotIn(List<Integer> values) {
            addCriterion("milk_section not in", values, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionBetween(Integer value1, Integer value2) {
            addCriterion("milk_section between", value1, value2, "milkSection");
            return (Criteria) this;
        }

        public Criteria andMilkSectionNotBetween(Integer value1, Integer value2) {
            addCriterion("milk_section not between", value1, value2, "milkSection");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(String value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(String value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(String value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(String value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(String value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(String value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLike(String value) {
            addCriterion("comment_num like", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotLike(String value) {
            addCriterion("comment_num not like", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<String> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<String> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(String value1, String value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(String value1, String value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageIsNull() {
            addCriterion("prise_percentage is null");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageIsNotNull() {
            addCriterion("prise_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageEqualTo(String value) {
            addCriterion("prise_percentage =", value, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageNotEqualTo(String value) {
            addCriterion("prise_percentage <>", value, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageGreaterThan(String value) {
            addCriterion("prise_percentage >", value, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("prise_percentage >=", value, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageLessThan(String value) {
            addCriterion("prise_percentage <", value, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageLessThanOrEqualTo(String value) {
            addCriterion("prise_percentage <=", value, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageLike(String value) {
            addCriterion("prise_percentage like", value, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageNotLike(String value) {
            addCriterion("prise_percentage not like", value, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageIn(List<String> values) {
            addCriterion("prise_percentage in", values, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageNotIn(List<String> values) {
            addCriterion("prise_percentage not in", values, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageBetween(String value1, String value2) {
            addCriterion("prise_percentage between", value1, value2, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andPrisePercentageNotBetween(String value1, String value2) {
            addCriterion("prise_percentage not between", value1, value2, "prisePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageIsNull() {
            addCriterion("middle_percentage is null");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageIsNotNull() {
            addCriterion("middle_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageEqualTo(String value) {
            addCriterion("middle_percentage =", value, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageNotEqualTo(String value) {
            addCriterion("middle_percentage <>", value, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageGreaterThan(String value) {
            addCriterion("middle_percentage >", value, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("middle_percentage >=", value, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageLessThan(String value) {
            addCriterion("middle_percentage <", value, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageLessThanOrEqualTo(String value) {
            addCriterion("middle_percentage <=", value, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageLike(String value) {
            addCriterion("middle_percentage like", value, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageNotLike(String value) {
            addCriterion("middle_percentage not like", value, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageIn(List<String> values) {
            addCriterion("middle_percentage in", values, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageNotIn(List<String> values) {
            addCriterion("middle_percentage not in", values, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageBetween(String value1, String value2) {
            addCriterion("middle_percentage between", value1, value2, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andMiddlePercentageNotBetween(String value1, String value2) {
            addCriterion("middle_percentage not between", value1, value2, "middlePercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageIsNull() {
            addCriterion("bad_percentage is null");
            return (Criteria) this;
        }

        public Criteria andBadPercentageIsNotNull() {
            addCriterion("bad_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andBadPercentageEqualTo(String value) {
            addCriterion("bad_percentage =", value, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageNotEqualTo(String value) {
            addCriterion("bad_percentage <>", value, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageGreaterThan(String value) {
            addCriterion("bad_percentage >", value, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageGreaterThanOrEqualTo(String value) {
            addCriterion("bad_percentage >=", value, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageLessThan(String value) {
            addCriterion("bad_percentage <", value, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageLessThanOrEqualTo(String value) {
            addCriterion("bad_percentage <=", value, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageLike(String value) {
            addCriterion("bad_percentage like", value, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageNotLike(String value) {
            addCriterion("bad_percentage not like", value, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageIn(List<String> values) {
            addCriterion("bad_percentage in", values, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageNotIn(List<String> values) {
            addCriterion("bad_percentage not in", values, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageBetween(String value1, String value2) {
            addCriterion("bad_percentage between", value1, value2, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andBadPercentageNotBetween(String value1, String value2) {
            addCriterion("bad_percentage not between", value1, value2, "badPercentage");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("image_path is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("image_path is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("image_path =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("image_path <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("image_path >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("image_path >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("image_path <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("image_path <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("image_path like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("image_path not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("image_path in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("image_path not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("image_path between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("image_path not between", value1, value2, "imagePath");
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