package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.HemantStudent;
import com.example.bidirection.model.HemantStudentInfo;
import com.example.bidirection.repository.HemantStudentInfoRepository;
import com.example.bidirection.repository.HemantStudentRepository;

@Service
public class HemantStudentService {
    public HemantStudentRepository studentRepository;
    public HemantStudentInfoRepository studentInfoRepository;
    public HemantStudentService(HemantStudentRepository studentRepository,HemantStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public HemantStudent saveStudent(HemantStudent student)
    {
        return studentRepository.save(student);
    }
    public HemantStudentInfo saveStudentInfo(HemantStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<HemantStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
