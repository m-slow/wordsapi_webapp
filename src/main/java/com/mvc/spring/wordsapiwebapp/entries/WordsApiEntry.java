package com.mvc.spring.wordsapiwebapp.entries;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class WordsApiEntry {
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public Syllables getSyllables() {
        return syllables;
    }

    public void setSyllables(Syllables syllables) {
        this.syllables = syllables;
    }

    public Pronunciation getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(Pronunciation pronunciation) {
        this.pronunciation = pronunciation;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("word")
    private String word;
    @JsonProperty("results")
    private ArrayList<Result> results = null;
    @JsonProperty("syllables")
    private Syllables syllables;
    @JsonProperty("pronunciation")
    private Pronunciation pronunciation;
    @JsonProperty("frequency")
    private Double frequency;

    public List<IndividualResult> getAllIndividualResults() {
        List<IndividualResult> individualResults = new ArrayList<>();
        for (Result result : results) {
            IndividualResult individualResult = new IndividualResult();
            individualResult.setWord(word);
            individualResult.setDefinition(result.getDefinition());
            individualResult.setPronunciation(pronunciation.all);
            individualResult.setFrequency(frequency);
            individualResult.setSyllableCount(syllables.count);
            individualResult.setSyllables(syllables.list);
            individualResult.setAlso(result.getAlso());
            individualResult.setAntonyms(result.getAntonyms());
            individualResult.setDerivation(result.getDerivation());
            individualResult.setEntails(result.getEntails());
            individualResult.setExamples(result.getExamples());
            individualResult.setHasCategories(result.getHasCategories());
            individualResult.setHasInstances(result.getHasInstances());
            individualResult.setHasMembers(result.getHasMembers());
            individualResult.setHasParts(result.getHasParts());
            individualResult.setHasSubstances(result.getHasSubstances());
            individualResult.setHasTypes(result.getHasTypes());
            individualResult.setHasUsages(result.getHasUsages());
            individualResult.setInCategory(result.getInCategory());
            individualResult.setInRegion(result.getInRegion());
            individualResult.setInstanceOf(result.getInstanceOf());
            individualResult.setMemberOf(result.getMemberOf());
            individualResult.setPartOf(result.getPartOf());
            individualResult.setPartOfSpeech(result.getPartOfSpeech());
            individualResult.setPertainsTo(result.getPertainsTo());
            individualResult.setRegionOf(result.getRegionOf());
            individualResult.setSimilarTo(result.getSimilarTo());
            individualResult.setSubstanceOf(result.getSubstanceOf());
            individualResult.setSynonyms(result.getSynonyms());
            individualResult.setTypeOf(result.getTypeOf());
            individualResult.setUsageOf(result.getUsageOf());
            individualResult.setVerbGroup(result.getVerbGroup());
            individualResults.add(individualResult);

        }
        return individualResults;
    }

}