package com.sistemaeducacional.application.sistemaeducacional.Model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class MateriaModel {
    
    private List<CursoModel> cursos;
    private List<ProfessorModel> professores;
    private List<AlunoModel> alunos;
    private String cargaHoraria;
    private String requisitos;
    private String horarios;
    private String preRequisitoPara;
    private String status;

    
}
