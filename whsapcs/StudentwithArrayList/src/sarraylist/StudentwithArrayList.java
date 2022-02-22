package sarraylist;

import java.math.*;
import java.util.*;

public class StudentwithArrayList {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Student> roster = new ArrayList<>();
		StudentwithArrayList studentroster = new StudentwithArrayList();
		while (true) {
			System.out.println("\nChoose from the following options: ");
			System.out.println("1. add a student (secret option 8--fill a class of 10 random students)");
			System.out.println("2. delete a student");
			System.out.println("3. display student roster");
			System.out.println("4. display student information");
			System.out.println("5. display honor roll");
			System.out.println("6. display grade level");
			System.out.println("7. display roster with full information");
			System.out.println("0. exit");

			int choice = scan.nextInt();
			int studentId = 0;
			switch (choice) {

			case 1:
				studentroster.addStudent(roster);
				break;
			case 2:
				System.out.println("Enter the id of the student you would like to delete.");
				studentId = scan.nextInt();
				Student deletedStudent = studentroster.deleteStudent(studentId, roster);
				System.out.println("deleted student: " + deletedStudent.toString());
				break;
			case 3:
				studentroster.displayRoster(roster);
				break;
			case 4:
				System.out.println("Enter the id of the student you would like to display.");
				studentId = scan.nextInt();
				studentroster.displayStudent(studentId, roster);
				break;
			case 5:
				System.out.println("Honor Roll: ");
				studentroster.displayHonors(roster);
				break;
			case 6:
				System.out.println("Which grade level do you want to display?");
				int grade = scan.nextInt();
				studentroster.displayByGrade(grade, roster);
				break;
			case 7:
				studentroster.displayFullRoster(roster);
				break;
			case 8:
				for (int stu = 0; stu < 10; stu++) {
					String name = "Student" + stu;
					double gpa = studentroster.randGpa();
					int grd = studentroster.randGrade();
					Student randomStudent = new Student(name, gpa, grd);
					roster.add(randomStudent);

				}
				break;
			case 0:
				System.exit(0);
				break;

			default:

				break;

			}

		}

	}

	void addStudent(ArrayList<Student> roster) {
		// adds a new student to the class. If the student is already in the
		// class, no change is made.
		// Method uses the comprehensive constructor.
		System.out.println("Enter name: ");
		String name = scan.next();
		System.out.println("Enter grade level: ");
		int gradeLevel = scan.nextInt();
		System.out.println("Enter gpa: ");
		double gpa = scan.nextDouble();
		Student newStudent = new Student(name, gpa, gradeLevel);
		boolean studentFound = false;
		for (Student stu : roster) {
			if (newStudent.getName().equals(stu.getName())) {
				studentFound = true;
				break;

			}
		}
		if (!studentFound) {
			roster.add(newStudent);
		}

	}

	Student deleteStudent(int id, ArrayList<Student> roster) {
		// deletes a particular student as identified by student id. Returns the
		// deleted object. If student
		// is not in class, returns null.
		Student deletedStudent = null;
		for (Student stu : roster) {
			if (stu.getStudentId() == id) {
				deletedStudent = stu;
				break;
			}
		}
		roster.remove(deletedStudent);
		return deletedStudent;
	}

	void displayRoster(ArrayList<Student> roster) {
		// displays the names of all the students
		for (Student stu : roster) {
			System.out.println(stu.getName());
		}
	}

	void displayStudent(int id, ArrayList<Student> roster) {
		// displays a particular student’s info as identified by student id
		boolean studentFound = false;
		for (Student stu : roster) {
			if (stu.getStudentId() == id) {
				studentFound = true;
				System.out.println(stu.toString());
				break;
			}
		}
		if (!studentFound) {
			System.out.println("Student Not Found");
		}
	}

	void displayHonors(ArrayList<Student> roster) {
		// display the students on the honor roll (gpa > 3.5)
		boolean studentHonorsFound = false;
		for (Student stu : roster) {
			if (stu.getGpa() > 3.5) {
				studentHonorsFound = true;
				System.out.println(stu.getName());
			}
		}
		if (!studentHonorsFound) {
			System.out.println("Honors Student Not Found");
		}
	}

	void displayByGrade(int grade, ArrayList<Student> roster) {
		// display all the students in a particular grade
		boolean gradeLvStudentFound = false;
		for (Student stu : roster) {
			if (stu.getGradeLevel() == grade) {
				gradeLvStudentFound = true;
				System.out.println(stu.getName());
			}
		}
		if (!gradeLvStudentFound) {
			System.out.println("Students in " + grade + " grade not found.");
		}

	}

	void displayFullRoster(ArrayList<Student> roster) {
		// display full roster
		for (Student stu : roster) {
			System.out.println(stu.toString());
		}
	}

	private int randGrade() {
		int grade = 0;
		while (true) {
			double randomval = Math.random();
			grade = (int) (randomval * 20);
			if (grade >= 9 && grade <= 12) {
				break;
			}
		}
		return grade;
	}

	private double randGpa() {
		Double generatedDouble = 0.0d;
		while (true) {
			generatedDouble = (new Random().nextDouble()) * 4;
			if (generatedDouble >= 0 && generatedDouble <= 4) {
				break;
			}
		}

		return BigDecimal.valueOf(generatedDouble).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	static class Student {

		private String name;
		private int studentId;
		private double gpa;
		private int gradeLevel;

		private static int startValue = 1000000;

		public Student() {
			startValue++;
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

		@Override
		public String toString() {
			return name + " " + studentId + " " + gradeLevel + " " + gpa;
		}

	}

}
