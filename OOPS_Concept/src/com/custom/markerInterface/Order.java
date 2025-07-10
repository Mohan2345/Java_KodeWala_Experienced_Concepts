package com.custom.markerInterface;

public class Order implements MyMarker{
	public static void main(String[] args) {
		SpecialActivity activity = new SpecialActivity();
		Order order = new Order();
		activity.doActivity(order);
	}
}
class SpecialActivity {
	void doActivity(Order order){
		if(order instanceof MyMarker){
			System.out.println("Doing Special Activity");
		} else{
			System.out.println("Not allowed to perform special activity..!");
		}
	}
}
