package com.api;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path parameter value");
        String id = scanner.nextLine();
        scanner.close();

        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts/"+id)
                .when()
                .get()
                .then()
                .log()
                .ifStatusCodeIsEqualTo(200);

    }
}

