package minigolf;

import java.util.Scanner;

public class Minigolf {

	private int numofholeinone;
	static int[] arrInt = new int[18];

	public static void main(String[] args) {
		start();
		minigolf();
		printScore();
		totals();

	}

	private static void start() {
		System.out.println("Enter the number of strokes for each hole."); //start line
	}

	private static void minigolf() {

		for (int i = 0; i < arrInt.length; i++) {
			Scanner hole = new Scanner(System.in);
			int userinput = hole.nextInt();          // gets the user input for the score of each hole
			if (userinput > 6) {
				userinput = 6;
			}
			System.out.println("hole " + (i + 1) + ": " + userinput);
			arrInt[i] = userinput;

		}

	}

	private static void printScore() {
		StringBuilder joiner = new StringBuilder();
		for (int i = 0; i < arrInt.length; i++) {
			joiner.append(arrInt[i] + "  ");                                    // prints all the scores
		}
		System.out.println("\n");
		System.out.println("Hole :  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18");
		System.out.println("------------------------------------------------------------");
		System.out.println("Score:  " + joiner.toString());
	}

	private static void totals() {
		int f9score = 0;
		int totalscore = 0;
		int b9score = 0;
		int holeinonecnt = 0;
		for (int i = 0; i < arrInt.length; i++) {              // gets the total score, the sum of the first 9 and the last 9 
			                                                   // also gets the number of holes in one
			if (i < 9) {
				f9score += arrInt[i];
			}
			if (i > 8) {
				b9score += arrInt[i];
			}
			if (arrInt[i] == 1) {
				holeinonecnt++;
			}
		}

		totalscore = f9score + b9score;
		System.out.println("\n");
		System.out.println("Front nine score: " + f9score);
		System.out.println("Back nine score: " + b9score);
		System.out.println("Total score: " + totalscore);
		System.out.println("You scored " + holeinonecnt + " holes-in-one.");
	}

}
