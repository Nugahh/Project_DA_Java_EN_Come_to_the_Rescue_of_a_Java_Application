package com.hemebiotech.analytics;

import java.util.Map;

public interface ISendResult {
	/**
	 * @param map parcourt une map pour en g�n�rer un fichier
	 */
	public void fileWriter(Map<String, Integer> map);

}
