package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.bridgelabz.moodanalyzer.MoodAnalyzeException;
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
	
//	check for happy mood and message passed through constructor
	@Test
	public void givenMessageInConstructor_WhenHappy_ShouldReturnHappy() {
		MoodAnalyzerService moodAnalyse = new MoodAnalyzerService("i am in happy mood");		
		assertEquals("happy",moodAnalyse.analyseMood());
	}
	

	//check for null message passed through constructor
	@Test
	public void givenMessageInConstructor_WhenNull_ShouldReturnHappy()
	{
		try 
		{
			MoodAnalyzerService moodAnalyse = new MoodAnalyzerService(null);		
			assertEquals("happy",moodAnalyse.analyseMood());			
		} 
		catch (MoodAnalyzeException e) 
		{
			assertEquals("message cannot be null", e.getMessage());
		}
	}
}
