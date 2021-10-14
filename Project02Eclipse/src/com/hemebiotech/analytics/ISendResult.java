package com.hemebiotech.analytics;

import java.util.Map;

public interface ISendResult<E> {
	
	public void fileWriter(Map<E, Integer> map);

}
