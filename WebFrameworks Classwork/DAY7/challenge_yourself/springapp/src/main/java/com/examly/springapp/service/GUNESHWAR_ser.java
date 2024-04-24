package com.examly.springapp.service;

import com.examly.springapp.model.GUNESHWAR_model;
import com.examly.springapp.repository.GUNESHWAR_repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class GUNESHWAR_ser {
    @Autowired
    GUNESHWAR_repo repo;

    @SuppressWarnings("null")
    public boolean post(GUNESHWAR_model c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<GUNESHWAR_model> getAll() {
        return repo.findAll();

    }

    public List<GUNESHWAR_model> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<GUNESHWAR_model> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}
