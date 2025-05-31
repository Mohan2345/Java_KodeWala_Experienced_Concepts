package com.dicreation.main.bean;

public class InsuranceInfo {

	private String totalCoverage;

	public String getTotalCoverage() {
		return totalCoverage;
	}

	public void setTotalCoverage(String totalCoverage) {
		this.totalCoverage = totalCoverage;
	}
	
	public String displayInsuranceDetails()
	{
		return "Total Coverage: " + totalCoverage;
	}
}
