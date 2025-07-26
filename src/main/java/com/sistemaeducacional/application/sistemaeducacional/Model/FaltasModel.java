package com.sistemaeducacional.application.sistemaeducacional.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FaltasModel {
    
    private AlunoModel aluno;
    private MateriaModel materia;
    private Integer faltas;

   
}
