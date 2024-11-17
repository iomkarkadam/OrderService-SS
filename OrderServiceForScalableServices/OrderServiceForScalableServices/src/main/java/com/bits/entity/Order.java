package com.bits.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private long orderId;

    private String productName;

    private int productPrice;

    private String pincode;

    private long userId;

    private String userName;


}
