package animal;

public class Animal {
	private String type;
	private String species;
	private String name;

	public Animal() {

	}

	public Animal(String type, String species, String name) {
		this.type = type;
		this.species = species;
		this.name = name;
	}

	public String toString() {
		return this.name + " the " + this.species + " is a " + this.type;
	}
}
