package com.example.day12_01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12_01.model.HemantEmployee;
import com.example.day12_01.service.HemantEmployeeService;

@RestController
public class HemantEmployeeController {
    @Autowired
    HemantEmployeeService employeeService;

    @PostMapping("/employee")
    public HemantEmployee setMethod(@RequestBody HemantEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<HemantEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<HemantEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
