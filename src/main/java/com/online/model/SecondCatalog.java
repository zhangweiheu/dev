package com.online.model;

import java.io.Serializable;

/**
 * dev.second_catalog  
 *
 * @author zhang
 * @date 2016-7-27
 *
 */
public class SecondCatalog implements Serializable {
    /**  */
    private Integer id;

    /**  */
    private Integer firstCatalogId;

    /**  */
    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirstCatalogId() {
        return firstCatalogId;
    }

    public void setFirstCatalogId(Integer firstCatalogId) {
        this.firstCatalogId = firstCatalogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}