package com.dicreation.main.bean;

public class SalaryInfo {
	private String baseSal;
	private String totalSal;
	public String getBaseSal() {
		return baseSal;
	}
	public void setBaseSal(String baseSal) {
		this.baseSal = baseSal;
	}
	public String getTotalSal() {
		return totalSal;
	}
	public void setTotalSal(String totalSal) {
		this.totalSal = totalSal;
	}
	
	public String displaySalaryDetails()
	{
		return "Base Salary : " + baseSal + " Total Salary: " + totalSal;
	}
}
