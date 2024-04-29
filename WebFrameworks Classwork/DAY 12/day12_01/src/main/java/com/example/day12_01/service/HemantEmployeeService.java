package com.example.day12_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.DilipEmployee;
import com.example.day12_01.repository.DilipEmployeeRepo;

@Service
public class HemantEmployeeService {
    @Autowired
    HemantEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public HemantEmployee setEmployee(HemantEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<HemantEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<HemantEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
