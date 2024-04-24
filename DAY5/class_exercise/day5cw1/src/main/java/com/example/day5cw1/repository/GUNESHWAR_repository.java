package com.example.day5cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.model.GUNESHWAR_model;

@Repository
public interface GUNESHWAR_repository extends JpaRepository<GUNESHWAR_model,Integer>{
    
}
