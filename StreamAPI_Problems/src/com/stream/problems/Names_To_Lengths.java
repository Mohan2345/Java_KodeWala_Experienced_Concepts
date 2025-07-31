package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Names_To_Lengths {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Priya", "Harish", "Kiran");
	    List<Integer> numberList = nameList.stream()
	    										.map(x -> x.length())
	    										.collect(Collectors.toList());
	    System.out.println(numberList);
	}
}
