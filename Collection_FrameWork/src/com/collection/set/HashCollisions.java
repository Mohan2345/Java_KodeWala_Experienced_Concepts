package com.collection.set;


public class HashCollisions 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo("Deepak");
		Demo d2 = new Demo("Kumar");
		
		System.out.println(d1.hashCode() == d2.hashCode());
		System.out.println(d1.equals(d2));
	}
}

class Demo
{
	String name;
	public Demo(String name) {
		super();
		this.name = name;
	}
	@Override
	public int hashCode() {
		return  10;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Demo demo = (Demo) obj;
		return demo.name == this.name;
	}
}
