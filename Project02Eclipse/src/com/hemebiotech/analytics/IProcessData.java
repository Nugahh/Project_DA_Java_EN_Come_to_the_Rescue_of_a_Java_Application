package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * Triera alphab�tiquement � partir d'une liste
 * Return une TreeMap de String et Integer et peut contenir des r�p�titions
 */
public interface IProcessData {
	/**
	 * @param list Trie alphab�tiquement � partir d'une liste de String et incr�mente de 1 pour chaque r�p�tition
	 * 
	 * @return une liste tri� alphab�tiquement et compt� pour chaque r�p�tition
	 */
	public TreeMap<String, Integer> toSortedMap(List<String> list);
	
}
