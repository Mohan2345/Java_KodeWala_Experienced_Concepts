package com.collection.streamproblem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Maximum_Even_Number {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,18);
		Optional<Integer> maxEvenNumber = numList.stream()
																.filter(x -> x % 2 == 0)
																.sorted((a,b)->b-a)
																.findFirst();
			System.out.println(maxEvenNumber.get());	
	}
}
