package com.example.day14ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.model.DilipPayroll;

@Repository
public interface HemantPayrollRepo extends JpaRepository<DilipPayroll,Long> {
    
}
