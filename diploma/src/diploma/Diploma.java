package diploma;

public class Diploma {

	private String student = "";
	private String course = "";

	public Diploma() {

	}

	public Diploma(String student, String course) {
		this.student = student;
		this.course = course;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String toString() {
		return "This certifies that " + student + "\nhas completed a course in " + course;
	}

}
