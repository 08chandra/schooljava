package twitter;

import java.util.Scanner;

public class Twitter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char hashtag = '#';
		char attributions = '@';

		boolean flag = false;
		while (!flag) {
			System.out.println("Please enter a tweet");
			String x = scanner.nextLine();
			if (x.length() > 140) {
				String remainder = x.substring(140);
				int remainderlength = remainder.length();
				System.out.println("Error your tweet has more than 140 characters." + " \n  Excess Characters("
						+ remainderlength + ")");
				continue;

			}

			System.out.println("Length Correct");

			Twitter twitter = new Twitter();

			int numberOfHashtags = twitter.countTags(x, hashtag); // number
																	// of #
			System.out.println("Number of Hashtags: " + numberOfHashtags);

			int numberOfAttributions = twitter.countAts(x, attributions); // number
																			// of
																			// @
			System.out.println("Number of Attributions : " + numberOfAttributions);

			String xlowercase = x.toLowerCase();

			int count3 = (xlowercase.split("http://", -1).length) - 1; // number
																		// of
																		// http
																		// links

			System.out.println("Number of Links: " + count3);

			flag = true;
		}

	}

	private int countAts(String input, char attributions) {
		int num = 0;
		int index = 0;
		while (index < input.length() - 1 && input.indexOf(("@"), index) >= 0)

		{
			index = input.indexOf('@', index);
			if (index < input.length() - 1 && input.charAt(index + 1) != ' ')
				if (index < input.length() - 1 && input.charAt(index + 1) != '	') {
					num++;
					index++;

				}
			index++;

		}
		return num;
	}

	private int countTags(String input, char attributions) {
		int num = 0;
		int index = 0;
		while (index < input.length() - 1 && input.indexOf(("#"), index) >= 0)

		{
			index = input.indexOf('#', index);
			if (index < input.length() - 1 && input.charAt(index + 1) != ' ')
				if (index < input.length() - 1 && input.charAt(index + 1) != '	') {
					num++;
					index++;

				}
			index++;

		}
		return num;
	}
}
