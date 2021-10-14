package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProcessData implements IProcessData<String> {

	public Map<String, Integer> toSortedMap(List<String> list) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new TreeMap<>();
		for(String e : list) {
			int oldValue = map.getOrDefault(e, 0);
			map.put(e, oldValue + 1);
		}
		
		return map;
	}

	

}
