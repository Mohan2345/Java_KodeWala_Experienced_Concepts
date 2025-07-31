package com.collection.set;

import java.util.TreeSet;

public class TressSet_Demmo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> personSet = new TreeSet<Person>();
		Person p1 = new Person("Ram", "Bnegaluru");
		Person p2 = new Person("Shyam", "Chennai");
		personSet.add(p1);
		personSet.add(p2);
		System.out.println(personSet);
	}
}

class Person implements Comparable<Person>
{
	String name;
	String address;
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);		 
	}
	@Override
	public String toString() {
		return name + " " + address ;
	}	
}
