package com.mvc.spring.wordsapiwebapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mvc.spring.wordsapiwebapp.entries.IndividualResult;

import java.util.ArrayList;

@Repository
public interface WordRepository extends CrudRepository<IndividualResult, Long> {
    public ArrayList<IndividualResult> findByWord(String word);
}
