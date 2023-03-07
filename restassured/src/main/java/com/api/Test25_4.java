package com.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Test25_4 {
    public static void main(String[] args) throws IOException {
        // Delete
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
        HashMap<String, Object> map = new ObjectMapper().readValue(file2, HashMap.class);

        given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .queryParam("UserId", map.get("userId").toString())
                .delete("https://bookstore.toolsqa.com/BookStore/v1/Books")
                .then()
                .log()
                .all();
    }
}
