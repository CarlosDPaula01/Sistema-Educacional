package com.sistemaeducacional.application.sistemaeducacional.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TurmaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private CursoModel curso;
    private List<AlunoModel> alunos;
    private List<ProfessorModel> professores;


}
