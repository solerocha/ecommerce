package com.spring.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ecommerce.models.Product;
import com.spring.ecommerce.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository prodRepo;

    @Override
    public Product save(Product prod) {
        return prodRepo.save(prod);
    }

    @Override
    public Optional<Product> get(Long id) {
        return prodRepo.findById(id);
    }

    @Override
    public void update(Product prod) {
        prodRepo.save(prod);
    }

    @Override
    public void delete(Long id) {
        prodRepo.deleteById(id);
    }

    @Override
    public List<Product> findAll(){
        return prodRepo.findAll();
    }

}
