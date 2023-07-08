package com.encapsulation;

public class employee {
	
	public String name;
	
	public int salary;
	
	public int age;
	
	public employee() {
		System.out.println("inside constructor::");
	}

	public employee(String name, int salary, int age) {
		this.name= name;
		this.salary= salary;
		this.age= age;
		
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
