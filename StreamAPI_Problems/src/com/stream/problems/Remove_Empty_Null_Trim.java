package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Empty_Null_Trim {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(null, "  Deepak ", "", " Rani");
		List<String> filteredList = list.stream()
											.filter(x -> x != null && x.length() > 0)
											.collect(Collectors.toList());
		System.out.println(filteredList);
	}
}