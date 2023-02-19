package com.example.Ecommerce.service;

import com.example.Ecommerce.Exception.exception;
import com.example.Ecommerce.model.Address;
import com.example.Ecommerce.model.Order;
import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class Orderservice {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private Addressservice addressservice;
    @Autowired
    private Productservice productservice;
    @Autowired
    private Userservice userservice;
    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }

    public Order placeOrder(Integer userId, Integer productId, Integer addressId) {
        User user = userservice.getUserById(userId)
                .orElseThrow(() -> new exception("User not found with id: " + userId));
        Product product = productservice.getProductById(productId)
                .orElseThrow(() -> new exception("Product not found with id: " + productId));
        Address address = addressservice.getAddressById(addressId)
                .orElseThrow(() -> new exception("Address not found with id: " + addressId));

        Order order = new Order();
        order.setUserId(user);
        order.setProductId(product);
        order.setAddressId(address);
        return orderRepository.save(order);
    }
}
