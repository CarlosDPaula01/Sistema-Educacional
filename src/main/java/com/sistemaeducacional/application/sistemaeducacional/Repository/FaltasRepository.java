package com.sistemaeducacional.application.sistemaeducacional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaeducacional.application.sistemaeducacional.Model.AlunoModel;
import com.sistemaeducacional.application.sistemaeducacional.Model.FaltasModel;

public interface FaltasRepository extends JpaRepository<FaltasModel, AlunoModel>{

    
}