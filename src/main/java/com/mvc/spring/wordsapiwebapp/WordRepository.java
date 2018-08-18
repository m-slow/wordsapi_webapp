package com.mvc.spring.wordsapiwebapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.spring.wordsapiwebapp.entries.IndividualResult;

@Transactional
public interface WordRepository extends CrudRepository<IndividualResult, Long> {
    public IndividualResult findByWord(String word);
}
