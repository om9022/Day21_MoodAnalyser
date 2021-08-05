package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzerService;

public class MoodAnalyserTest {
	
//	Check for sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyzerService moodService = new MoodAnalyzerService();
		assertEquals("sad",moodService.analyseMood("I am In Sad Mood"));
	}
	
//	Check for happy mood
	@Test
	public void givenMessage_WhenNoMoodSpecified_ShouldReturnHappy() {
		MoodAnalyzerService moodService = new MoodAnalyzerService();
		assertEquals("happy",moodService.analyseMood("I am In any mood"));		
	}
	
//	Check for sad mood and message passed through constructor
	@Test
	public void  givenMessageInConstructor_WhenSad_ShouldReturnSad() {
		MoodAnalyzerService moodAnalyse = new MoodAnalyzerService("I am in Sad mood");
		assertEquals("sad",moodAnalyse.analyseMood());		
	}
}
