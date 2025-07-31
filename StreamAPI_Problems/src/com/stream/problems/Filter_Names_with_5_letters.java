package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Names_with_5_letters {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Gita", "Chandni", "Rohit", "Abhishek");
		List<String> filteredList = nameList.stream()
											.filter(x -> x.length() > 5)
											.collect(Collectors.toList());
		System.out.println(filteredList);
	}
}
