package com.mvc.spring.wordsapiwebapp.entries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Result {

    @JsonProperty("definition")
    private String definition;
    @JsonProperty("partOfSpeech")
    private String partOfSpeech;
    @JsonProperty("synonyms")
    private String[] synonyms = null;
    @JsonProperty("antonyms")
    private String[] antonyms = null;
    @JsonProperty("instanceOf")
    private String[] instanceOf = null;
    @JsonProperty("partOf")
    private String[] partOf = null;
    @JsonProperty("typeOf")
    private String[] typeOf = null;
    @JsonProperty("hasInstances")
    private String[] hasInstances = null;
    @JsonProperty("hasParts")
    private String[] hasParts = null;
    @JsonProperty("hasTypes")
    private String[] hasTypes = null;
    @JsonProperty("subtanceOf")
    private String[] substanceOf = null;
    @JsonProperty("hasSubstances")
    private String[] hasSubstances = null;
    @JsonProperty("verbGroup")
    private String[] verbGroup = null;
    @JsonProperty("derivation")
    private String[] derivation = null;
    @JsonProperty("similarTo")
    private String[] similarTo = null;
    @JsonProperty("memberOf")
    private String[] memberOf = null;
    @JsonProperty("hasMembers")
    private String[] hasMembers = null;
    @JsonProperty("examples")
    private String[] examples = null;
    @JsonProperty("entails")
    private String[] entails = null;
    @JsonProperty("also")
    private String[] also = null;
    @JsonProperty("inCategory")
    private String[] inCategory = null;
    @JsonProperty("hasCategories")
    private String[] hasCategories = null;
    @JsonProperty("usageOf")
    private String[] usageOf = null;
    @JsonProperty("hasUsages")
    private String[] hasUsages = null;
    @JsonProperty("inRegion")
    private String[] inRegion = null;
    @JsonProperty("regionOf")
    private String[] regionOf = null;
    @JsonProperty("pertainsTo")
    private String[] pertainsTo = null;


    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String[] getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String[] synonyms) {
        this.synonyms = synonyms;
    }

    public String[] getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(String[] antonyms) {
        this.antonyms = antonyms;
    }

    public String[] getInstanceOf() {
        return instanceOf;
    }

    public void setInstanceOf(String[] instanceOf) {
        this.instanceOf = instanceOf;
    }

    public String[] getPartOf() {
        return partOf;
    }

    public void setPartOf(String[] partOf) {
        this.partOf = partOf;
    }

    public String[] getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String[] typeOf) {
        this.typeOf = typeOf;
    }

    public String[] getHasInstances() {
        return hasInstances;
    }

    public void setHasInstances(String[] hasInstances) {
        this.hasInstances = hasInstances;
    }

    public String[] getHasParts() {
        return hasParts;
    }

    public void setHasParts(String[] hasParts) {
        this.hasParts = hasParts;
    }

    public String[] getHasTypes() {
        return hasTypes;
    }

    public void setHasTypes(String[] hasTypes) {
        this.hasTypes = hasTypes;
    }

    public String[] getSubstanceOf() {
        return substanceOf;
    }

    public void setSubstanceOf(String[] substanceOf) {
        this.substanceOf = substanceOf;
    }

    public String[] getHasSubstances() {
        return hasSubstances;
    }

    public void setHasSubstances(String[] hasSubstances) {
        this.hasSubstances = hasSubstances;
    }

    public String[] getVerbGroup() {
        return verbGroup;
    }

    public void setVerbGroup(String[] verbGroup) {
        this.verbGroup = verbGroup;
    }

    public String[] getDerivation() {
        return derivation;
    }

    public void setDerivation(String[] derivation) {
        this.derivation = derivation;
    }

    public String[] getSimilarTo() {
        return similarTo;
    }

    public void setSimilarTo(String[] similarTo) {
        this.similarTo = similarTo;
    }

    public String[] getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(String[] memberOf) {
        this.memberOf = memberOf;
    }

    public String[] getHasMembers() {
        return hasMembers;
    }

    public void setHasMembers(String[] hasMembers) {
        this.hasMembers = hasMembers;
    }

    public String[] getExamples() {
        return examples;
    }

    public void setExamples(String[] examples) {
        this.examples = examples;
    }

    public String[] getEntails() {
        return entails;
    }

    public void setEntails(String[] entails) {
        this.entails = entails;
    }

    public String[] getAlso() {
        return also;
    }

    public void setAlso(String[] also) {
        this.also = also;
    }

    public String[] getInCategory() {
        return inCategory;
    }

    public void setInCategory(String[] inCategory) {
        this.inCategory = inCategory;
    }

    public String[] getHasCategories() {
        return hasCategories;
    }

    public void setHasCategories(String[] hasCategories) {
        this.hasCategories = hasCategories;
    }

    public String[] getUsageOf() {
        return usageOf;
    }

    public void setUsageOf(String[] usageOf) {
        this.usageOf = usageOf;
    }

    public String[] getHasUsages() {
        return hasUsages;
    }

    public void setHasUsages(String[] hasUsages) {
        this.hasUsages = hasUsages;
    }

    public String[] getInRegion() {
        return inRegion;
    }

    public void setInRegion(String[] inRegion) {
        this.inRegion = inRegion;
    }

    public String[] getRegionOf() {
        return regionOf;
    }

    public void setRegionOf(String[] regionOf) {
        this.regionOf = regionOf;
    }

    public String[] getPertainsTo() {
        return pertainsTo;
    }

    public void setPertainsTo(String[] pertainsTo) {
        this.pertainsTo = pertainsTo;
    }
}