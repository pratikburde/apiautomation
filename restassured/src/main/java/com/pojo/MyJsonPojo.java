package com.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyJsonPojo {
    @JsonProperty("userId")
    private int uid;

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
