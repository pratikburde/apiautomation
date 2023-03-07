package com.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyJsonPojo2 {
    @JsonProperty("expires")
    public String expires;
    @JsonProperty("status")
    public String status;
    @JsonProperty("result")
    public String result;
    @JsonProperty("token")
    private String token;

    public String getToken() {
        return token;
    }

    public String getExpires() {
        return expires;
    }

    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }
}
