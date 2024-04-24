package com.example.day5cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.model.Hemant_model;

@Repository
public interface Hemant_repository extends JpaRepository<Hemant_model,Integer>{
    
}
