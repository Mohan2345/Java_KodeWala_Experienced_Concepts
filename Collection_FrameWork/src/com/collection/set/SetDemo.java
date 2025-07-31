package com.collection.set;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> productSet = new HashSet<String>();
		
		productSet.add("apple");
		productSet.add("Pomogranate");
		productSet.add("Banana");
		productSet.add("Orange");
		productSet.add("Pomogranate");
		productSet.add("apple");
		productSet.add("apple");
		productSet.add(null);
		productSet.add(null);
		
		System.out.println(productSet);
	}

}
