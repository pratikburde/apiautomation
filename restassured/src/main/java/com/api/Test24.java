package com.api;

import io.restassured.authentication.FormAuthConfig;

import static io.restassured.RestAssured.given;

public class Test24 {
    public static void main(String[] args) {
        FormAuthConfig formAuthConfig = new FormAuthConfig("index.php", "uid", "password");

        given().auth()
                .form("mngr356676", "devUpav", formAuthConfig)
                .post("http://demo.guru99.com/V1/index.php")
                .then()
                .log()
                .all();
    }
}
