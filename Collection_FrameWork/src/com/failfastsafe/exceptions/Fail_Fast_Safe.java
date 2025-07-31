package com.failfastsafe.exceptions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Fast_Safe {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			list.add("C");
		}
	}
}
