package com.sistemaeducacional.application.sistemaeducacional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaeducacional.application.sistemaeducacional.Model.CursoModel;

public interface CursoRepository extends JpaRepository<CursoModel, Long>{

    
}