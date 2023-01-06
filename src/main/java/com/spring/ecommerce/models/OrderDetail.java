package com.spring.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orderdetails")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double quantity;
    private double price;
    private double totalOrder;

    @OneToOne
    private Order order;

    @ManyToOne
    private Product product;

    public OrderDetail() {

    }

    public OrderDetail(String name, double quantity, double price, double totalOrder) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.totalOrder = totalOrder;
    }

}
