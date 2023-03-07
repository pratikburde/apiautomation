package com.api;

import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

public class Test46 {
    public static void main(String[] args) {
        String cityName = "Nagpur",
                apiKey = "88d86becba034ed09f2142525221710",
                condition = "all_valid";

        if (condition.equalsIgnoreCase("all_valid")) {
            given()
                    .log().all().baseUri("https://api.weatherapi.com/v1/current.json").queryParam("key", apiKey)
                    .queryParam("q", cityName)
                    .when()
                    .get()
                    .then()
                    .log().all()
                    .statusCode(200)
                    .header("Content-Type", Matchers.containsStringIgnoringCase("json"))
                    .body("location.name", Matchers.containsStringIgnoringCase(cityName));
        } else if (condition.equalsIgnoreCase("key_invalid") ||
                condition.equalsIgnoreCase("key_blank")) {
            given()
                    .log().all()
                    .baseUri("https://api.weatherapi.com/v1/current.json")
                    .queryParam("key", apiKey)
                    .queryParam("q", cityName)
                    .when()
                    .get()
                    .then()
                    .log().all()
                    .statusCode(401)
                    .header("Content-Type",
                            Matchers.containsStringIgnoringCase("json")).body("error.message",
                            Matchers.containsString("API key is invalid"));
        } else if (condition.equalsIgnoreCase("q_invalid")) {
            given()
                    .log().all()
                    .baseUri("https://api.weatherapi.com/v1/current.json")
                    .queryParam("key", apiKey)
                    .queryParam("q", cityName)
                    .when()
                    .get()
                    .then()
                    .log().all()
                    .statusCode(400)
                    .header("Content-Type",
                            Matchers.containsStringIgnoringCase("json")).body("error.message",
                            Matchers.containsString("No matching location found"));
        } else if (condition.equalsIgnoreCase("q_blank")) {
            given().log().all()
                    .baseUri("https://api.weatherapi.com/v1/current.json")
                    .queryParam("key", apiKey)
                    .queryParam("q", cityName)
                    .when()
                    .get()
                    .then()
                    .log().all()
                    .statusCode(400)
                    .header("Content-Type", Matchers.containsStringIgnoringCase("json"))
                    .body("error.message", Matchers.containsString("Parameter q is missing"));
        } else {
            System.out.println("Cross check API document");
        }
    }
}

