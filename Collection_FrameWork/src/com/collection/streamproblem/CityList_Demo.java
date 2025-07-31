package com.collection.streamproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CityList_Demo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>(Arrays.asList("New York","London","Tokyo","Paris","Sydney","Tornoto","Berlin","Dubai","Singapore","San Francisco"));
		
		List<String> resultList =  cities.stream()
												.filter(city -> city.startsWith("S"))
												.map(city -> city.toUpperCase())
												.collect(Collectors.toList());
		
		System.out.println(resultList);
	}
}
