package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Names_Matches_With_Vowels {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Rita", "Manoj", "Deepa", "Rakesh");
		List<String> filteredList = nameList.stream()
		.filter(x -> {
			if(x.isBlank()) 
			{
				return false;
			}  
			char lastChar = Character.toLowerCase(x.charAt(x.length()-1));
			return lastChar == 'a' || lastChar == 'e' ||lastChar == 'i' ||lastChar == 'o' ||lastChar == 'u';
		})
		.collect(Collectors.toList());
	    
		System.out.println(filteredList);
		 
	}
}
