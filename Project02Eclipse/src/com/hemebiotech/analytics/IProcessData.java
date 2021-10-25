package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface IProcessData {
	/**
	 * @return une liste trié alphabétiquement et compté pour chaque répétition
	 */
	public TreeMap<String, Integer> toSortedMap(List<String> list);
	
}
