package fraction2;

public class Fraction {

	private int num;
	private int den;

	public Fraction() { // default constructor
		this.num = 0;
		this.den = 1;
	}

	public Fraction(int n, int d) {
		this.num = n; // argument comprehensive constructor
		this.den = d;
	}

	public Fraction(int input) { // integer constructor
		this.num = input;
	}

	public int getNum() { // getters and setters for numerator and denominator
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public Fraction add(Fraction f) {
		Fraction result = new Fraction();
		result.setDen(Math.multiplyExact(this.getDen(), f.getDen()));
		result.setNum(Math.multiplyExact(f.getDen(), this.getNum()) + Math.multiplyExact(f.getNum(), this.getDen()));
		result.simplify();
		return result;
	}

	public Fraction subtract(Fraction f) {
		Fraction result = new Fraction();

		result.setDen(Math.multiplyExact(this.getDen(), f.getDen()));
		result.setNum(Math.multiplyExact(f.getDen(), this.getNum()) - Math.multiplyExact(f.getNum(), this.getDen()));
		result.simplify();
		return result;
	}

	public Fraction multiply(Fraction f) {
		Fraction result = new Fraction();
		result.setNum(Math.multiplyExact(this.getNum(), f.getNum()));
		result.setDen(Math.multiplyExact(this.getDen(), f.getDen()));
		this.simplify();
		return result;
	}

	public Fraction divide(Fraction f) {
		Fraction result = new Fraction();
		result.setNum(Math.multiplyExact(this.getNum(), f.getDen()));
		result.setDen(Math.multiplyExact(this.getDen(), f.getNum()));
		result.simplify();
		return result;
	}

	public void simplify() {

		if (this.getNum() == 0 || this.getDen() == 0) {
			return;
		}
		int gcd = 1; // simplifies fractions
		int num = this.getNum();
		int den = this.getDen();

		if (num < 0) {
			num = num * (-1);
		}
		if (den < 0) {
			den = den * (-1);
		}
		for (int x = 1; x <= num && x <= den; x++) {
			if (num % x == 0 && den % x == 0) {
				gcd = x;
			}
		}

		int numRes = this.getNum() / gcd;
		int denRes = this.getDen() / gcd;
		this.setNum(numRes);
		this.setDen(denRes);
		if (this.getNum() < 0 && this.getDen() < 0) {
			this.setNum(numRes * (-1));
			this.setDen(denRes * (-1));
		}
	}

	@Override
	public String toString() {
		if (this.den == 0) {
			return "undefined";
		}
		this.simplify();

		int num1 = this.getNum();
		int den1 = this.getDen();

		if (num1 < 0) {
			num1 = num1 * (-1);
		}
		if (den1 < 0) {
			den1 = den1 * (-1);
		}

		String finalFrac = "";
		if (num1 == 0) {
			finalFrac = "0";
		} else if (num1 == den1 || den1 == 1) {
			finalFrac = "" + this.getNum() * this.getDen();
		} else if (this.getDen() < -1) {
			finalFrac = -1 * this.getNum() + "/" + den1;
		} else {
			finalFrac = this.getNum() + "/" + this.getDen();
		}

		return finalFrac;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		this.simplify(); // checks if fractions are equal or not

		Fraction f = (Fraction) obj;
		f.simplify();

		if (this.getNum() == f.getNum() && this.getDen() == f.getDen()) {
			return true;
		}
		return false;
	}

}
