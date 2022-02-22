package com.schoolclasses;

public class Teacher extends Person {
	/**
	 * A String representing the academic subject taught by the teacher.
	 */
	private String subject;

	public Teacher() {

	}

	public Teacher(String fName, String lName, String subject) {
		super(fName, lName);
		this.subject = subject;
	}

	public String getSubject() {
		return this.subject;
	}

	public String toString() {
		return super.toString() + "\n   Subject: " + this.subject;
	}

}
