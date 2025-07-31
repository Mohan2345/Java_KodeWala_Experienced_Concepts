package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Name {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amit", "Ajay", "Anjali", "Ravi");
		List<String> filteredList = list.stream()
				.filter(x -> x.toLowerCase().startsWith("a"))
				.collect(Collectors.toList());
		System.out.println(filteredList);
	}
}
