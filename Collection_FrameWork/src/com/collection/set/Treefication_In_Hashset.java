package com.collection.set;

import java.util.HashSet;

public class Treefication_In_Hashset {
	public static void main(String[] args) {
		HashSet<City> citySet = new HashSet<City>(64);	
		City city1 = new City("Bengaluru");
		City city2 = new City("Bhillai");
		City city3 = new City("Bhubaneswar");
		City city4 = new City("Berhampur");
		City city5 = new City("Delhi");
		City city6 = new City("Jaipur");
		City city7 = new City("Kota");
		City city8 = new City("Chennai");
		City city9 = new City("Vizag");
		citySet.add(city1);
		citySet.add(city2);
		citySet.add(city3);
		citySet.add(city4);
		citySet.add(city5);
		citySet.add(city6);
		citySet.add(city7);
		citySet.add(city8);
		citySet.add(city9);
		System.out.println(citySet);
	}
}

class City
{
	String name;
	public City(String name) {
		super();
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 74683937;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
