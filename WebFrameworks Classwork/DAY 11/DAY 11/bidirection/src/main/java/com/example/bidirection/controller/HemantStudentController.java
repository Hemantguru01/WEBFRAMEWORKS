package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.HemantStudent;
import com.example.bidirection.model.HemantStudentInfo;
import com.example.bidirection.service.HemantStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HemantStudentController {
    public HemantStudentService studentService;
    public HemantStudentController(HemantStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public HemantStudent postMethodName(@RequestBody HemantStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public HemantStudentInfo postMethodName(@RequestBody HemantStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<HemantStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}