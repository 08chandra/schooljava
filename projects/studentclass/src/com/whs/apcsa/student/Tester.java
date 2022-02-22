package com.whs.apcsa.student;

public class Tester {
	public static void main(String[] args) {

		Student s = new Student();
		s.setSchool("WestField");
		s.setName("David");
		s.setGpa(3.6);
		s.setGradeLevel(10);
		s.setHours(200);
		System.out.println(s.toString());
		s.study();

		System.out.println("-----------used to seperate students-------------");
		Student s1 = new Student();
		s1.setName("joe");
		s1.setGradeLevel(12);
		System.out.println(s1.toString());
		s1.advance();

	}
}
