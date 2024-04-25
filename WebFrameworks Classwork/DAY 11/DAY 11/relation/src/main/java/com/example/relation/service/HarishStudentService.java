package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.HarishStudent;
import com.example.relation.repository.HarishStudentRepository;

@Service
public class HarishStudentService {
    public HarishStudentRepository studentRepository;
    public HarishStudentService(HarishStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public HarishStudent saveStudent(HarishStudent student)
    {
        return studentRepository.save(student);
    }
    public List<HarishStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
