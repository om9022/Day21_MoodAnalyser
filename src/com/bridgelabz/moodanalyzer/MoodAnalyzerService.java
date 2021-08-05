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

	public Object analyseMood() {
		return analyseMood(messsage);
	}

	public Object analyseMood(String message) {
		try {

			if(message.contains("sad"))
			{
				return "sad";
			}
			else
			{
				return "happy";
			}
		}catch(NullPointerException e){
			return "happy";
		}
	}
}
