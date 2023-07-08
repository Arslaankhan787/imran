package com.studnet;

public class test {

	public static void main(String[] args) {

		student s1 = new student();
		s1.setName("vijay");
		s1.setRollno(123);
		System.out.println("name:" + s1.getName());
		System.out.println("rollno:" + s1.getRollno());
		System.out.println("college:"+ s1.getCollege());

		student s2 = new student();
		s2.setName("raj");
		s2.setRollno(145);
		System.out.println("name:" + s2.getName());
		System.out.println("rollno:" + s2.getRollno());
		System.out.println("college:" + s2.getCollege());
	}

}
