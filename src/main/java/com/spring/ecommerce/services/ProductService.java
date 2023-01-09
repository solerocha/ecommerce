package com.spring.ecommerce.services;

import java.util.List;
import java.util.Optional;

import com.spring.ecommerce.models.Product;

public interface ProductService {

    public Product save(Product prod);

    public Optional<Product> get(Long id);

    public void update(Product prod);

    public void delete(Long id);

    public List<Product> findAll();

}
