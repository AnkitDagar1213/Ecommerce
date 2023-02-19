package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class Productservice {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }
    public String deleteproduct(int Id) {
        productRepository.deleteById(Id);
        return "Deleted";
    }
    public Optional<Product> getProductsByCategory(Integer Id) {
        return productRepository.findById(Id);
    }
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
