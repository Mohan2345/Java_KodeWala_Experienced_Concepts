package com.collection.streamproblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Print_Duplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,3,2,1);
		Set<Integer> set = new HashSet<Integer>();
		
		List<Integer> duplicateList = list.stream()
													.filter(x -> set.add(x))
													.collect(Collectors.toList());
		
		System.out.println(duplicateList);
	}
}
