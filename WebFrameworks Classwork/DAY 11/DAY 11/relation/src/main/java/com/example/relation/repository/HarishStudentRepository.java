package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.HarishStudent;

@Repository
public interface HarishStudentRepository extends JpaRepository<HarishStudent,Integer>{
    
}
