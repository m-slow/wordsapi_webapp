package com.mvc.spring.wordsapiwebapp;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.mvc.spring.wordsapiwebapp.connections.WordsApiConnection;
import com.mvc.spring.wordsapiwebapp.entries.IndividualResult;
import com.mvc.spring.wordsapiwebapp.entries.WordsApiEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller
public class MainController {
	@Autowired
	WordRepository wordRepository;

	List<IndividualResult> results;

	@GetMapping(value = "/")
	public String main() {
		return "index";
	}

	@GetMapping(value = "/lookup")
	public String lookUpWord(@RequestParam(value = "word", required = true) String word, Model model)
			throws IOException, UnirestException {
		WordsApiConnection connection = WordsApiConnection.getInstance();
		connection.receiveResponseFromServer(word);
		connection.turnHttpResponseIntoString();
		connection.createJavaObjectFromStringResponse();
		WordsApiEntry current = connection.getCurrentJavaObject();
		try {
			results = current.getAllIndividualResults();
		} catch (NullPointerException npe) {
			return "noResults";
		}
		model.addAttribute("results", results);
		return "lookup";
	}

	@GetMapping(value = "/searchdb")
	public String findInDb(@RequestParam(value = "word", required = true) String word, Model model) {
		results = wordRepository.findByWord(word);
		if (results.isEmpty()) {
			return "noresults";
		}
		model.addAttribute("results", results);
		return "searchResults";
	}

	@GetMapping(value = "/save")
	public String saveToDb(Model model) {
		try {
			wordRepository.saveAll(results);
		} catch (DataAccessException dae) {
			return "duplicate";
		}
		return "saved";
	}
}