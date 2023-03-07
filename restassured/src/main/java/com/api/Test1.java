package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";

        Response response = RestAssured.get();

        int statusCode = response.getStatusCode();
        String body = response.getBody().asString();

        System.out.println("Code: " + statusCode);
        System.out.println("Body: " + body);
        
    }
   
}
