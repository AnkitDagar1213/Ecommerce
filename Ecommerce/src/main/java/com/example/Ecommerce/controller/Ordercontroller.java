package com.example.Ecommerce.controller;

import com.example.Ecommerce.Exception.exception;
import com.example.Ecommerce.model.Address;
import com.example.Ecommerce.model.Order;
import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repository.AddressRepository;
import com.example.Ecommerce.repository.OrderRepository;
import com.example.Ecommerce.repository.ProductRepository;
import com.example.Ecommerce.repository.UserRepository;
import com.example.Ecommerce.service.Addressservice;
import com.example.Ecommerce.service.Orderservice;
import com.example.Ecommerce.service.Productservice;
import com.example.Ecommerce.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Order")
public class Ordercontroller {

    @Autowired
    private Orderservice orderservice;
    @PostMapping("Place_Order")
    public ResponseEntity<Order> placeOrder(@RequestParam(value = "userId") Integer userId,
                                            @RequestParam(value = "productId") Integer productId,
                                            @RequestParam(value = "addressId") Integer addressId) {
        Order newOrder = orderservice.placeOrder(userId,productId,addressId);
        return ResponseEntity.ok().body(newOrder);
    }

    @GetMapping("ger_Order/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable(value = "id") Integer id) {
        Order order = orderservice.getOrderById(id)
                .orElseThrow(() -> new exception("Order not found with id: " + id));
        return ResponseEntity.ok().body(order);
    }
}
