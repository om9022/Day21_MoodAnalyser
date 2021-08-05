package com.bridgelabz.moodanalyzer;

import com.bridgelabz.moodanalyzer.MoodAnalyzeException.ExceptionType;

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

	public Object analyseMood(String message) throws MoodAnalyzeException {
		try {
			if(message.length()== 0) {
				throw new MoodAnalyzeException(ExceptionType.ENTERED_EMPTY, "message cannot be empty");
			}

			if(message.contains("sad"))
			{
				return "sad";
			}
			else
			{
				return "happy";
			}
		}catch(NullPointerException e){
			throw new MoodAnalyzeException(ExceptionType.ENTERED_NULL, "message cannot be null");
		}
	}
}
