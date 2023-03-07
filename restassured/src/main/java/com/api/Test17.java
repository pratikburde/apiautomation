package com.api;

import io.restassured.RestAssured;
import org.json.JSONObject;

public class Test17 {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "eve.holt@reqres.in");
        jsonObject.put("password", "cityslicka");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .post("https://reqres.in/api/login")
                .then()
                .log()
                .all();

    }
}
