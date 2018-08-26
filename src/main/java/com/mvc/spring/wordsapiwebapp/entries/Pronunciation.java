package com.mvc.spring.wordsapiwebapp.entries;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Pronunciation {
    @JsonProperty("all")
    private String all;

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }
}