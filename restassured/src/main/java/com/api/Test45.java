package com.api;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Test45 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/employees.json");

        JsonPath jsonPath = new JsonPath(file);
        int count = jsonPath.getInt("size()");
        System.out.println(count);

        Map<String, Object> map = jsonPath.getMap("$");
        System.out.println(map.keySet());

        int count2 = jsonPath.getInt("data.size()");
        System.out.println(count2);

        int count3 = jsonPath.getInt("data[0].size()");
        System.out.println(count3);

        String string = jsonPath.getString("status");
        System.out.println(string);

        String string2 = jsonPath.getString("message");
        System.out.println(string2);

        String string3 = jsonPath.getString("data[0].employee_name");
        System.out.println(string3);

        List<String> list = jsonPath.getList("data.employee_name");
        System.out.println(list);

        String string4 = jsonPath.getString("data[-1].employee_name");
        System.out.println(string4);

        Map<String, Object> map1 = jsonPath.getMap("data[0]");
        System.out.println(map1);

        List<Map<String, Object>> mapList = jsonPath.getList("data");
        System.out.println(mapList);

        String string5 = jsonPath.getString("data.find{it.id==1}.employee_name");
        System.out.println(string5);

        String string6 = jsonPath.getString("data.find{it.id==1 && it.employee_age==61}.employee_name");
        System.out.println(string6);

        String string7 = jsonPath.getString("data.find{it.id==1 || it.employee_name=='Tiger Nixon'}.employee_salary");
        System.out.println(string7);

        List<String> list1 = jsonPath.getList("data.findAll{it.employee_salary>300000 && it.employee_age>60}.employee_name");
        System.out.println(list1);

        Map<String, Object> map2 = jsonPath.getMap("data.find{it.id==1}");
        System.out.println(map2);

        List<Map<String, Object>> mapList1 = jsonPath.getList("data.findAll{it.employee_salary>300000 && it.employee_age>60}");
        System.out.println(mapList1);
    }
}
