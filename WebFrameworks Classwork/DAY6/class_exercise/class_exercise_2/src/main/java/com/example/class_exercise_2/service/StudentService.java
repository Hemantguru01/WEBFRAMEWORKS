package com.example.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.Hemant_model;
import com.example.class_exercise_2.repository.Hemant_repo;

@Service
public class StudentService {

     @Autowired
     public Hemant_repo studentRepo;

     public List<Hemant_model> getAll() {
          return studentRepo.findAll();
     }

     public Hemant_model post(Hemant_model student) {
          return studentRepo.save(student);
     }

     public List<Hemant_model> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
