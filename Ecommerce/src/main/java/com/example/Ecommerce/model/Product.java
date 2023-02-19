package com.example.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
@Table(name="Product_Info")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_Id")
    private Integer ProductId;
    @NotBlank(message = "Can't be null")
    @Column(name = "name")
    private String Name;
    @NotNull(message = "Can't be null")
    @Column(name = "price")
    private String Price;
    @NotBlank(message = "Can't be null")
    @Column(name = "description")
    private String Description;
    @NotBlank(message = "Can't be null")
    @Column(name = "category")
    private String Category;
    @NotBlank(message = "Can't be null")
    @Column(name = "brand")
    private String Brand;
}
