package com.hemebiotech.analytics;

import java.util.Map;
/**
 * Envoie les données extrait à partir d'une map dans un nouveau fichier
 */
public interface ISendResult {
	/**
	 * @param map parcourt une map pour en générer un fichier
	 */
	public void fileWriter(Map<String, Integer> map);
}
