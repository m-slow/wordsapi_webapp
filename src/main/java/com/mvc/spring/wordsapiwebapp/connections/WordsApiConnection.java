package com.mvc.spring.wordsapiwebapp.connections;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mvc.spring.wordsapiwebapp.entries.WordsApiEntry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WordsApiConnection implements ApiConnection {
    private static WordsApiConnection wordsApiConnection;
    private String urlModel = "https://wordsapiv1.p.mashape.com/words/";
    private HttpResponse<JsonNode> currentResponse;
    private String currentStringResponse;
    private WordsApiEntry currentJavaObject;

    private WordsApiConnection() {
    }

    public static synchronized WordsApiConnection getInstance() {
        if (wordsApiConnection == null) {
            wordsApiConnection = new WordsApiConnection();
        }
        return wordsApiConnection;
    }

    public HttpResponse<JsonNode> getCurrentResponse() {
        return currentResponse;
    }

    public String getCurrentStringResponse() {
        return currentStringResponse;
    }

    public WordsApiEntry getCurrentJavaObject() {
        return currentJavaObject;
    }

    public void receiveResponseFromServer(String word) {
        try {
            currentResponse = Unirest.get(urlModel.concat(word))
                    .header("X-Mashape-Key", "put key here")
                    .header("Accept", "application/json").asJson();
        } catch (UnirestException e) {
            System.out.println("ERROR: " + e.getLocalizedMessage());
        }
    }

    public void turnHttpResponseIntoString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (currentResponse != null) {
            InputStream inputStream = currentResponse.getRawBody();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                }
            } catch (IOException ioe) {
                System.out.println("ERROR " + ioe.getLocalizedMessage());
            }
        }
        currentStringResponse = stringBuilder.toString();
    }

    public void createJavaObjectFromStringResponse() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            currentJavaObject = objectMapper.readValue(currentStringResponse, WordsApiEntry.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}