package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.Hemant_model;
import com.examly.class_exercise_2.service.Hemant_ser;

@RestController
public class Hemant_controller {

     @Autowired
     public Hemant_ser CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<Hemant_model> postMethodName(@RequestBody Hemant_model entity) {

          Hemant_model inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<Hemant_model>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<Hemant_model>> getMethodName() {

          List<Hemant_model> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Hemant_model>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Hemant_model>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<Hemant_model> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}