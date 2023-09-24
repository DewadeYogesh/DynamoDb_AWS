package com.example.dynamodb.person.springbootWithDynamoDbAws.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PersonConfiDynamoDB {


    @Bean
    public DynamoDBMapper dynamoDBMapper(){
          return  new DynamoDBMapper(buildAmazonDynamoDb());

    }

    private AmazonDynamoDB buildAmazonDynamoDb() {
        return AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(

                new AwsClientBuilder.EndpointConfiguration("dynamodb.ap-south-1.amazonaws.com","ap-south-1")
        ).withCredentials(

                new AWSStaticCredentialsProvider(
                        new BasicAWSCredentials(" AKIA2LAXUN7PXEWYTC62","8E/odHUsbmJLRnjtlfd6m5meiB/En7ZAeKwwN+Bs")
                )
        ).build();
    }
}
