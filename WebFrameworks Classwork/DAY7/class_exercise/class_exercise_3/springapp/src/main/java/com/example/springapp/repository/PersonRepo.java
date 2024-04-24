package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.HemantPerson;
import java.util.List;


@Repository
public interface PersonRepo extends JpaRepository<HemantPerson,Integer>{

    List<HemantPerson> findByNameStartingWith(String name);
    List<HemantPerson
}
