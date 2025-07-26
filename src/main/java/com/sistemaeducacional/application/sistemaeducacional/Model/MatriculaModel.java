package com.sistemaeducacional.application.sistemaeducacional.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class MatriculaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private AlunoModel aluno;
    private CursoModel curso;
    private LocalDate dataMatricula;
    private List<MateriaModel> materiasAtuais;
    private List<MateriaModel> materiasAnteriores;
    private List<NotaModel> notasFinais;

    public MatriculaModel(AlunoModel aluno){
        this.aluno = aluno;
        this.curso = aluno.getCurso();
        dataMatricula = dataMatricula.now();
    }
}
