package com.collection.streamproblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap_Demo {
	public static void main(String[] args) {
		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(9,2,3,2,4), 
																				Arrays.asList(7,8,5,4),
																				Arrays.asList(32,93,7,98)
																				);
		
		List<Integer> list = nestedList.stream()
										.flatMap(x -> x.stream())
										.collect(Collectors.toList());
		System.out.println("Nested List: " + nestedList);
		System.out.println("Flattened List: " + list);
		
		// Highest Number
		Optional<Integer> highestNum = list.stream()
															.sorted((a,b) -> b-a)	// reverse the elements
															.findFirst();
		
		System.out.println("Highest Number: " + highestNum.get());
		
		// Second Highest Number from array
		Optional<Integer> secondHighestNum = list.stream()
																.distinct() // it is used to remove duplicates
																.sorted(Comparator.reverseOrder())
																.skip(1)	// skips the first element
																.findFirst();
		
		System.out.println("Second Highest Number: " + secondHighestNum.get());
		
		// find duplicate from flattened list
		HashSet<Integer> hs = new HashSet<Integer>();
		Set<Integer> integerSet = list.stream()
													.filter(x -> !hs.add(x))
													.collect(Collectors.toSet());
		
		System.out.println("Duplicate Numbers: " + integerSet);
	}
}
