package com.example.dynamodb.person.springbootWithDynamoDbAws.controller;


import com.example.dynamodb.person.springbootWithDynamoDbAws.entity.Person;
import com.example.dynamodb.person.springbootWithDynamoDbAws.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepo personRepo;

    @PostMapping("/personAdd")
    public Person savePerson(@RequestBody Person person){

        return  personRepo.save(person);
    }




}
