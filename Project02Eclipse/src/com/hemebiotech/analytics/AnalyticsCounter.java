package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	/*
	 * private static int headacheCount = 0; // initialize to 0 private static int
	 * rashCount = 0; // initialize to 0 private static int pupilCount = 0; //
	 * initialize to 0
	 */
	public static final String inputFile = "symptoms.txt";

	public static void main(String args[]) {
		// first get input
		/*
		 * BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		 * String line = reader.readLine();
		 */
		// 1) lire une source de données pour récupérer l'information
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(inputFile);
		List<String> listNotCounted = reader.getSymptoms();
		System.out.println(listNotCounted);

		
		//2) traiter les symptoms
		ProcessData processData = new ProcessData();
		Map<String, Integer> map = processData.toSortedMap(listNotCounted);
		System.out.println(map);

		
		//3) écrire les résultats quelque part
		SendResultInTxt writer = new SendResultInTxt();
		writer.fileWriter(map);				
			 
		  //for (String element : listNotCounted) {			  
		  //}	  
		  
		 /* int i = 0; // set i to 0 int headCount = 0; // counts headaches while (line
		  != null) { i++; // increment i System.out.println("symptom from file: " +
		  line); if (line.equals("headache")) { headCount++;
		  System.out.println("number of headaches: " + headCount); } else if
		  (line.equals("rush")) { rashCount++; } else if (line.contains("pupils")) {
		  pupilCount++; }
		  */		  				  		 

		// next generate output
		/*
		 * FileWriter writer = new FileWriter ("result.out"); writer.write("headache: "
		 * + headacheCount + "\n"); writer.write("rash: " + rashCount + "\n");
		 * writer.write("dialated pupils: " + pupilCount + "\n");
		 */
		
	}
}
