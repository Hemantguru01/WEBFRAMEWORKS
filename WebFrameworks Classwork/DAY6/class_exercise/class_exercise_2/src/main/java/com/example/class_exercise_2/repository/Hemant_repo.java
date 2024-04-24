package com.example.class_exercise_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.model.Hemant_model;

@Repository
public interface Hemant_repo extends JpaRepository<Hemant_model, Integer> {

}