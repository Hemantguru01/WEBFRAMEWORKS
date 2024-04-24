package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.Hemant_model;

/**
 * PersonRepo
 */
@Repository
public interface Hemant_repo extends JpaRepository<Hemant_model, Integer> {

     List<Hemant_model> findByAge(int byAge);
}