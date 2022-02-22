package com.schoolclasses;

public class HighSchoolStudent extends Student {
	private double gpa;

	public HighSchoolStudent(String fName, String lName, int gLevel, double gpa) {
		super(fName, lName, gLevel);
		if (gpa < 1 || gpa > 5) {
			this.gpa = 0.0;
		} else {
			this.gpa = gpa;
		}
	}

	public String toString() {
		return super.toString() + "\n   GPA: " + gpa;
	}
}
