package com.pratiti.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("textEditor")
public class TextEditor {

	@Autowired
	private SpellChecker sc;
	public void load(String document) {
		System.out.println("TextEditor loading the document");
//		SpellChecker a = new SpellChecker();   Replace this line with Spring
		
		sc.checkSpellingMistakes(document);
	}
}
