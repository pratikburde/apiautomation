package com.api;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Test44 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/jsonPayload.json");

        JsonPath jsonPath = new JsonPath(file);
        String obj = jsonPath.getString("data1");
        System.out.println(obj);

        List<String> list = jsonPath.getList("data2");
        System.out.println(list);

        Map<String, Object> map = jsonPath.getMap("data3");
        System.out.println(map);

        List<Map<String, Object>> mapList = jsonPath.getList("data4");
        System.out.println(mapList);

        Map<String, Map<String, Object>> mapMap = jsonPath.getMap("data5");
        System.out.println(mapMap);
    }
}
