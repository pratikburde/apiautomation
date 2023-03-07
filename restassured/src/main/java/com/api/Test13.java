package com.api;

import com.pojo.MyJsonPojo;
import io.restassured.RestAssured;

public class Test13 {
    public static void main(String[] args) {
        // Way-4: Using POJO class

        MyJsonPojo myJsonPojo = new MyJsonPojo();
        myJsonPojo.setUid(3001);
        myJsonPojo.setTitle("Pojo Title");
        myJsonPojo.setBody("Pojo Body");

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(myJsonPojo)
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .log()
                .all();
    }
}
