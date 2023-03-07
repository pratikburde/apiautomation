package com.api;

import io.restassured.RestAssured;
import org.json.JSONObject;

public class Test18 {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Kalam");
        jsonObject.put("job", "President");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .put("https://reqres.in/api/users/200")
                .then()
                .log()
                .all();
    }
}
