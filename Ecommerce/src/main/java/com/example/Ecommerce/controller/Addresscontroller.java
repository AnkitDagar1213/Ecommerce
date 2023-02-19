package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Address;
import com.example.Ecommerce.repository.AddressRepository;
import com.example.Ecommerce.service.Addressservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addresscontroller {
    @Autowired
    private Addressservice addressservice;
    @PostMapping("addAddress")
    public ResponseEntity<Address> addAddress(@RequestBody Address address) {
        Address newAddress = addressservice.addaddress(address);
        return ResponseEntity.ok().body(newAddress);
    }
}
