package Bean_File;

public class Student {
	private String name;
	private int rollNo;
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
		System.out.println("Student Name: " + name + " Student marks "+ marks + " Student RollNumber " + rollNo);
	}
}
