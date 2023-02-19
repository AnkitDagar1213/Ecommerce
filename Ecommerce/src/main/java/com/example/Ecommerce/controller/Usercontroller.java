package com.example.Ecommerce.controller;

import com.example.Ecommerce.Exception.exception;
import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repository.UserRepository;
import com.example.Ecommerce.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ecommerce")
//http://localhost:8080/swagger-ui/index.html
public class Usercontroller {
    @Autowired
    private Userservice userservice;
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userservice.addUser(user);
    }
    @GetMapping("getUser/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Integer id) {
        User user = userservice.getUserById(id)
                .orElseThrow(() -> new exception("User not found with id: " + id));
        return ResponseEntity.ok().body(user);
    }
}
