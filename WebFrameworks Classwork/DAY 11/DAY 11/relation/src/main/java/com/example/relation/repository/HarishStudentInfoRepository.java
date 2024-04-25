package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.HarishStudentInfo;

@Repository
public interface HarishStudentInfoRepository extends JpaRepository<HarishStudentInfo,Integer>{
    
}