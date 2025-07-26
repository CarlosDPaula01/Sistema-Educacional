package com.sistemaeducacional.application.sistemaeducacional.Model;

import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class NotaModel {
    
    private MateriaModel materia;
    private AlunoModel aluno;
    private Double nota01;
    private Double nota02;
    private Double nota03;
    private Double notaFinal;
    private Double mediaFinal;

    public NotaModel(AlunoModel aluno, MateriaModel materia){this.aluno = aluno; this.materia = materia;}
}
