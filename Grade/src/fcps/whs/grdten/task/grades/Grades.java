package fcps.whs.grdten.task.grades;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double tscore1;
		double tscore2;
		double average1;
		double qscore1;
		double qscore2;
		double qscore3;
		double average2;
		double homeworkaverage;
		double finalgrade;

		System.out.println("Enter The First Test Score");
		tscore1 = scanner.nextDouble(); // test score 1

		System.out.println("Enter The Second Test Score");
		tscore2 = scanner.nextDouble(); // test score 2

		average1 = (tscore1 + tscore2) / 2;
		System.out.printf("Average Test Score is : %f%%", average1); // average test score

		
		System.out.print("\n\n"); // used to create spaces between the text		
		
		System.out.println("Enter The First Quiz Score");
		qscore1 = scanner.nextDouble(); // quiz score1

		System.out.println("Enter The Second Quiz Score");
		qscore2 = scanner.nextDouble(); // quiz score 2

		System.out.println("Enter The Third Quiz Score");
		qscore3 = scanner.nextDouble(); // quiz score 3

		average2 = (qscore1 + qscore2 + qscore3) / 3;
		System.out.printf("Average Quiz Score is : %f%%", average2); //average quiz score

		System.out.print("\n\n"); // used to create spaces between text
		
		System.out.println("Enter The Average Homework Score");
		homeworkaverage = scanner.nextDouble(); // average homework score

		finalgrade = ((average1 * 50 / 100) + (average2 * 30 / 100) + (homeworkaverage * 20 / 100)); // math to get final score from the averages
		
		System.out.printf("Your Final Grade Is : %f%%", finalgrade); // final score 
	}
	
	
}
