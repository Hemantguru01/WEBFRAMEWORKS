package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.model.GUNESHWAR_MODEL;
import com.example.day5cw2.repository.GUNESHWAR_repository;

@Service
public class EmployeeService {
    public GUNESHWAR_repository employeeRepo;
    public EmployeeService(GUNESHWAR_repository employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(GUNESHWAR_MODEL employee)
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
    public boolean updateDetails(int id,GUNESHWAR_MODEL employee)
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
    public GUNESHWAR_MODEL getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
