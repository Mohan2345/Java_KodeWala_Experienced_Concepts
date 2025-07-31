package com.collections.program;

import java.util.ArrayList;
import java.util.Arrays;

public class CityList_Problem {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>(Arrays.asList("New York","London","Tokyo","Paris","Sydney","Tornoto","Berlin","Dubai","Singapore","San Francisco"));
		
		ArrayList<String> resultList = new ArrayList<String>();
		for (String city : cities) {
			if(city.startsWith("S"))
			{
				resultList.add(city);
			}
		}
		System.out.println(resultList);
		for (String result : resultList) {
			System.out.println(result.toUpperCase());
		}
	}
}
