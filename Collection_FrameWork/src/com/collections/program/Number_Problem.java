package com.collections.program;

import java.util.ArrayList;
import java.util.Arrays;

public class Number_Problem {
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(
		            23, 87, 11, 56, 45, 68, 94, 32, 10, 72,
		            63, 95, 19, 41, 77, 28, 60, 51, 39, 88,
		            58, 84, 22, 79, 37, 90, 53, 17, 25, 67,
		            31, 52, 49, 73, 14, 26, 97, 48, 55, 91,
		            62, 12, 92, 38, 70, 36, 85, 65, 75, 80
		        ));
		 
		 ArrayList<Integer> resultList = new ArrayList<Integer>();
		 for (Integer num : list) {
			if(num % 2 == 0)
			{
				int result = num * 5;
				resultList.add(result);
			}
		 }
		 System.out.println(resultList);
	}
}
