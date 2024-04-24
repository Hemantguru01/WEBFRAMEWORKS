package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.Hemant_model;
import com.examly.springapp.service.GUNESHWAR_ser;

@RestController
public class Hemant_controller {
    @Autowired
    Hemant_ser service;

    @PostMapping("/api/Product")
    public ResponseEntity<Hemant_model> postMethod(@RequestBody Hemant_model s) {
        if (service.post(s)) {
            return new ResponseEntity<Hemant_model>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<Hemant_model>> dndcjk() {
        List<Hemant_model> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<Hemant_model>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<Hemant_model>> getbyid(@PathVariable String productCategory) {
        List<Hemant_model> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<Hemant_model>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<Hemant_model>> getbdyid(@PathVariable String priceCategory) {
        List<Hemant_model> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<Hemant_model>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
