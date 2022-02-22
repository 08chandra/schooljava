package animal;

public class Elephant extends Herbivore {
	private double tusks;

	public Elephant(String name, double tusks) {

		super("elephant", name);
		this.tusks = tusks;
	}

	public String toString() {
		return super.toString() + " with tusks " + this.tusks + " meters long";
	}
}
