package com.example.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    @Column(name = "Address_Id")
    private Integer AddressId;
    @NotBlank(message = "Can't be null")
    @Column(name = "name")
    private String Name;
    @NotBlank(message = "Can't be null")
    @Column(name = "landmark")
    private String Landmark;
    @NotBlank(message = "Can't be null")
    @Column(name = "phone_number")
    private String Phone_number;
    @NotBlank(message = "Can't be null")
    @Column(name = "zipcode")
    private String Zipcode;
    @NotBlank(message = "Can't be null")
    @Column(name = "state")
    private String state;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User UserID;
}
