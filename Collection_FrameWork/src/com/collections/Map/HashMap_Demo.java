package com.collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Demo {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(178, "Deepak");
		map.put(178, "RAM");
		map.put(376, "Hari");
		map.put(465, "Shyam");
		//map.put(null, "John");
		System.out.println(map);
	}
}




