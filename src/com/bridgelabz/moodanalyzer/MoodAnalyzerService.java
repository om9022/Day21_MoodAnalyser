package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerService {

	public String analyseMood(String message) {
		if(message.contains("sad")) {
			return "sad";
		}
		else {
			return "Happy";
		}
	}

}
