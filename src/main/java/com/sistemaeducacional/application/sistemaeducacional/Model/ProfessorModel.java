package com.sistemaeducacional.application.sistemaeducacional.Model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class ProfessorModel extends User{

    private List<MateriaModel> materias;
    private List<TurmaModel> turmas;   
    
    public ProfessorModel(String nome, String email, String senha, String usuario, List<MateriaModel> materias, List<TurmaModel> turmas){
        super(nome, email, senha, "Professor", usuario);
        this.materias = materias;
        this.turmas = turmas;
    }


}
