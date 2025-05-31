package com.dicreation.main.beans;

public class SalaryInfo {
	private String baseSal;

	public SalaryInfo(String baseSal) {
		super();
		this.baseSal = baseSal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salary: " + baseSal;
	}
}
