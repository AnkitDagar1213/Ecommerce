package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Product")
public class Productcontroller {
    @Autowired
    private Productservice productservice;
    @GetMapping("/search")
    public ResponseEntity<Optional<Product>> getProductsByCategory(@RequestParam(value = "category") Integer Id) {
        Optional<Product> products = productservice.getProductsByCategory(Id);
        return ResponseEntity.ok().body(products);
    }

    @PostMapping("")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product newProduct = productservice.addProduct(product);
        return ResponseEntity.ok().body(newProduct);
    }
    @GetMapping("/getAllProduct")
    public List<Product> findAllProduct() {
        return productservice.findAll();
    }
    @DeleteMapping("/deleteProduct")
    public void deleteProduct(@RequestParam int Id) {
        productservice.deleteproduct(Id);
    }
}
