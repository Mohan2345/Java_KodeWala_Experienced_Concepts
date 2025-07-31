package com.collections.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Iterator_Map {
	public static void main(String[] args) {
		HashMap<String, String> hashMaP = new HashMap<String, String>();
		
		hashMaP.put("KA", "BLR");
		hashMaP.put("TG", "HYD");
		hashMaP.put("TN", "CHN");
		
		Iterator<Entry<String, String>> itr = hashMaP.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String, String> entry = itr.next();
			System.out.println(entry.getKey() + " | " + entry.getValue());
		}
	}
}
