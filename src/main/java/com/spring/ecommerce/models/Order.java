package com.spring.ecommerce.models;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private Date dateOfCreation;
    private Date dateOfDElivery;
    private double total;

    public Order() {

    }

    public Order(String number, Date dateOfCreation, Date dateOfDElivery, double total) {
        this.number = number;
        this.dateOfCreation = dateOfCreation;
        this.dateOfDElivery = dateOfDElivery;
        this.total = total;
    }

}