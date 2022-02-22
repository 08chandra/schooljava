package sharat.cs.practice.strings;

import java.util.Scanner;

public class StringManipulationPractice {

	public static void main(String[] args) {
		// basic menu
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		while (true) {
			System.out.println("\nSelect a choice" + "\nEXIT = 1" + "\nISBN  = 2" + "\nHTML = 3");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Program closed");
				System.exit(0);
			case 2:
				System.out.println("Please enter your 13-digit ISBN number");
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();
				isValidISBN(input);
				break;
			case 3:

				System.out.println("Please enter your HTML tag.");
				Scanner scan1 = new Scanner(System.in);
				String input1 = scan1.nextLine();
				removeTag(input1);
				break;
			default:
				System.out.println("That is not a choice");
			}
		}
	}

	private static void isValidISBN(String input) {

		int sum = 0;

		if (input.length() == 13) {

			for (int i = 0; i < 13; i++) {
				int num = Integer.parseInt(String.valueOf(input.charAt(i)));

				if (i % 2 == 1) {
					sum = sum + (num * 3);
				} else {
					sum = sum + num;
				}
			}

			// System.out.println("ISBN ["+input+" ] total sum : "+sum);

		} else {
			System.out.print("Invalid Length ISBN has to be 13 numbers long.");
		}

		if (sum % 10 == 0) {
			System.out.print("Your ISBN number -> " + input + " is valid.");
		} else {
			System.out.print("Your ISBN number -> " + input + " is invalid.");

		}

	}

	private static void removeTag(String input) {

		String htmltag = input.trim(); // <b>is valid html tag</b>
		String startingHtmlTag = ""; // <b>
		String endHtmlTag = ""; // </b>
		// <b>is valid html tag</b>
		for (int i = 0; i < htmltag.length(); i++) {
			char element = input.charAt(i);
			// first element always is '<' else wrong html input
			if (i == 0 && '<' != element) {
				System.out.print("");
				break;
			}

			if (i == 0 && '<' == element) {
				startingHtmlTag = startingHtmlTag + element;
				endHtmlTag = endHtmlTag + element + "/";
			} else {
				startingHtmlTag = startingHtmlTag + element; // <b>
				endHtmlTag = endHtmlTag + element; // </b>
			}
			if ('>' == element) {
				break;
			}
		}

		String res = htmltag.replace(startingHtmlTag, "");// is valid html
															// tag</b>
		if (res.endsWith(endHtmlTag)) {
			res = res.replace(endHtmlTag, ""); // is valid html tag

			System.out.print("Your HTML tag is valid. "
					+ "The next line is you string without the HTML tags.\n");
			System.out.print(res);
		} else {
			System.out.print("Your HTML tags are invalid. input ->  " + input + " ");
		}

	}
}