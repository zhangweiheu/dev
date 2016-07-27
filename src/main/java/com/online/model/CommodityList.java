package com.online.model;

import java.io.Serializable;

/**
 * dev.commodity_list  
 *
 * @author zhang
 * @date 2016-7-27
 *
 */
public class CommodityList implements Serializable {
    /**  */
    private Long id;

    /**  */
    private Long sequence;

    /**  */
    private String commodityName;

    /**  */
    private Integer catalogId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }
}