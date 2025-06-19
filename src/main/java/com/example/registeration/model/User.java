package com.example.registeration.model;

import com.example.registeration.validation.EmailMatch;
import com.example.registeration.validation.PasswordMatch;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
@EmailMatch
@PasswordMatch
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    @Transient
    private String confirmEmail;
    private String password;
    @Transient
    private String confirmPassword;
}
