package com.beancreation.main.Bean;

public class Student {
	String name;
	int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Student Name: " + name + " Student Marks: " + marks);
	}
}
