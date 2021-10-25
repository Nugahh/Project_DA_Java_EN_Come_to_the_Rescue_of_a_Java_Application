package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class MainObject {
	private ISymptomReader reader;
	private IProcessData process;
	private ISendResult sendData;

	public MainObject(ISymptomReader reader, IProcessData process, ISendResult sendData) {
		this.reader = reader;
		this.process = process;
		this.sendData = sendData;
	}

	public List<String> getSymptoms() {
		return this.reader.getSymptoms(); // a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	}

	public Map<String, Integer> toSortedMap(List<String> list) {
		return this.process.toSortedMap(list); // une liste trié alphabétiquement et compté pour chaque répétition
	}

	public void send(Map<String, Integer> map) {
		this.sendData.fileWriter(map); // parcourt une map pour en générer un fichier
	}

}