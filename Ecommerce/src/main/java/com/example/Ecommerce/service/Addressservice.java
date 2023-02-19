package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Address;
import com.example.Ecommerce.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class Addressservice {
    @Autowired
    private AddressRepository addressRepository;
    public Address addaddress(Address address) {
        return addressRepository.save(address);
    }
    public Optional<Address> getAddressById(Integer id) {
        return addressRepository.findById(id);
    }
}