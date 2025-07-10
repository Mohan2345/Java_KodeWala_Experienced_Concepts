package com.collection.List;

import java.util.ArrayList;
import java.util.List;

public class CityList
{
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		
		cityList.add("Bengaluru");
		cityList.add("Hyd");
		cityList.add("Chennai");
		cityList.add("Mumbai");
		cityList.add("Bengaluru");
		cityList.add("Chandigarh");
		
		for(int index = 0;index < cityList.size();index++)
		{
			String city = cityList.get(index);
			if(city.equalsIgnoreCase("Mumbai"))
			{
				System.out.println("Mumbai exist");
				break;
			} else
			{
				System.out.println("Mumbai Doesn't exist");
			}
		}
	}
}
