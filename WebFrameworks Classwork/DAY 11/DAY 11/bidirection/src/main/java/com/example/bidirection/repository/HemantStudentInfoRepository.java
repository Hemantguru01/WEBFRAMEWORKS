package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.HemantStudentInfo;

@Repository
public interface HemantStudentInfoRepository extends JpaRepository<HemantStudentInfo,Integer>{
    
}