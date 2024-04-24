package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.Hemant_model;
import com.examly.class_exercise_1.service.Hemant_service;

@RestController
public class Hemant_controller {

     @Autowired
     public Hemant_service personService;

     @PostMapping("/api/person")
     public ResponseEntity<Hemant_model> postMethodName(@RequestBody Hemant_model entity) {

          Hemant_model inst = personService.SaveEntity(entity);

          return new ResponseEntity<Hemant_model>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<Hemant_model>> getMethodName() {

          List<Hemant_model> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Hemant_model>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Hemant_model>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<Hemant_model> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}