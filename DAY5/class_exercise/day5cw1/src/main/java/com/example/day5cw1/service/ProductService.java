package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.GUNESHWAR_model;
import com.example.day5cw1.repository.GUNESHWAR_repository;

@Service
public class ProductService {
    public GUNESHWAR_repository productRepo;
    public ProductService(GUNESHWAR_repository productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(GUNESHWAR_model product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,GUNESHWAR_model product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public GUNESHWAR_model getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
