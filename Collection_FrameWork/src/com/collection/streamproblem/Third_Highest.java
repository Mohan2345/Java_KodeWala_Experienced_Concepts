package com.collection.streamproblem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Third_Highest {
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Optional<Integer> number = numberList.stream()
		.sorted((a,b) -> b-a).skip(2).findFirst();
		System.out.println(number.get());
	}
}
