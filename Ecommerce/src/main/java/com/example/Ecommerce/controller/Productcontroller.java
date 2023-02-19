package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.ProductRepository;
import com.example.Ecommerce.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Product")
public class Productcontroller {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private Productservice productservice;
    @GetMapping("/getAllProduct")
    public List<Product> findAllProduct() {
        return productservice.findAll();
    }
    @DeleteMapping("/deleteProduct")
    public void deleteProduct(@RequestParam int Id) {
        productservice.deleteproduct(Id);
    }
}
