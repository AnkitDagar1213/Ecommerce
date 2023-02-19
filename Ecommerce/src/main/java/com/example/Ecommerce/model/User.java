package com.example.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="User_Info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private Integer UserId;
    @NotNull(message = "Can't be null")
    @Column(name = "Name")
    private String Name;
    @NotNull(message = "Can't be null")
    @Email(message = "Invalid email address")
    @Column(name = "Email")
    private String Email;
    @NotNull(message = "Can't be null")
    @Column(name = "Password")
    private String Password;
    @Column(name = "Phone_number")
    private String Phone_number;
}
