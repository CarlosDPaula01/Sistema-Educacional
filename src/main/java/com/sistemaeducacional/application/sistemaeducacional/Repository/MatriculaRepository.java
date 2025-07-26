package com.sistemaeducacional.application.sistemaeducacional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaeducacional.application.sistemaeducacional.Model.MatriculaModel;

public interface MatriculaRepository extends JpaRepository<MatriculaModel, Long>{ 

}