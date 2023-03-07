package com.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test10 {
    public static void main(String[] args) throws IOException {
        // Way-1: JSON file

        File file = new File("src/main/resources/myData.json");

        Map<String, Object> objectMap = new ObjectMapper().readValue(file, HashMap.class);

        JSONObject jsonObject = new JSONObject(objectMap);
        jsonObject.put("title", "Changed Title");

        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts")
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .when()
                .post()
                .then()
                .log()
                .all();
    }
}
