package com.sistemaeducacional.application.sistemaeducacional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaeducacional.application.sistemaeducacional.Model.MateriaModel;

public interface MateriasRepository extends JpaRepository<MateriaModel, Long>{
    
}
