package com.sistemaeducacional.application.sistemaeducacional.Model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AlunoModel extends User{


    private MatriculaModel matricula;    
    private CursoModel curso;
    private TurmaModel turma;
    private List<MateriaModel> materiasAtuais;
    private List<MateriaModel> materiasAnteriores;
    private List<NotaModel> notas;
    private List<FaltasModel> faltas;
    private String status = null;


    public AlunoModel(String nome, String email, String senha, String username ,MatriculaModel matricula, CursoModel curso){
        super(nome, email, senha, "Aluno", username);
        status = "ativo";
        this.matricula = matricula;
        this.curso = curso;
    }
}
