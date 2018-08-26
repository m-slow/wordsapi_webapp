package com.mvc.spring.wordsapiwebapp.entries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Syllables {
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("list")
    private String[] list = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }
}
