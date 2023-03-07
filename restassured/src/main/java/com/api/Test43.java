package com.api;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Test43 {
    public static void main(String[] args) {
        Response response = given().get("https://jsonplaceholder.typicode.com/posts");
        System.out.println(response.asPrettyString());

        List<Map<String, Object>> lm = response.jsonPath()
                .getList("$");
        System.out.println(lm);
    }
}
