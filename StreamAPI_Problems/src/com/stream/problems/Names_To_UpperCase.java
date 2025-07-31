package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names_To_UpperCase {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("raj", "meena", "vijay");
		List<String> upperCaseList = list.stream()
													.map(x -> x.toUpperCase())
													.collect(Collectors.toList());
		System.out.println(upperCaseList);
	}
}
