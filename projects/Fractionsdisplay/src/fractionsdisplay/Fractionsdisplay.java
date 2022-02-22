package fractionsdisplay;

import java.util.Scanner;

public class Fractionsdisplay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Please type a fraction.");
			String frac = scan.nextLine();

			fracSimplifier(frac);

		}

	}

	private static void fracSimplifier(String frac) {

		int slash = frac.indexOf('/'); // /8

		String numstring = "";
		String denstring = "";

		if (slash != -1) {
			numstring = frac.substring(0, slash).trim();
			denstring = frac.substring(slash + 1).trim();
		} else {
			System.out.println("Your simplified fractions -> " + frac + ".");
			return;
		}

		int den = 0;
		int num = 0;
		boolean isNumNegative = false;
		boolean isDenNegative = false;
		try {
			int numNegIndex = numstring.indexOf('-');
			num = Integer.parseInt(numstring);
			den = Integer.parseInt(denstring);
			if (numNegIndex != -1) {
				isNumNegative = true;
				num = Integer.parseInt(numstring.substring(numNegIndex + 1));
			}
			int denNegIndex = denstring.indexOf('-');
			if (denNegIndex != -1) {
				isDenNegative = true;
				den = Integer.parseInt(denstring.substring(denNegIndex + 1));
			}

		} catch (NumberFormatException e) {
			System.out.println(" " + frac + " is a invalid entry. ");
			return;
		}
		if (num == 0) {
			System.out.println("Your fraction - > " + frac + "  is equal to 0.");
			return;
		}
		if (den == 0) {
			System.out.println("Your fraction is undefined.");
			return;
		}

		if (num < -2000000000 || num > 2000000000 || den < -2000000000 || den > 2000000000) {
			System.out.println("The numerator and denominator of your fraction can not be greater than. ");
			return;
		}

		int gcd = 0;
		for (int x = 1; x <= num && x <= den; x++) {
			if (num % x == 0 && den % x == 0) {
				gcd = x;
			}
		}

		if (gcd != 0) {
			String res = "";
			if (den / gcd == 1) {
				res = "" + num / gcd;
			} else {
				res = "" + num / gcd + "/" + den / gcd;
			}

			if (!(isNumNegative && isDenNegative)) {
				res = "-" + res;
			}

			System.out.println("Your simplified fractions -> " + res);

		}
	}
}
