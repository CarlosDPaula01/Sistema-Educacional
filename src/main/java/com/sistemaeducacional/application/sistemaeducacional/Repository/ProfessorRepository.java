package com.sistemaeducacional.application.sistemaeducacional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaeducacional.application.sistemaeducacional.Model.ProfessorModel;

public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long>{

    
}