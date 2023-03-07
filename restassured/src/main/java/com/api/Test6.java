package com.api;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name");
        String city = scanner.nextLine();
        scanner.close();

        RestAssured.given()
                .baseUri("http://api.weatherapi.com/v1/current.json")
                .queryParam("key", "e9c3b0195be341c795281747202311")
                .queryParam("q", city)
                .when()
                .get()
                .then()
                .log()
                .body();
    }
}
