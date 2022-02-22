package fraction2;

import java.util.Scanner;

public class FractionTest2 {
	public static void main(String[] args) {
		Fraction f1, f2, f3;

		f2 = new Fraction(3, 5);
		f3 = new Fraction(-3, 2);

		f1 = f2.add(f3);
		System.out.println(f2 + " + " + f3 + " = " + f1);
		f1 = f2.subtract(f3);
		System.out.println(f2 + " - " + f3 + " = " + f1);
		f1 = f2.multiply(f3);
		System.out.println(f2 + " * " + f3 + " = " + f1);
		f1 = f2.divide(f3);
		System.out.println(f2 + " / " + f3 + " = " + f1);

	}
}