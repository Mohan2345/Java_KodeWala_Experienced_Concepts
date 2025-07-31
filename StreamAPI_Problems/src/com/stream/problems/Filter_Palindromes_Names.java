package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Palindromes_Names {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Nayan", "Meena", "Madam", "Ravi");
		List<String> palindromeList = list.stream()
			.filter(x -> x.toLowerCase().equals(new StringBuilder(x).reverse().toString().toLowerCase()))
			.collect(Collectors.toList());
		System.out.println(palindromeList); 
	}
}
