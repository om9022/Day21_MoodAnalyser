package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	public static void main(String[] args) {
		String message = "Today I am Sad";
		MoodAnalyzerService moodAnalyzer = new MoodAnalyzerService();
		System.out.println(moodAnalyzer.analyseMood(message));
		
	}
}
