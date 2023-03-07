package com.api;

import io.restassured.RestAssured;

public class Test5 {
    public static void main(String[] args) {
        RestAssured.given().baseUri("https://www.google.com/search")
                .queryParam("q", "srh vs dc")
                .when()
                .get()
                .then()
                .log()
                .body();
    }
}
