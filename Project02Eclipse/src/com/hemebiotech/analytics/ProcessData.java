package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProcessData implements IProcessData{
	/**
	 * @param 
	 */
	public TreeMap<String, Integer> toSortedMap(List<String> listOfSymptoms) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Integer> map = new TreeMap<>();
		for(String e : listOfSymptoms) {
			int oldValue = map.getOrDefault(e, 0);
			map.put(e, oldValue + 1);
		}
		
		return map;
	}

	

}
