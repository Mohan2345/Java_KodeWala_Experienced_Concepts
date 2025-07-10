package com.custom.exceptions;

import java.util.Scanner;

public class Handle_Custom_Exception {
	public static void main(String[] args) {
		try {
			Handle_Custom_Exception hcs = new Handle_Custom_Exception();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter you pin");
			boolean res = hcs.doPayment(sc.next());
			if (res) {
				System.out.println("Do The Transaction using ATM & Thank You For using our ATM");
			}
		} catch (InvalidPinException e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public boolean doPayment(String pin) throws InvalidPinException {
		boolean status = validatePin(pin);
		if (!status) {
			throw new InvalidPinException("Pin was not matched please try again");
		}
		return true;
	}

	public boolean validatePin(String pin) {
		if (pin.equals("9090")) {
			return true;
		} else {
			return false;
		}
	}
}
