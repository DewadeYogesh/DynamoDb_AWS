package com.example.dynamodb.person.springbootWithDynamoDbAws.repo;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.dynamodb.person.springbootWithDynamoDbAws.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepo {

    @Autowired
    private  DynamoDBMapper dynamoDBMapper;
    public Person save(Person person) {

        dynamoDBMapper.save(person);
        return person;


    }
}
