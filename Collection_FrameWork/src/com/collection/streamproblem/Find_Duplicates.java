package com.collection.streamproblem;

import java.util.List;
 import java.util.stream.Collectors;

public class Find_Duplicates {
	public static void main(String[] args) {
		 String str = "Programming";
		 List<Character> chr = str.toLowerCase().chars()  
		 .mapToObj(c ->(char) c)
		 .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
		 .collect(Collectors.toList());
		 System.out.println(chr);
	}
}
