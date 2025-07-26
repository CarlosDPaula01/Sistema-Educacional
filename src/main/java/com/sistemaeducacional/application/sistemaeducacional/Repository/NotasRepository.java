package com.sistemaeducacional.application.sistemaeducacional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaeducacional.application.sistemaeducacional.Model.AlunoModel;
import com.sistemaeducacional.application.sistemaeducacional.Model.NotaModel;

public interface NotasRepository extends JpaRepository<NotaModel, AlunoModel>{

    
}