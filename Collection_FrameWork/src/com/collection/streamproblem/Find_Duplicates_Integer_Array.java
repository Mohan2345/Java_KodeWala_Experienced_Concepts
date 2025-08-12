package com.collection.streamproblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Duplicates_Integer_Array {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,3,2,1);
		List<Integer> newList = list.stream()
											.distinct()
											.collect(Collectors.toList());
 		System.out.println(newList);  
	}
}
