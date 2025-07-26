package com.sistemaeducacional.application.sistemaeducacional.Model;

public class AdminModel extends User{
    

    public AdminModel(String nome, String email, String senha, String username){
        super(nome, email, senha, "Admin", username);
    }
}
