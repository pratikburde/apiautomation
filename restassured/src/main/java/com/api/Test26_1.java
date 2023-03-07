package com.api;

import static io.restassured.RestAssured.given;

public class Test26_1 {
    public static void main(String[] args) {
        String cityName = "Nagpur",
                apiKey = "88d86becba034ed09f2142525221710";

        given().queryParam("key", apiKey)
                .queryParam("q", cityName)
                .get("https://api.weatherapi.com/v1/current.json")
                .then()
                .log()
                .all();
    }
}
