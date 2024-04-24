package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.model.Hemant_MODEL;
import com.example.day5cw2.repository.Hemant_repository;

@Service
public class EmployeeService {
    public Hemant_repository employeeRepo;
    public EmployeeService(Hemant_repository employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(Hemant_MODEL employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Hemant_MODEL employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public Hemant_MODEL getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
