package fraction2;

public class Fraction_old {

	private int num;
	private int den;

	public Fraction_old() {  // default constructor
		this.num = 0;
		this.den = 1;
	}

	public Fraction_old(int n, int d) {
		this.num = n;  //argument comprehensive constructor 
		this.den = d;
		this.num = 0;
		this.den = 1;
		
	}

	public Fraction_old(int input) { // integer constructor
		this.num = input;
	}

	public int getNum() {                        // getters and setters for numerator and denominator
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

	public Fraction add(Fraction fr1, Fraction fr2) {
		Fraction resFr = new Fraction();
		if (fr1.getDen() == 0 || fr2.getDen() == 0) {
			resFr.setDen(0);
		} else {
			if (fr1.getNum() == 0) {               //used for adding two fractions
				return fr2;
			} else if (fr2.getNum() == 0) {
				return fr1;
			}
			resFr.setDen(Math.multiplyExact(fr1.getDen(), fr2.getDen()));
			resFr.setNum(
					Math.multiplyExact(fr2.getDen(), fr1.getNum()) + Math.multiplyExact(fr2.getNum(), fr1.getDen()));
		}
		return resFr;

	}

	public Fraction subtract(Fraction fr1, Fraction fr2) {
		Fraction resFr = new Fraction();
		if (fr1.getDen() == 0 || fr2.getDen() == 0) {
			resFr.setDen(0);
		} else if (fr1.getNum() == 0 && fr2.getNum() != 0) {
			resFr = fr2;                                           //used for subtracting two fractions
		} else if (fr2.getNum() == 0 && fr1.getNum() != 0) {
			resFr = fr1;
		} else if (fr1.getNum() != 0 && fr2.getNum() != 0) {
			resFr.setDen(Math.multiplyExact(fr1.getDen(), fr2.getDen()));
			resFr.setNum(
					Math.multiplyExact(fr2.getDen(), fr1.getNum()) - Math.multiplyExact(fr2.getNum(), fr1.getDen()));
		}
		return resFr;
	}

	public Fraction divide(Fraction fr1, Fraction fr2) {
		Fraction resFr = new Fraction();
		if (fr1.getDen() == 0 || fr2.getDen() == 0) {
			resFr.setDen(0);                                         //used for dividing two fractions
		} else {
			resFr.setNum(Math.multiplyExact(fr1.getNum(), fr2.getDen()));
			resFr.setDen(Math.multiplyExact(fr1.getDen(), fr2.getNum()));
		}
		return resFr;
	}

	public Fraction multiply(Fraction fr1, Fraction fr2) {
		Fraction resFr = new Fraction();
		if (fr1.getDen() == 0 || fr2.getDen() == 0) {                       //used for multiplying  two fractions
			resFr.setDen(0);
		} else {
			resFr.setNum(Math.multiplyExact(fr1.getNum(), fr2.getNum()));
			resFr.setDen(Math.multiplyExact(fr1.getDen(), fr2.getDen()));
		}
		return resFr;
	}

	public void simplify() {
		if (this.getNum() == 0 || this.getDen() == 0) {
			return;
		}
		int gcd = 1;                                                         //simplifies fractions
		for (int x = 1; x <= this.getNum() && x <= this.getDen(); x++) {
			if (this.getNum() % x == 0 && this.getDen() % x == 0) {
				gcd = x;
			}
		}
		int numRes = this.getNum() / gcd;
		this.setNum(numRes);
		int denRes = this.getDen() / gcd;
		this.setDen(denRes);
	}

	@Override
	public String toString() {
		if (this.den == 0) {
			System.out.println("The fraction is undefined");
			return "undefined";
		}
		int gcd = 1;                                              //simplifies and sees if the fraction is undefined 
		for (int x = 1; x <= this.num && x <= this.den; x++) { //or if it is a whole number or if it equal  to zero 
			if (this.num % x == 0 && this.den % x == 0) {//and it returns the final fraction
				gcd = x;
			}
		}
		int resultnum = this.getNum() / gcd;
		int resultden = this.getDen() / gcd;
		String finalFrac = "";
		if (resultnum == 0) {
			finalFrac = "0";
		} else if (resultden == 1) {
			finalFrac = "" + this.getNum();
		} else {
			finalFrac = (this.num / gcd) + "/" + (this.den / gcd);
		}
		return finalFrac;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		this.simplify();    //checks if fractions are equal or not

		Fraction f = (Fraction) obj;
		f.simplify();

		if (this.getNum() == f.getNum() && this.getDen() == f.getDen()) {
			return true;
		}
		return false;
	}

}
