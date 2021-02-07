package com.javadaily.microservice.productservice.service;

import com.javadaily.microservice.productservice.model.Product;
import com.javadaily.microservice.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void create(Product product){
        productRepository.save(product);
    }
}
