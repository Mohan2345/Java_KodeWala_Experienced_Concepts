package Java_Based_Bean_Creation.Spring_Project_First;

public class Employee {
	
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee Name: " + name + " Employee salary: " + salary);
	}
}
