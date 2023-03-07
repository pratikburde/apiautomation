package com.api;

import io.restassured.RestAssured;

public class Test3 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method1() {
        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts/100")
                .when()
                .get()
                .then()
                .log()
                .ifStatusCodeIsEqualTo(200);
    }

    private static void method2() {
        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .when()
                .get("100")
                .then()
                .log()
                .ifStatusCodeIsEqualTo(200);
    }

    private static void method3(){
        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .queryParam("id", 100)
                .when()
                .get()
                .then()
                .log()
                .ifStatusCodeIsEqualTo(200);
    }
}