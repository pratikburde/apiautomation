package com.api;

import io.restassured.RestAssured;

public class Test21 {
    public static void main(String[] args) {
        RestAssured.given()
                .auth()
                .basic("admin", "admin")
                .get("https://the-internet.herokuapp.com/basic_auth")
                .then()
                .log()
                .all();
    }
}
