package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.Hemant_model;
import com.example.day6cw3.repository.Hemant_REPO;

@Service
public class ProductService {
    public Hemant_REPO productRepo;
    public ProductService(Hemant_REPO productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(Hemant_model product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Hemant_model> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<Hemant_model> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public Hemant_model getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
