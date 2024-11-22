package com.bits.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private String pincode;

    private String userId;

    private String productId;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "pincode='" + pincode + '\'' +
                ", userId='" + userId + '\'' +
                ", productId='" + productId + '\'' +
                '}';
    }
}
