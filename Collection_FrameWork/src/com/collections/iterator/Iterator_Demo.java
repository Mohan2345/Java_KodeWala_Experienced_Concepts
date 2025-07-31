package com.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Bengaluru");
		cityList.add("Bhubaneswar");
		cityList.add("Bhopal");
		cityList.add("Jaipur");
		cityList.add("Ladakh");
		cityList.add("Gangtok");
		
		for (String  city : cityList) {
			System.out.println("City Name: " + city);
		}
		
		Iterator<String> itr = cityList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
	}
}
