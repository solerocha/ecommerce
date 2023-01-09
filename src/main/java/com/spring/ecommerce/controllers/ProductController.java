package com.spring.ecommerce.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ecommerce.models.Product;
import com.spring.ecommerce.models.User;
import com.spring.ecommerce.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String show() {
        return "/products/show";
    }

    @GetMapping("/new-product")
    public String create() {
        return "/products/create";
    }

    @PostMapping("/save")
    public String save(Product product) {
        LOGGER.info("Este es el objeto producto {}", product);
        User u = new User((long) 1, "", "", "", "", "", "", "");
        product.setUser(u);
        productService.save(product);
        return "redirect:/products";
    }

}
