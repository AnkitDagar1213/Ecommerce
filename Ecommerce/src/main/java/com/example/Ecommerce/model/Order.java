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
@Table(name="Order_Info")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderId;
    @JoinColumn
    @ManyToOne
    private User UserId;
    @JoinColumn
    @ManyToMany
    private Address AddressId;
    @JoinColumn
    @OneToOne
    private Product ProductId;
    private String productQuantity;
}
