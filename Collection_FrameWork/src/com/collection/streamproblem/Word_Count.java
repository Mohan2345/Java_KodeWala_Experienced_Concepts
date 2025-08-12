package com.collection.streamproblem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Word_Count {
	public static void main(String[] args) {
		List<String> wordList = Arrays.asList("This", "is" , "from", "i", "am"
							, "from", "Bangalore" ,"Bangalore", "is", "Karnataka");
		
		 Map<String, Long> frequencyMap = wordList.stream()
		.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		 System.out.println(frequencyMap);
	}
}
