package com.collection.List;

import java.util.ArrayList;

public class ArrayList_IMP 
{
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Bangalore");
		arrayList.add("Bhubaneswar");
		arrayList.add("New Delhi");
		arrayList.add("Lucknow");
		arrayList.add("Chandigarh");
		
		System.out.println("ArrayList Before Inserting: ");
		System.out.println("arrayList --> " + arrayList);
		
		arrayList.add(1,"jaipur");
		
		System.out.println("ArrayList  After Inserting: ");
		System.out.println("arrayList --> " + arrayList);
		
		arrayList.remove(4);
		
		System.out.println("ArrayList after Deleting: ");
		System.out.println("arrayList --> " + arrayList);
 	}
}
