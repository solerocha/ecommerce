package com.spring.ecommerce.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double quantity;
    private double price;
    private double totalOrder;

    public OrderDetail() {

    }

    public OrderDetail(String name, double quantity, double price, double totalOrder) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.totalOrder = totalOrder;
    }

}
