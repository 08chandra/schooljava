package quadratics;

import java.awt.event.InputEvent;
import java.util.Scanner;



public class Quadratics {

	public static void main(String[] args) {
		char quit = 'y';
		String input;
		int choice = 0;

		Scanner scan = new Scanner(System.in);

		while (quit != 'x') {
			System.out.println("\n");
			System.out.println(" Please choose a number" + "\n1. Exit program = 1" + "\n2. Quadtratics Calculator = 2");
			choice = scan.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Program closed");
				System.exit(0);
				break;
			case 2:
				Scanner scanner = new Scanner(System.in);
				int a = 0;
				int b = 0;
				int c = 0;
				double root1, root2;

				System.out.println(
						" Please enter the value of a, b, and c from a quadratic equation in standard form (ax^2 + bx + c = 0).");

				System.out.println("a : ");
				a = scanner.nextInt();

				System.out.println("b : ");
				b = scanner.nextInt();

				System.out.println("c : ");
				c = scanner.nextInt();

				Double a2 = Double.valueOf(a);
				Double b2 = Double.valueOf(b);
				Double c2 = Double.valueOf(c);

				double d = b * b - 4 * a * c;

				if (d > 0) {
					root1 = (-b + Math.sqrt(d)) / (2 * a); // real and different
															// roots
					root2 = (-b - Math.sqrt(d)) / (2 * a);

					System.out.format(
							" %.2f and  %.2f are the roots of the quadratic equation with a = %.2f, b = %.2f, and c = %.2f",
							root1, root2, a2, b2, c2);
				}

				else if (d == 0) {
					root1 = root2 = -b / (2 * a); // real and equal roots

					System.out.format("root1 = root2 = %.2f;", root1);
				}

				else {
					double real = -b / (2 * a); // if roots aren't real
					double imaginary = Math.sqrt(-d) / (2 * a);

					System.out.printf(
							" %.2f+-%.2fi are the roots of the quadratic euqation with a = %.2f, b = %.2f, and c = %.2f",
							real, imaginary, a2, b2, c2);
					break;

				}
			default:
				System.out.println("That is not a choice please try again.");

			}

		}

	}

}





























