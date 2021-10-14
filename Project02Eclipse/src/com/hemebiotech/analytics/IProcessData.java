package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface IProcessData<E> {
	
	public Map<E, Integer> toSortedMap(List<E> list);
	
}
