package com.mvc.spring.wordsapiwebapp.entries;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.array.StringArrayType;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "WordsApiResults")
@TypeDefs({ @TypeDef(name = "string-array", typeClass = StringArrayType.class) })
public class IndividualResult {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long individualResultId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	private String word;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")
	private String[] syllables = null;
	private String pronunciation = null;
	@Column
	private Double frequency = null;
	@Column
	private int syllableCount;

	public int getSyllableCount() {
		return syllableCount;
	}

	public void setSyllableCount(int syllableCount) {
		this.syllableCount = syllableCount;
	}
	private String definition = null;
	@Column
	private String partOfSpeech = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] synonyms = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] antonyms = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] instanceOf = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")
	private String[] partOf = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")
	private String[] typeOf = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] hasInstances = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")
	private String[] hasParts = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] hasTypes = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] substanceOf = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] hasSubstances = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] verbGroup = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] derivation = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] similarTo = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] memberOf = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] hasMembers = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] examples = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] entails = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] also = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] inCategory = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] hasCategories = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] usageOf = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] hasUsages = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] inRegion = null;
	@Column(columnDefinition = "text[]")
	@Type(type = "string-array")

	private String[] regionOf = null;
	@Column(columnDefinition = "text[]")

	@Type(type = "string-array")

	private String[] pertainsTo = null;

	public IndividualResult() {
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String[] getSyllables() {
		return syllables;
	}

	public void setSyllables(String[] syllables) {
		this.syllables = syllables;
	}

	public String getPronunciation() {
		return pronunciation;
	}

	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}

	public Double getFrequency() {
		return frequency;
	}

	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}

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
