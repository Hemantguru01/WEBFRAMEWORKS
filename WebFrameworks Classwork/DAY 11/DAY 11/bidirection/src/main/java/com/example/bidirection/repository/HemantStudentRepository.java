package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.HemantStudent;



@Repository
public interface HemantStudentRepository extends JpaRepository<HemantStudent,Integer>{
    
}
