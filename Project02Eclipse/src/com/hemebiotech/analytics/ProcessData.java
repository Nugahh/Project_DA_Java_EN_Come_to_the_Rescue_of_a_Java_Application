package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class ProcessData implements IProcessData {

	public TreeMap<String, Integer> toSortedMap(List<String> listOfSymptoms) {

		TreeMap<String, Integer> map = new TreeMap<>();
		for (String symptoms : listOfSymptoms) {
			int oldValue = map.getOrDefault(symptoms, 0);
			map.put(symptoms, oldValue + 1);
		}

		return map;
	}
}
