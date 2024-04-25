package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.HarishStudent;
import com.example.relation.service.HarishStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HarishStudentController {
    public HarishStudentService studentService;
    public HarishStudentController(HarishStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public HarishStudent postMethodName(@RequestBody HarishStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<HarishStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
