package com.collection.streamproblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Capitalize_List_String {
	public static void main(String[] args) {
		List<String> fruitList = Arrays.asList("apple","banana","coconout");
		List<String> upperCaseList = fruitList.stream()
													.map(x -> x.toUpperCase())
													.collect(Collectors.toList());
		System.out.println(upperCaseList);
	}
}
