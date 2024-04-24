package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.GUNESHWAR_model;

@Repository
public interface Hemant_repo extends JpaRepository<Hemant_model, Integer> {

    public List<Hemant_model> findByProductCategory(String productCategory);
    public List<Hemant_model> findByPriceCategory(String priceCategory);

}
