package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Name_Based_On_Char {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Isha", "Aman", "Nikita", "Surya");
		List<String> filteredList = list.stream()
												.filter(x -> x.toLowerCase().contains("i"))
												.collect(Collectors.toList());
		System.out.println(filteredList);
	}
}
