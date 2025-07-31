package com.collections.concurrentcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concurrent_Collections_Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Bengaluru");
		list.add("Delhi");
		list.add("Bhubaneswar");
		System.out.println("List: " + list);
		// Wrapped with Unmodified list
		List<String> unmodifiedList = Collections.unmodifiableList(list);
		System.out.println("UnmodifiedList: " + unmodifiedList);
		// It shows UnsupportedOperationException
		unmodifiedList.add("Mumbai");
		System.out.println("UnmodifiedList: " + unmodifiedList);
	}
}
