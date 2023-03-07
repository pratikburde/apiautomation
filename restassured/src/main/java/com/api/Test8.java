package com.api;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path parameter value");
        String country = scanner.nextLine();
        System.out.println("Enter query parameter as true or false");
        String option = scanner.nextLine();
        scanner.close();
        RestAssured.given()
                .baseUri("https://restcountries.com/v3.1/name")
                .basePath(country)
                .queryParam("fulltext", option)
                .when()
                .get()
                .then()
                .log()
                .body();
    }
}
