package com.schoolclasses;

public class Student extends Person {
	public static int studentId = 0;
	private int level;

	public Student() {

	}

	public Student(String fName, String lName, int gLevel) {
		this.level = gLevel;
		if (gLevel < 0 || gLevel > 12) {
			this.level = 0;
		}
		setLastName(lName);
		setFirstName(fName);

		studentId = studentId + 1;
	}

	public int getLevel() {
		return this.level;
	}

	public String toString() {
		return super.toString() + "\n   Grade Level: " + this.getLevel() + "\n   ID #: " + studentId;
	}

}
