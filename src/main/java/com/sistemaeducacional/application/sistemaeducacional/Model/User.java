package com.sistemaeducacional.application.sistemaeducacional.Model;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Entity
@MappedSuperclass
@Getter
public abstract class User {
    private String nome;
    private String email;
    private String senha;
    private String role;

    @Id
    private String username;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;

    public User(String nome, String email, String senha, String role, String username){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
        this.username = username;
    }
}
