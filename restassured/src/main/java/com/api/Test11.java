package com.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;

import java.util.HashMap;

public class Test11 {
    public static void main(String[] args) throws JsonProcessingException {
        // Way-2: JSON String value as request body

        String s = "{\n" +
                "  \"userId\": 10,\n" +
                "  \"title\": \"Wishes\",\n" +
                "  \"body\": \"Happy Birthday, Rest Assured\"\n" +
                "}";

        HashMap<String, Object> map = new ObjectMapper().readValue(s, HashMap.class);
        map.put("userId", 1001);

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(map)
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .log()
                .all();
    }
}
