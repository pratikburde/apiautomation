package com.api;

import io.restassured.RestAssured;

public class Test23 {
    public static void main(String[] args) {
        RestAssured.given()
                .auth()
                .digest("admin", "admin")
                .get("https://the-internet.herokuapp.com/basic_auth")
                .then()
                .log()
                .all();
    }
}
