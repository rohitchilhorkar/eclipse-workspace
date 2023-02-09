package com.pratiti.spring;

import org.springframework.stereotype.Component;

@Component("spellChecker")
public class SpellChecker {

	
	public void checkSpellingMistakes(String document) {
		System.out.println("Spell Checker Spelling Mistakes...");
	}
}
