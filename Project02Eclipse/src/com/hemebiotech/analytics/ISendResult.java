package com.hemebiotech.analytics;

import java.util.Map;

public interface ISendResult {
	/**
	 * @param map parcourt une map pour en générer un fichier
	 */
	public void fileWriter(Map<String, Integer> map);

}
