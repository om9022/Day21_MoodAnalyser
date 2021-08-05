package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzerService;

public class MoodAnalyserTest {
	MoodAnalyzerService moodService = new MoodAnalyzerService();
//	Check for sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		assertEquals("sad",moodService.analyseMood("I am In Sad Mood"));
	}
	
//	Check for happy mood
	@Test
	public void givenMessage_WhenNoMoodSpecified_ShouldReturnHappy() {
		assertEquals("happy",moodService.analyseMood("I am In Sad happy"));		
	}
}
