package com.example.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.Hemant_model;
import com.example.class_exercise_2.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HemantController {

     @Autowired
     public StudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<Hemant_model>> getDetails() {
          List<Hemant_model> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<Hemant_model>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Hemant_model>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<Hemant_model> postMethodName(@RequestBody Hemant_model student) {

          Hemant_model postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<Hemant_model>> sortedDetails(@PathVariable String field) {
          List<Hemant_model> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<Hemant_model>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Hemant_model>>(list, HttpStatus.OK);

     }
}
