package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.HemantPerson;
import com.example.springapp.service.HemantPersonService;

@RestController
public class HemantPersonController {
    @Autowired
    private HemantPersonService ser;

    @PostMapping("/person")
    public ResponseEntity<HemantPerson> post(@RequestBody HemantPerson person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/findByLastnameNot")
    public ResponseEntity<List<HemantPerson>> getAll(@RequestParam String lastname) {
        List<HemantPerson> li = ser.start(lastname);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/person/findByAgeNotIn")
    public ResponseEntity<List<HemantPerson>> getbyAge(@RequestParam List<Integer> ages) {
        List<HemantPerson> li = ser.end(ages);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
