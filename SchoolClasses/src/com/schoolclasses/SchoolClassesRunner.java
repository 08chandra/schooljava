package com.schoolclasses;

import java.util.ArrayList;

public class SchoolClassesRunner {

	public static void main(String arg[]) {
		Person p = new Person("Steven", "Tyler");
		System.out.println(p);

		Student s = new Student("Joe", "Perry", 7);
		System.out.println(s);

		HighSchoolStudent h = new HighSchoolStudent("Tom", "Hamilton", 11, 3.67);
		System.out.println(h);

		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new HighSchoolStudent("Neil", "Peart", 11, 3.4));
		stu.add(new Student("Alex", "Lifeson", 4));
		stu.add(new HighSchoolStudent("Geddy", "Lee", 12, 1.7));
		stu.add(new HighSchoolStudent("Robert", "Plant", 12, 4.8));
		stu.add(new Student("John Paul", "Jones", 9));
		stu.add(new Student("Jimmy", "Page", 11));

		ArrayList<Teacher> tea = new ArrayList<Teacher>();
		tea.add(new Teacher("Ozzy", "Osbourne", "Home Ec"));
		tea.add(new Teacher("Tony", "Iommi", "Mathematics"));
		tea.add(new Teacher("Bill", "Ward", "Computer Science"));
		tea.add(new Teacher("Geezer", "Butler", "Chemistry"));
		tea.add(new Teacher("John", "Bonham", "Government"));
		tea.add(new Teacher("Brad", "Whitford", "English Composition"));

		School sch = new School(stu, tea);
		System.out.println(sch);

		System.out.println("\njust seniors: \n" + sch.getGradeLevel(12));

	}

}
