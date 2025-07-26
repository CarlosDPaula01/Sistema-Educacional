package com.sistemaeducacional.application.sistemaeducacional.Model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class MateriaModel {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private List<CursoModel> cursos;
    private List<ProfessorModel> professores;
    private List<AlunoModel> alunos;
    private String cargaHoraria;
    private String requisitos;
    private String preRequisitoPara;
    private String horarios;
    private String status;

    public MateriaModel(List<CursoModel> cursos, List<ProfessorModel> professores, String cargaHoraria,
String requisitos, String preRequisitospara, String horarios ){
    this.cursos = cursos;
    this.professores = professores;
    this.cargaHoraria = cargaHoraria;
    this.requisitos = requisitos;
    this.preRequisitoPara = preRequisitospara;
    this.horarios = horarios;
    }
}
