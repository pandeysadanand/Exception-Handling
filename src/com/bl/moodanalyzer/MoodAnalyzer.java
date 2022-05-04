package com.bl.moodanalyzer;

public class MoodAnalyzer {
	String message;
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	//method for analyse mood
	public String analyseMood() {
		if(message.equalsIgnoreCase("I am in sad mood."))
		return "Sad";
		else if(message.equalsIgnoreCase("I am in happy mood."))
			return "Happy";
		else 
			return "no match";
	}
}
