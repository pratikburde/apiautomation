package com.api;

import io.restassured.RestAssured;

public class Test7 {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restcountries.com/v3.1/name/india")
                .queryParam("fullText", "true")
                .when()
                .get()
                .then()
                .log()
                .body();
    }
}
