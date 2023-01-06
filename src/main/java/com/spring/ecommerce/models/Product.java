package com.spring.ecommerce.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameProd;
    private String description;
    private String imageUrl;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String nameProd, String description, String image, double price, int quantity) {
        this.nameProd = nameProd;
        this.description = description;
        this.imageUrl = image;
        this.price = price;
        this.quantity = quantity;
    }

}
