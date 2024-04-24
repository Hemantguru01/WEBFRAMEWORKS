package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.Hemant_model;
import com.examly.class_exercise_1.repository.Hemant_repo;

@Service
public class Hemant_service {

     @Autowired
     public Hemant_repo personRepo;

     public Hemant_model SaveEntity(Hemant_model entity) {
          return personRepo.save(entity);

     }

     public List<Hemant_model> getDetails() {
          return personRepo.findAll();

     }

     public List<Hemant_model> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
