package com.sistemaeducacional.application.sistemaeducacional.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaeducacional.application.sistemaeducacional.Model.HistoricoModel;

public interface HistoricoRepository extends JpaRepository<HistoricoModel, Long>{

    
}