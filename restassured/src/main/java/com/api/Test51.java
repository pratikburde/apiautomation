package com.api;

import com.pojo.MyJsonPojo3;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Test51 {
    public static void main(String[] args) {
        MyJsonPojo3 myJsonPojo3 = new MyJsonPojo3();
        myJsonPojo3.setUserId(1001);
        myJsonPojo3.setTitle("Wishes");
        myJsonPojo3.setBody("Happy Birthday Jackson!");

        Response response = given().baseUri("https://jsonplaceholder.typicode.com/posts")
                .header("Content-Type", "application/json")
                .body(myJsonPojo3)
                .post();

        MyJsonPojo3 myJsonPojo31 = response.jsonPath().getObject("$", MyJsonPojo3.class);
        System.out.println(myJsonPojo31.getUserId());
        System.out.println(myJsonPojo31.getTitle());
        System.out.println(myJsonPojo31.getBody());
        System.out.println(myJsonPojo31.getId());
    }
}
