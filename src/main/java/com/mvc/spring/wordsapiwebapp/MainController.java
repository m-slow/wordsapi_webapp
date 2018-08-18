package com.mvc.spring.wordsapiwebapp;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.mvc.spring.wordsapiwebapp.connections.MainConnection;
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

	List<IndividualResult> results = null;
	MainConnection mainConnection = MainConnection.getInstance();

	@GetMapping(value = "/")
	public String main() {
		return "index";
	}

	@GetMapping(value = "/lookup")
	public String lookUpWord(@RequestParam(value = "word", required = false) String word, Model model)
			throws IOException, UnirestException {
		mainConnection.setApiConnectionParameter(WordsApiConnection.getInstance());
		String response = mainConnection.getApiConnectionParameter().lookUpWord(word);
		WordsApiEntry wordsApiEntry = WordsApiConnection.createJavaObject(response);
		results = wordsApiEntry.getAllIndividualResults();
		model.addAttribute("results", results);
		return "lookup";
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