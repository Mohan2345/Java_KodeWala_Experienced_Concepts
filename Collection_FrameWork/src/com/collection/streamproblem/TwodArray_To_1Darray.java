package com.collection.streamproblem;

import java.util.Arrays;

public class TwodArray_To_1Darray {
	public static void main(String[] args) {
		 int [][] arr = {{1,2,3},{4,5,6},{8,9,10}};
		 
		int [] newArr = Arrays.stream(arr)
		 .flatMapToInt(Arrays::stream)
		 .toArray();
		 
		System.out.println(Arrays.toString(newArr));
	}
}
