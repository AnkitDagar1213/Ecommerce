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

    @PostMapping("addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product newProduct = productservice.addProduct(product);
        return ResponseEntity.ok().body(newProduct);
    }
    @GetMapping("getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productservice.findAll();
        return ResponseEntity.ok().body(products);
    }
    @DeleteMapping("deleteProduct/{id}")
    public ResponseEntity<?> delete_Product(@PathVariable(value = "id") Integer id) {
        productservice.delete_Product(id);
        return ResponseEntity.ok().build();
    }
}
