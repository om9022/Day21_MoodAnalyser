package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	public static void main(String[] args) {
		MoodAnalyzerService moodAnalyzer = new MoodAnalyzerService();
		String message = "Today I am Sad";
		System.out.println(moodAnalyzer.analyseMood(message));
	}
}
