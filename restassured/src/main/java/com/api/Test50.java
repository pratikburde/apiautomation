package com.api;

import com.pojo.MyJsonPojo1;
import com.pojo.MyJsonPojo2;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Test50 {
    public static void main(String[] args) {
        MyJsonPojo1 myJsonPojo1 = new MyJsonPojo1("APIAutomationUser", "Automation@123");

        Response response = given().baseUri("https://bookstore.toolsqa.com/Account/v1/GenerateToken")
                .header("Content-Type", "application/json")
                .body(myJsonPojo1)
                .post();
        System.out.println(response.asPrettyString());

        MyJsonPojo2 myJsonPojo2 = response.jsonPath().getObject("$", MyJsonPojo2.class);
        System.out.println(myJsonPojo2.getToken());
        System.out.println(myJsonPojo2.getExpires());
        System.out.println(myJsonPojo2.getResult());
        System.out.println(myJsonPojo2.getStatus());
    }
}
