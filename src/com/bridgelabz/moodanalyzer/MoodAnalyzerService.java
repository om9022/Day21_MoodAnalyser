package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerService {

	public String messsage ;
	
	public MoodAnalyzerService() {
		super();
	}
	
	public MoodAnalyzerService(String message) {
		super();
		this.messsage = message;
	}
	
	public String analyseMood(String message) {
		if(message.contains("sad"))
		{
			return "sad";
		}
		else
		{
			return "happy";
		}
	}
}
