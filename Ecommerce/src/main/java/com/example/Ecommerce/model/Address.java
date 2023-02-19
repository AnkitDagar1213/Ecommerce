package com.example.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Address_Info")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AddressId;
    private String Name;
    private String Landmark;
    private String Phone_number;
    private String Zipcode;
    private String state;
    @JoinColumn
    @OneToMany
    private User UserID;
}