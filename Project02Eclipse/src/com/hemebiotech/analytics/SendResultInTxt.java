package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SendResultInTxt implements ISendResult {
	
	public static final String outputFile = "results.out";
	
	@Override
	public void fileWriter(Map<String, Integer> map) {

		try {
			FileWriter writer = new FileWriter(outputFile);
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();

				writer.write(key + ": " + value + "\n");
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
