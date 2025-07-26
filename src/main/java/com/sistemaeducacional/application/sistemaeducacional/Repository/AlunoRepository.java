package com.sistemaeducacional.application.sistemaeducacional.Repository;

import com.sistemaeducacional.application.sistemaeducacional.Model.AlunoModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{
    
}
