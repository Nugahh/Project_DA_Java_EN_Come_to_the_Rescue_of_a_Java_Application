package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface IProcessData {
	/**
	 * @return une liste tri� alphab�tiquement et compt� pour chaque r�p�tition
	 */
	public TreeMap<String, Integer> toSortedMap(List<String> list);
	
}
