package com.mvc.spring.wordsapiwebapp.entries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Syllables {
    @JsonProperty("count")
    public Integer count;
    @JsonProperty("list")
    public String[] list = null;
}
