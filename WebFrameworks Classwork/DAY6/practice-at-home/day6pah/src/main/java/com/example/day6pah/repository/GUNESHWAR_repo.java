package com.example.day6pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6pah.model.GUNESHWAR_model;

@Repository
public interface GUNESHWAR_repo extends JpaRepository<GUNESHWAR_model,Integer>{
    
}
