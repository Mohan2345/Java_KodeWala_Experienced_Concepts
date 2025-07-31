package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Capitalize_Strings {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("deepak", "sneha", "VIKAS");
		List<String> filteredList = nameList.stream()
		.map(x -> {
			if(x.isEmpty()) 
				{
				return x;	// handles the empty string
				} else
				{
				return x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
				}
		})
		.collect(Collectors.toList());
		System.out.println(filteredList);
	}
}
