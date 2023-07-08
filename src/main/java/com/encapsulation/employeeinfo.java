package com.encapsulation;

public class employeeinfo {
	
	public static void main(String[] args) {
		employee e1 = new employee();
		
		employee e2 = new employee("e2", 15000, 23);
		employee e3 = new employee("e3", 38000, 31);
		
		System.out.println("salary of e2:" + e2.salary);
		System.out.println("salary of e3:" + e3.salary);
	}

}
