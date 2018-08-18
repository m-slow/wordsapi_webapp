package com.mvc.spring.wordsapiwebapp.connections;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mvc.spring.wordsapiwebapp.entries.IndividualResult;
import com.mvc.spring.wordsapiwebapp.entries.WordsApiEntry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WordsApiConnection implements ApiConnection {
    private static WordsApiConnection wordsApiConnection;
    private String urlModel = "https://wordsapiv1.p.mashape.com/words/";

    private WordsApiConnection() {
    }

    public static WordsApiEntry createJavaObject(String responseString) {
        ObjectMapper objectMapper = new ObjectMapper();
        WordsApiEntry wordsApiEntryJava = null;
        try {
            wordsApiEntryJava = objectMapper.readValue(responseString, WordsApiEntry.class);
            return wordsApiEntryJava;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsApiEntryJava;
    }

    public static WordsApiConnection getInstance() {
        if (wordsApiConnection == null) {
            wordsApiConnection = new WordsApiConnection();
        }
        return wordsApiConnection;
    }

    public String lookUpWord(String word) {
        HttpResponse<JsonNode> response = null;
        try {
            response = Unirest.get(urlModel.concat(word))
                    .header("X-Mashape-Key", "add key here")
                    .header("Accept", "application/json")
                    .asJson();
        } catch (UnirestException e) {
            System.out.println("ERROR: " + e.getLocalizedMessage());
        }
        InputStream inputStream = null;
        if (response != null) {
            inputStream = response.getRawBody();
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException ioe) {
            System.out.println("ERROR " + ioe.getLocalizedMessage());
        }
        return stringBuilder.toString();
    }
}