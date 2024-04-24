package com.example.day6cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.model.Hemant_model;

@Repository
public interface Hemant_REPO extends JpaRepository<Hemant_model,Integer>{
    
}
