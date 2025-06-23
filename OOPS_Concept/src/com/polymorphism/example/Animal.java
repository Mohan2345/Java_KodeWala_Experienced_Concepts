package com.polymorphism.example;

public class Animal 
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}

class Tiger extends Animal
{
	@Override
	void eat()
	{
		System.out.println("Tiger haunts and eats");
	}
}

class Deer extends Animal
{
	@Override
	void eat()
	{
		System.out.println("Deer Grazes and eats");
	}
}
