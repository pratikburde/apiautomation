package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data1", "data2", "data3", "data4", "data5"})
@Generated("jsonschema2pojo")
public class MyMainPojo {

    @JsonProperty("data1")
    private String data1;
    @JsonProperty("data2")
    private List<String> data2 = null;
    @JsonProperty("data3")
    private Data3 data3;
    @JsonProperty("data4")
    private List<Data4> data4 = null;
    @JsonProperty("data5")
    private Data5 data5;

    /**
     * No args constructor for use in serialization
     */
    public MyMainPojo() {
    }

    /**
     * @param data5
     * @param data4
     * @param data3
     * @param data2
     * @param data1
     */
    public MyMainPojo(String data1, List<String> data2, Data3 data3, List<Data4> data4, Data5 data5) {
        super();
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
    }

    @JsonProperty("data1")
    public String getData1() {
        return data1;
    }

    @JsonProperty("data1")
    public void setData1(String data1) {
        this.data1 = data1;
    }

    @JsonProperty("data2")
    public List<String> getData2() {
        return data2;
    }

    @JsonProperty("data2")
    public void setData2(List<String> data2) {
        this.data2 = data2;
    }

    @JsonProperty("data3")
    public Data3 getData3() {
        return data3;
    }

    @JsonProperty("data3")
    public void setData3(Data3 data3) {
        this.data3 = data3;
    }

    @JsonProperty("data4")
    public List<Data4> getData4() {
        return data4;
    }

    @JsonProperty("data4")
    public void setData4(List<Data4> data4) {
        this.data4 = data4;
    }

    @JsonProperty("data5")
    public Data5 getData5() {
        return data5;
    }

    @JsonProperty("data5")
    public void setData5(Data5 data5) {
        this.data5 = data5;
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "age"})
@Generated("jsonschema2pojo")
class Data3 {

    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private String age;

    /**
     * No args constructor for use in serialization
     */
    public Data3() {
    }

    /**
     * @param name
     * @param age
     */
    public Data3(String name, String age) {
        super();
        this.name = name;
        this.age = age;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "age", "height"})
@Generated("jsonschema2pojo")
class Data4 {

    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private String age;
    @JsonProperty("height")
    private Integer height;

    /**
     * No args constructor for use in serialization
     */
    public Data4() {
    }

    /**
     * @param name
     * @param age
     * @param height
     */
    public Data4(String name, String age, Integer height) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"official", "common"})
@Generated("jsonschema2pojo")
class Eng {

    @JsonProperty("official")
    private String official;
    @JsonProperty("common")
    private Object common;

    /**
     * No args constructor for use in serialization
     */
    public Eng() {
    }

    /**
     * @param common
     * @param official
     */
    public Eng(String official, Object common) {
        super();
        this.official = official;
        this.common = common;
    }

    @JsonProperty("official")
    public String getOfficial() {
        return official;
    }

    @JsonProperty("official")
    public void setOfficial(String official) {
        this.official = official;
    }

    @JsonProperty("common")
    public Object getCommon() {
        return common;
    }

    @JsonProperty("common")
    public void setCommon(Object common) {
        this.common = common;
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"cars", "ITR"})
@Generated("jsonschema2pojo")
class Msa {

    @JsonProperty("cars")
    private List<String> cars = null;
    @JsonProperty("ITR")
    private Boolean itr;

    /**
     * No args constructor for use in serialization
     */
    public Msa() {
    }

    /**
     * @param cars
     * @param itr
     */
    public Msa(List<String> cars, Boolean itr) {
        super();
        this.cars = cars;
        this.itr = itr;
    }

    @JsonProperty("cars")
    public List<String> getCars() {
        return cars;
    }

    @JsonProperty("cars")
    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    @JsonProperty("ITR")
    public Boolean getItr() {
        return itr;
    }

    @JsonProperty("ITR")
    public void setItr(Boolean itr) {
        this.itr = itr;
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"eng", "msa"})
@Generated("jsonschema2pojo")
class Data5 {

    @JsonProperty("eng")
    private Eng eng;
    @JsonProperty("msa")
    private Msa msa;

    /**
     * No args constructor for use in serialization
     */
    public Data5() {
    }

    /**
     * @param msa
     * @param eng
     */
    public Data5(Eng eng, Msa msa) {
        super();
        this.eng = eng;
        this.msa = msa;
    }

    @JsonProperty("eng")
    public Eng getEng() {
        return eng;
    }

    @JsonProperty("eng")
    public void setEng(Eng eng) {
        this.eng = eng;
    }

    @JsonProperty("msa")
    public Msa getMsa() {
        return msa;
    }

    @JsonProperty("msa")
    public void setMsa(Msa msa) {
        this.msa = msa;
    }

}