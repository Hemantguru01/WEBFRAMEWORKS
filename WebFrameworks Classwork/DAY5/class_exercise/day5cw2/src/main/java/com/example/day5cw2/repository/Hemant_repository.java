package com.example.day5cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.model.Hemant_MODEL;


@Repository
public interface Hemant_repository extends JpaRepository<Hemant_MODEL,Integer>{
    
}
