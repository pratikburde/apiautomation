package com.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyJsonPojo1 {
    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;

    public MyJsonPojo1(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
