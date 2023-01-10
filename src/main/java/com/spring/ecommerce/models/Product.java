package com.spring.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameProd;
    private String description;
    private String imageUrl;
    private double price;
    private int quantity;

    @ManyToOne
    private User user;

    public Product() {

    }

    public Product(String nameProd, String description, String image, double price, int quantity) {
        this.nameProd = nameProd;
        this.description = description;
        this.imageUrl = image;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String nameProd, String description, String imageUrl, double price, int quantity, User user) {
        this.nameProd = nameProd;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.quantity = quantity;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", nameProd=" + nameProd + ", description=" + description + ", imageUrl="
                + imageUrl + ", price=" + price + ", quantity=" + quantity + ", user=" + user + "]";
    }

    

}
