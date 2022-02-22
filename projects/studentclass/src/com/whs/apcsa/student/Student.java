package com.whs.apcsa.student;

public class Student {

	private String school;
	private String name;
	private int studentId;
	private double gpa;
	private int gradeLevel;
	private int hours;
	private static int startValue = 1000000;

	public Student() {
		startValue++;
		this.school = "unassigned";
		this.name = "unassigned";
		this.studentId = startValue;
		this.gradeLevel = 0;
		this.gpa = 0.0;
	}
	public Student(String name, double gpa, int gradeLevel) {
		startValue++;
		this.name = name;
		this.studentId = startValue;
		this.gpa = gpa;
		this.gradeLevel = gradeLevel;
	}
	public Student(String school, String name, double gpa, int gradeLevel, int hours) {
		startValue++;
		this.school = school;
		this.name = name;
		this.studentId = startValue;
		this.gpa = gpa;
		this.gradeLevel = gradeLevel;
		this.hours = hours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void advance() {
		this.gradeLevel += 1;
		if (this.gradeLevel == 13) {
			System.out.println("Student has graduated");
		}
	}
	public int graduate() {
		return 13 - this.gradeLevel;
	}
	public void study() {
		System.out.println("" + name + " has studied " + hours + " hours.");
	}
	@Override
	public String toString() {
		return "school :" + school + ", Student Name: " + name + ", Student Id: " + studentId + ", GPA : " + gpa
				+ ", Grade Level: " + gradeLevel + ", study hours: " + hours;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Student st = (Student) obj;
		if (this.getStudentId() == st.getStudentId()) {
			return true;
		}
		return false;
	}
}
