package com.example.day5cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.model.GUNESHWAR_MODEL;


@Repository
public interface GUNESHWAR_repository extends JpaRepository<GUNESHWAR_MODEL,Integer>{
    
}
