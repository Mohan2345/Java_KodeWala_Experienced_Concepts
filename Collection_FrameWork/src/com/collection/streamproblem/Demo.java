package com.collection.streamproblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Optional<Integer> number = numList.stream()
													.map(x -> x * 5)
													.filter(x -> x % 2 != 0)
													.sorted(Comparator.reverseOrder())
													.findFirst();
		System.out.println(number.get());
	}
}
