package com.beancreation.main.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Deepak")
	private String name;
	@Value("14")
	private int rollNo;
	@Value("99")
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Student Name: " + name + " Student RollNumber: " + rollNo + " Student marks: " + marks);
	}
}
