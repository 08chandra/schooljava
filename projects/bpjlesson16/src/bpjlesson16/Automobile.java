package bpjlesson16;

public class Automobile {

	public Automobile(double a) {
		milespergallon = a;
		gallons = 0;
	}

	public void fillUp(double y) {
		gallons += y;
	}

	public void takeTrip(double z) {
		gallons -= z / milespergallon;
	}

	public double reportFuel() {
		double x = gallons;
		return x;
	}

	public double milespergallon;
	public double gallons;
}


