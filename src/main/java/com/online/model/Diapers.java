package com.online.model;

import java.io.Serializable;

/**
 * dev.diapers  
 *
 * @author zhang
 * @date 2016-7-27
 *
 */
public class Diapers implements Serializable {
    /**  */
    private Long id;

    /** 产品标题描述 */
    private String titleDes;

    /**  */
    private String name;

    /** 产品编号 */
    private Integer commodityId;

    /**  */
    private Long price;

    /** 商品毛重 */
    private Double weight;

    /**  */
    private String size;

    /**  */
    private String sex;

    /** 产地 */
    private String address;

    /** 是否国产 */
    private Integer ischina;

    /** 适用年龄 */
    private String age;

    /** 包装单位 */
    private String packagingUnit;

    /** 分类 */
    private Integer catalog;

    /** 评价数量 */
    private String commentNum;

    /**  */
    private String prisePercentage;

    /**  */
    private String middlePercentage;

    /**  */
    private String badPercentage;

    /**  */
    private String imagePath;

    /** 买家印象 */
    private byte[] impression;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleDes() {
        return titleDes;
    }

    public void setTitleDes(String titleDes) {
        this.titleDes = titleDes == null ? null : titleDes.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIschina() {
        return ischina;
    }

    public void setIschina(Integer ischina) {
        this.ischina = ischina;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getPackagingUnit() {
        return packagingUnit;
    }

    public void setPackagingUnit(String packagingUnit) {
        this.packagingUnit = packagingUnit == null ? null : packagingUnit.trim();
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum == null ? null : commentNum.trim();
    }

    public String getPrisePercentage() {
        return prisePercentage;
    }

    public void setPrisePercentage(String prisePercentage) {
        this.prisePercentage = prisePercentage == null ? null : prisePercentage.trim();
    }

    public String getMiddlePercentage() {
        return middlePercentage;
    }

    public void setMiddlePercentage(String middlePercentage) {
        this.middlePercentage = middlePercentage == null ? null : middlePercentage.trim();
    }

    public String getBadPercentage() {
        return badPercentage;
    }

    public void setBadPercentage(String badPercentage) {
        this.badPercentage = badPercentage == null ? null : badPercentage.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public byte[] getImpression() {
        return impression;
    }

    public void setImpression(byte[] impression) {
        this.impression = impression;
    }
}