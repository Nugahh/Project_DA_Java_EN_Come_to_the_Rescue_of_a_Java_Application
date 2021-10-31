package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static final String inputFile = "symptoms.txt";

	public static void main(String args[]) {

		Analyse analyse = new Analyse(new ReadSymptomDataFromFile(inputFile), new ProcessData(), new SendResultInTxt());

		List<String> list = analyse.getSymptoms();
		Map<String, Integer> map = analyse.toSortedMap(list);
		analyse.send(map);
		System.out.print(map);

	}
}
