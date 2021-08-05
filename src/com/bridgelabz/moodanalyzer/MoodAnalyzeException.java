package com.bridgelabz.moodanalyzer;

public class MoodAnalyzeException extends Exception {

	public enum ExceptionType
	{
		ENTERED_NULL,ENTERED_EMPTY
	}

	public ExceptionType type;
	public MoodAnalyzeException(ExceptionType type, String message)
	{
		super(message);
		this.type = type;
	}
}

