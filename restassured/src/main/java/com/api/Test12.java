package com.api;

import io.restassured.RestAssured;
import org.json.JSONObject;

public class Test12 {
    public static void main(String[] args) {
        // Way-3: Using JSONObject

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userId", 2001);
        jsonObject.put("title", "JSONObject Title");
        jsonObject.put("body","Body of JSONObject");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .log()
                .all();
    }
}
