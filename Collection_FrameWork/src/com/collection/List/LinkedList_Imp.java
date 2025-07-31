package com.collection.List;

import java.util.LinkedList;

public class LinkedList_Imp
{
	public static void main(String[] args) 
	{
		LinkedList<String> cityList = new LinkedList<String>();
		
		cityList.add("Bengaluru");
		cityList.add("Jaipur");
		cityList.add("Kota");
		cityList.add("Bhubaneswar");
		
		System.out.println("Linked List before adding element: ");
		System.out.println(cityList);
		
		cityList.add(1,"Chandigarh");
		
		System.out.println("Linked List after adding element at particular index: ");
		System.out.println(cityList);
	}
}
