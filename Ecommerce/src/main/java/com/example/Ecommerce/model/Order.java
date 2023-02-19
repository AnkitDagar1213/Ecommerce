package com.example.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @Column(name = "Order_Id")
    private Integer OrderId;
    @ManyToOne
    @JoinColumn(name = "User_Id")
    private User UserId;
    @ManyToOne
    @JoinColumn(name = "Address_Id")
    private Address AddressId;
    @ManyToOne
    @JoinColumn(name = "Product_Id")
    private Product ProductId;
    @Column(name = "product_quantity")
    private String productQuantity;
}
