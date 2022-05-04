package com.bl.moodanalyzer;

/*
 * @author : Sadanand Pandey
 * Mood Analyzer program
 */
public class MoodAnalyzerMain {

	public static void main(String[] args) {
		MoodAnalyzer analyzer = new MoodAnalyzer("I am in happy mood.");
		System.out.print(analyzer.analyseMood());
	}
}
