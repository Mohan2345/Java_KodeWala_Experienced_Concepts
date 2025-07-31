package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Spaces_With_UnderScores {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Amit Kumar", "Sita Ram", "Vijay");
		List<String> replacedList = nameList.stream()
		.map(x -> x.replaceAll(" ", "_"))
		.collect(Collectors.toList());
		System.out.println(replacedList);
	}
}
