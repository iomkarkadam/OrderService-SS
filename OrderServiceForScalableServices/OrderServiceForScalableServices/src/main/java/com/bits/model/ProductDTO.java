package com.bits.model;


public class ProductDTO {

    private String productName;

    private String productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public ProductDTO(String productName, String productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public ProductDTO(){}
}
