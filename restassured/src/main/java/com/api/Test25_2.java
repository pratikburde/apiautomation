package com.api;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Test25_2 {
    public static void main(String[] args) {
        // 2. Authentication using creds to generate bearer token
        File file = new File("src/main/resources/bearerToken.json");

        given().header("Content-Type", "application/json")
                .body(file)
                .post("https://bookstore.toolsqa.com/Account/v1/GenerateToken")
                .then()
                .log()
                .all();
    }
}
