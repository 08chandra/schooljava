//author: Sharat Shailendri
//date last updated: September 13, 2020
// What's my grade program with error checking and menu
// program description: This program calculates a final grade test average and quiz average given 2 test grades, 3 quiz grades, and a homework grade average.

package fcps.whs.grdten.task.grades;

import java.util.Scanner;

public class GradesN {

	public static void main(String[] args) {

		GradesN grades = new GradesN();
		Scanner scanner = new Scanner(System.in);
		double testAverage = grades.calculateAverage("Test", 2,scanner);
		double quizAverage = grades.calculateAverage("Quiz", 3,scanner);
		double homworkAverage = grades.calculateAverage("Homework", 1,scanner);

		/********************************************************************************************/
		/********************************************************************************************/
		// math to get final score from the averages
		double finalgrade = ((testAverage * 50 / 100) + (quizAverage * 30 / 100) + (homworkAverage * 20 / 100));
		 // final score
		System.out.printf("Your final grade is : %f%%", finalgrade);
		scanner.close(); // scanner closed
		System.exit(0);
	}

	/**
	 * @param type
	 * @param totalTests
	 * @return
	 */
	private double calculateAverage(String type, int totalTests,Scanner scanner) {
		double average = 0, totals = 0;
		int iteration = 1;
		System.out.println("Enter your " + type + " score/grade");
		
		while (iteration <= totalTests) {
			System.out.print("\n"+type + "" + iteration + " : ");
			//read student input
			String input=scanner.next();
			
			//score declaration
			double score=0;
			
			//validate input string as double value
			try{
				score = Double.valueOf(input);				
			}catch( NumberFormatException nfe){				
				System.out.println(
						"Your score/grade should be double value, please enter your " + type + " score/grade again");
				nfe.printStackTrace();
				System.out.println("\n");
				continue;
			}
			//validate score should between 0 to 100
			if (score < 0 || score > 100) {
				System.out.println(
						"Your score/grade should between 0 to 100, please enter your " + type + " score/grade again");
				continue;
			}
			//add to totals
			totals += score;
			//increment iteration
			iteration++;
		}		
		//average totals
		average = totals / totalTests;
		System.out.println("Average of " + type + " score/grade is : " + average);
		
		return average;
	}

}
