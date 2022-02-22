package bib;

import java.util.Scanner;

public class jo {

	public static void main(String[] args) {

		boolean rsvp;
		rsvp = true;
		if (rsvp == true) {
			System.out.println("attending");

		} else {
			System.out.println("not attending");

		}
		Scanner scanner = new Scanner(System.in);

		int selection;
		System.out.println(
				"Please enter a number/dinner option. 1 = beef 2 = chicken 3 = pasta 4 and any other number  = fish");
		selection = scanner.nextInt();

		if (selection == 1) {
			System.out.println("beef");
		} else {
			if (selection == 2) {
				System.out.println("chicken");
			} else {
				if (selection == 3) {
					System.out.println("pasta");
				} else {
					if (selection == 4) {
						System.out.println("fish");
					} else {
						System.out.println("fish");
					}
				}
			}
		}
		String option1;
		

		switch (selection) {

		case 1:

			if (rsvp) {

				option1 = "Thanks for attending. You will be served beef.";

			} else {

				option1 = "Sorry you can't make it";

			}

			break;

		case 2:

			if (rsvp) {

				option1 = "Thanks for attending. You will be served chicken.";

			} else {

				option1 = "Sorry you can't make it";

			}

			break;

		case 3:

			if (rsvp) {

				option1 = "Thanks for attending. You will be served pasta.";

			} else {

				option1 = "Sorry you can't make it";

			}

			break;

		default:

			if (rsvp) {

				option1 = "Thanks for attending. You will be served fish.";

			} else {

				option1 = "Sorry you can't make it";

			}

			break;

		}
		String option2 = null;
		if (option1 == option2) {

			System.out.println("True");

		} else {

			System.out.println("False");

		}
	}
}