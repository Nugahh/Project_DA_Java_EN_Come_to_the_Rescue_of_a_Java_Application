package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Analyse {
	private ISymptomReader reader;
	private IProcessData process;
	private ISendResult sendData;

	public Analyse(ISymptomReader reader, IProcessData process, ISendResult sendData) {
		this.reader = reader;
		this.process = process;
		this.sendData = sendData;
	}

	public List<String> getSymptoms() {
		return this.reader.getSymptoms(); // a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	}

	public Map<String, Integer> toSortedMap(List<String> list) {
		return this.process.toSortedMap(list); // trie alphab�tiquement � partir d'une liste de String et incr�mente de 1 pour chaque r�p�tition
	}

	public void send(Map<String, Integer> map) {
		this.sendData.fileWriter(map); // parcourt une map pour en g�n�rer un fichier
	}

}