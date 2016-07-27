package com.online.model;

import java.io.Serializable;

/**
 * dev.milk  
 *
 * @author zhang
 * @date 2016-7-27
 *
 */
public class Milk implements Serializable {
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

    /** 产地 */
    private String address;

    /** 奶源产地 */
    private String milkAddr;

    /**  */
    private Integer ischina;

    /** 适用年龄 */
    private String age;

    /** 包装单位 */
    private String packagingUnit;

    /** 配方 */
    private String formula;

    /** 分类 */
    private Integer catalog;

    /** 净含量 */
    private String netContent;

    /** 段位 */
    private Integer milkSection;

    /** 评价数量 */
    private String commentNum;

    /**  */
    private Long priseNum;

    /**  */
    private Long middleNum;

    /**  */
    private Long badNum;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMilkAddr() {
        return milkAddr;
    }

    public void setMilkAddr(String milkAddr) {
        this.milkAddr = milkAddr == null ? null : milkAddr.trim();
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

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
    }

    public String getNetContent() {
        return netContent;
    }

    public void setNetContent(String netContent) {
        this.netContent = netContent == null ? null : netContent.trim();
    }

    public Integer getMilkSection() {
        return milkSection;
    }

    public void setMilkSection(Integer milkSection) {
        this.milkSection = milkSection;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum == null ? null : commentNum.trim();
    }

    public Long getPriseNum() {
        return priseNum;
    }

    public void setPriseNum(Long priseNum) {
        this.priseNum = priseNum;
    }

    public Long getMiddleNum() {
        return middleNum;
    }

    public void setMiddleNum(Long middleNum) {
        this.middleNum = middleNum;
    }

    public Long getBadNum() {
        return badNum;
    }

    public void setBadNum(Long badNum) {
        this.badNum = badNum;
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