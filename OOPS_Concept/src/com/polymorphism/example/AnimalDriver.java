package com.polymorphism.example;

import java.util.Scanner;

public class AnimalDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your animal type: ");
		String animalType = sc.next();
		AnimalHandler ah = new AnimalHandler();
		if(animalType.equalsIgnoreCase("tiger"))
		{
			ah.handleAnimal(new Tiger());
		} else if(animalType.equalsIgnoreCase("deer"))
		{
			ah.handleAnimal(new Deer());
		} else
		{
			System.out.println("Please enter valid animalType it is not present: " + animalType);
		}
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your animal type: ");
		String animalType = sc.next();
		
		AnimalHandler ah = new AnimalHandler();
		Animal animal = null;
		
		if(animalType.equalsIgnoreCase("tiger"))
		{
			 animal = new Tiger();
		}  else if(animalType.equalsIgnoreCase("deer"))
		{
			animal = new Deer();
		} else
		{
			System.out.println("Please enter valid animalType it is not present: " + animalType);
		}
		if(animal != null)
		{
			ah.handleAnimal(animal);
		}
		*/
 	}
}
