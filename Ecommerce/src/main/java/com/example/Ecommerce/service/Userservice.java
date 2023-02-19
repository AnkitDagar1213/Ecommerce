package com.example.Ecommerce.service;

import com.example.Ecommerce.Exception.exception;
import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class Userservice {
    @Autowired
    private UserRepository userRepository;
    public User addUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }
}
