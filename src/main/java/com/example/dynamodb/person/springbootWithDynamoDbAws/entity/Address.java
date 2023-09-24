package com.example.dynamodb.person.springbootWithDynamoDbAws.entity;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBDocument
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
     @DynamoDBAttribute
    private  String cityName;
    @DynamoDBAttribute
    private  String countryname;
}
