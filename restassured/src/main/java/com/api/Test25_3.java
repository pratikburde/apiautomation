package com.api;

import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Test25_3 {
    public static void main(String[] args) {
        // Create
        // 1. Authentication
        File file = new File("src/main/resources/bearerToken.json");

        Response response =
                given().header("Content-Type", "application/json")
                        .body(file)
                        .post("https://bookstore.toolsqa.com/Account/v1/GenerateToken");

        String token = response.getBody().jsonPath().getString("token");
        System.out.println(token);

        // 2. use token to get authorization for other resources
        File file2 = new File("src/main/resources/book.json");

        given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(file2)
                .post("https://bookstore.toolsqa.com/BookStore/v1/Books")
                .then()
                .log()
                .all();
    }
}
