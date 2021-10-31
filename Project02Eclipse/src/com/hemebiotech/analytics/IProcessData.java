package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * Triera alphabétiquement à partir d'une liste
 * Return une TreeMap de String et Integer et peut contenir des répétitions
 */
public interface IProcessData {
	/**
	 * @param list Trie alphabétiquement à partir d'une liste de String et incrémente de 1 pour chaque répétition
	 * 
	 * @return une liste trié alphabétiquement et compté pour chaque répétition
	 */
	public TreeMap<String, Integer> toSortedMap(List<String> list);
	
}
