package diploma;

public class DiplomaWithHonors extends Diploma {

	public DiplomaWithHonors(String student, String course) {
		super(student, course);
	}

	public String toString() {
		return super.toString() + "\n***with honors***";
	}
}
