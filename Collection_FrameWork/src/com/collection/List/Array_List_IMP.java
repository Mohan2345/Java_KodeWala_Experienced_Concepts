package com.collection.List;

import java.util.ArrayList;
import java.util.List;

public class Array_List_IMP {
	public static void main(String[] args) {
		String s1 = "apple11";
		String s2 = "samsung";
		String s3 = "OnePlus";
		String s4 = "Nothing";
		String s5 = "Nokia";
		String s6 = "Nokia";
		String s7 = "samsung";
		String s8 = null;

		List<String> productList = new ArrayList<String>();
		productList.add(s1);
		productList.add(s2);
		productList.add(s3);
		productList.add(s4);
		productList.add(s5);
		productList.add(s6);
		productList.add(s7);
		productList.add(s8);

		System.out.println("Product List: " + productList);
	
	}
}
