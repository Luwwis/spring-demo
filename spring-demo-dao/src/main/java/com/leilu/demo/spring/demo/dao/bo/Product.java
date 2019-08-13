package com.leilu.demo.spring.demo.dao.bo;

/**
 * Created by leilu on 2019/6/4.
 */
public class Product {
    private Long id;
    private String name;
    private String skuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
