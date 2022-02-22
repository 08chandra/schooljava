package com.schoolclasses;

import java.util.ArrayList;

public class School {
	public ArrayList<Student> students = new ArrayList<Student>();
	public ArrayList<Teacher> teachers = new ArrayList<Teacher>();

	public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
		this.students = students;
		this.teachers = teachers;
	}

	public String getGradeLevel(int level) {
		String stu = "";
		for (Student st : students) {
			if (level == st.getLevel()) {
				stu += st.toString();
				stu += "\n";
			}
		}
		return stu;
	}

	public String toString() {
		String tfaculty = "";
		for (Teacher faculty : teachers) {
			tfaculty += faculty.toString();
			tfaculty += "\n";
		}
		String stu = "";
		for (Student st : students) {
			stu += st.toString();
			stu += "\n";
		}
		return "Faculty:\n" + tfaculty + "\nStudent Body:\n" + stu;
	}
}
