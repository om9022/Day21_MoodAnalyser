package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzerService;

public class MoodAnalyserTest {
	MoodAnalyzerService moodService = new MoodAnalyzerService();

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		assertEquals("sad",moodService.analyseMood("I am In Sad Mood"));
	}
}
