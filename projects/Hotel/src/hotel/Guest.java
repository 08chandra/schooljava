package hotel;

public class Guest {
	private String name;
	private boolean EmStatus;

	public Guest(String n, boolean d) {
		name = n;
		EmStatus = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public void setEmstatus(boolean d) {
		EmStatus = d;
	}

	public boolean getEmstatus() {
		return EmStatus;
	}
}
