package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	public static final String inputFile = "symptoms.txt";

	public static void main(String args[]) {
		

		MainObject mainObject = new MainObject(new ReadSymptomDataFromFile(inputFile));
		
		List<String> list = mainObject.getSymptoms();
		Map<String, Integer> map = mainObject.processData(list);
		mainObject.send(map);
		System.out.print(map);
		
	}
}
