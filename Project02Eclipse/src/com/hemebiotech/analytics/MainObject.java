package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class MainObject {
	private ISymptomReader reader;
	private IProcessData process;
	private ISendResult sendData;

	
	public MainObject(ReadSymptomDataFromFile readSymptomDataFromFile) {
		this.reader = readSymptomDataFromFile;
		this.process = new ProcessData();
		this.sendData = new SendResultInTxt();
	}

	public List<String> getSymptoms() {
		return this.reader.getSymptoms();
	}

	public Map<String, Integer> toSortedMap(List<String> list) {
		return this.process.toSortedMap(list);
	}

	public void send(Map<String, Integer> map) {
		this.sendData.fileWriter(map);
	}

}