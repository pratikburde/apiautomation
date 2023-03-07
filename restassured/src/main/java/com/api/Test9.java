package com.api;

import io.restassured.RestAssured;

public class Test9 {

    public static void main(String[] args) throws InterruptedException {
        RestAssured.urlEncodingEnabled = false;
        RestAssured.given().baseUri("https://petstore.swagger.io/v2/pet/findByStatus;matrixParm=test")
                .queryParam("offset", "0")
                .queryParam("pageSize", "20")
                .when()
                .get()
                .then()
                .log()
                .all();

    }

}
