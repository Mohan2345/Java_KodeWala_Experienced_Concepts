package com.handle.exceptions;

public class HnadleException {
	public static void main(String[] args) {
		try {
			String cityName[] = {"Bengaluru", "Bhubaneswar","NewDelhi"};
			System.out.println(cityName[0]);
			System.out.println(cityName[1]);
			System.out.println(cityName[2]);
			System.out.println(cityName[3]);
		} catch (Exception e) {
			System.out.println("Unable to access the index of array " + e);
		}
	}
}
