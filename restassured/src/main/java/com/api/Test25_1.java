package com.api;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Test25_1 {
    public static void main(String[] args) {
        // 1. create user
        File file = new File("src/main/resources/bearerToken.json");

        given().header("Content-Type", "application/json")
                .body(file)
                .post("https://bookstore.toolsqa.com/Account/v1/User")
                .then()
                .log()
                .all();

        //{
        //    "userID": "c688461b-cbe1-46e8-9242-16527da29d59",
        //    "username": "APIAutomationUser",
        //    "books": [
        //
        //    ]
        //}
    }
}
