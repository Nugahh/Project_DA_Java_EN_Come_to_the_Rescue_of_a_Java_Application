package com.hemebiotech.analytics;

import java.util.Map;
/**
 * Envoie les donn�es extrait � partir d'une map dans un nouveau fichier
 */
public interface ISendResult {
	/**
	 * @param map parcourt une map pour en g�n�rer un fichier
	 */
	public void fileWriter(Map<String, Integer> map);
}
