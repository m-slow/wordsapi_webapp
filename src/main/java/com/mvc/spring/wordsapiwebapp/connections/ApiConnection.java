package com.mvc.spring.wordsapiwebapp.connections;

public interface ApiConnection {
    void receiveResponseFromServer(String word);
}