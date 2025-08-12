package com.collection.streamproblem;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Print_Duplicated {
	public static void main(String[] args) {
		String str = "Programming";
		Set<Character> characterString = new HashSet<Character>();
		Set<Character> result = str.chars()
		.mapToObj(c -> (char) c)
		.filter(c -> !characterString.add(c))
		.distinct()
		.collect(Collectors.toSet());
		System.out.println(result);
	}
}
