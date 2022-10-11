package com.SEPTChallenge2.Person.controller;
import java.net.URI;

import com.SEPTChallenge2.Person.model.Person;
import com.SEPTChallenge2.Person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/teacher/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable("id") long id) {
        try {
            //check if teacher exist in database
            Person perObj = getPerRec(id);

            if (perObj != null) {
                return new ResponseEntity<>(perObj, HttpStatus.OK);
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    private Person getPerRec(long id) {
        Optional<Person> perObj = personRepository.findById(id);

        if (perObj.isPresent()) {
            return perObj.get();
        }
        return null;
    }




}
