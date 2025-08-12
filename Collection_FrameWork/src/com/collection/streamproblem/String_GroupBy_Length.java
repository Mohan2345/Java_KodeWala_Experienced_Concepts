package com.collection.streamproblem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class String_GroupBy_Length {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello","hye","Bye","apple");
		Map<Integer, List<String>> map = list.stream()
			 											.collect(Collectors.groupingBy(x -> x.length()));
	 	System.out.println(map); 
	}
}


 