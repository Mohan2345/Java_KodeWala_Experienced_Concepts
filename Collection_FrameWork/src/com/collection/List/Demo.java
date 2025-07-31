package com.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
	}
}
