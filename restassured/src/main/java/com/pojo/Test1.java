package com.pojo;

import io.restassured.path.json.JsonPath;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/jsonPayload.json");
        JsonPath jsonPath = new JsonPath(file);

        MyMainPojo myMainPojo = jsonPath.getObject("$", MyMainPojo.class);
        System.out.println(myMainPojo.getData1());
        System.out.println(myMainPojo.getData2());
        System.out.println(myMainPojo.getData3().getAge());
        System.out.println(myMainPojo.getData3().getName());
        System.out.println(myMainPojo.getData4().get(1).getHeight());
        System.out.println(myMainPojo.getData4().get(0).getName());
        System.out.println(myMainPojo.getData5().getEng().getOfficial());
        System.out.println(myMainPojo.getData5().getMsa().getCars());
    }
}
