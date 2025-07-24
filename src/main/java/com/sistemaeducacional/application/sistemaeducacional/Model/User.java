package com.sistemaeducacional.application.sistemaeducacional.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class User {
    private String nome;
    private String email;
    private String senha;
    private UsersInterface role;

    @Id
    private String username;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
}
