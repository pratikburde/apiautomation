package com.api;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Test42{
    public static void main(String[] args) {
        Response response = given().get("https://restcountries.com/v3.1/all");
        System.out.println(response.getBody().jsonPath().getString("[0]"));

        int jsonObjCount = response.getBody()
                .jsonPath()
                .getInt("$.size()");
        System.out.println(jsonObjCount);

        int entryCountInFirstJsonObj = response.getBody()
                .jsonPath()
                .getInt("[0].size()");
        System.out.println(entryCountInFirstJsonObj);

        int count3 = response.getBody()
                .jsonPath()
                .getInt("[0].name.size()");
        System.out.println(count3);

        int count4 = response.getBody()
                .jsonPath()
                .getInt("[0].name.nativeName.size()");
        System.out.println(count4);

        String string1 = response.getBody()
                .jsonPath()
                .getString("[0].name.official");
        System.out.println(string1);

        List<String> list1 = response.getBody()
                .jsonPath()
                .getList("[0].capital");
        System.out.println(list1);

        Map<String, Object> map1 = response.getBody()
                .jsonPath()
                .getMap("[0].currencies.BGN");
        System.out.println(map1);

        Map<String, Map<String, Object>> map2 = response.getBody()
                .jsonPath()
                .getMap("[0].name.nativeName");
        System.out.println(map2);
    }
}
