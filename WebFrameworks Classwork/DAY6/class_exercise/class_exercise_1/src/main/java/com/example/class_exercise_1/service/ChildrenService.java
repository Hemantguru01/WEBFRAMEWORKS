package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.Hemant_model;
import com.example.class_exercise_1.repository.Hemant_REPO;

@Service
public class ChildrenService {

     @Autowired
     public Hemant_REPO childrenRepo;

     public List<Hemant_model> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public Hemant_model save(Hemant_model children) {
          return childrenRepo.save(children);

     }

     public List<Hemant_model> sortedPage(int offset, int pagesize, String field) {
          Page<Hemant_model> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<Hemant_model> pagination(int offset, int pagesize) {
          Page<Hemant_model> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
