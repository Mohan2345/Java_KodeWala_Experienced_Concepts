package com.collection.set;

import java.util.HashMap;
import java.util.Objects;

public class Interview_Demo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Deepak", "Kumar");
		Employee e2 = new Employee("Deepak", "Kumar");
		
		HashMap<Employee, Integer> map = new HashMap<Employee, Integer>();
		
		map.put(e1, 109);
		map.put(e2, 222);
		
		System.out.println(map);
		System.out.println(map.size());
	}
}

class Employee {
	String fn;
	String ln;
	public Employee(String fn, String ln) {
		super();
		this.fn = fn;
		this.ln = ln;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(fn);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee emp = (Employee) obj;
		if(this.fn.equals(emp.fn) && this.ln.equals(emp.ln))
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fn +" " + ln;
	}
}
