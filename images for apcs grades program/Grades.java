//author: Sharat Shailendri
//date last updated: September 13, 2020
// What's my grade program with error checking and menu
// program description: This program calculates a final grade test average and quiz average given 2 test grades, 3 quiz grades, and a homework grade average.





package fcps.whs.grdten.task.grades;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double tscore1 = 0,tscore2 = 0,average1 ;
		double qscore1 = 0,qscore2 = 0,qscore3 = 0,average2 ;
		double homeworkaverage = 0;
		double finalgrade;
		String score;
		
		System.out.println("----------------------------");
		System.out.println("------Grade Calculator------");
		System.out.println("----------------------------");
		
		/********************************************************************************************/
		/********************************************************************************************/
		
		
		
		System.out.println("Enter your test grades.");
		int a = 1;
		while(a < 2){
			System.out.print("Test1 : ");
			score = scanner.next();
			try{
				tscore1 = Double.valueOf(score);				// makes characters invalid
			}catch( NumberFormatException nfe){				
				System.out.println("ERROR");  
				System.out.println("Your score should be a number not a character.");
				System.out.println("Please enter your  test score again.");
				
				continue;
			}
		if(tscore1 < 0 || tscore1 > 100 ){                       // makes numbers below 0 and above 100 invalid
			System.out.println("ERROR");
			System.out.println("Your score can not be less than 0 or greater than 100.");
			System.out.println("Please enter your test score again.");
			
			continue;
			} 
		
		a++;
		}

		
		int b = 1;
		while(b < 2){
			System.out.print("Test2 : ");
			score = scanner.next();
			try{
				tscore2 = Double.valueOf(score);				// makes characters invalid
			}catch( NumberFormatException nfe){				
				System.out.println("ERROR");  
				System.out.println("Your score should be a number not a character.");
				System.out.println("Please enter your test score again.");
				
				continue;
			}
		if(tscore2 < 0 || tscore2 > 100 ){                                // makes numbers below 0 and above 100 invalid
			System.out.println("ERROR");
			System.out.println("Your score can not be less than 0 or greater than 100.");
			System.out.println("Please enter your  test score again.");
			
			continue;
			} 
		
		b++;
		}
		
	
		average1 = (tscore1 + tscore2) / 2;
		System.out.printf("Average test score is : %f%%", average1); // average test score
		
		/********************************************************************************************/
		/********************************************************************************************/
		
		System.out.print("\n\n"); // used to create spaces between the text		
		
		System.out.println("Enter your quiz grades.");
		int c = 1;
		while(c < 2){
			System.out.print("Quiz1 : ");
			score = scanner.next();
			try{
				qscore1 = Double.valueOf(score);				// makes characters invalid
			}catch( NumberFormatException nfe){				
				System.out.println("ERROR");  
				System.out.println("Your score should be a number not a character.");
				System.out.println("Please enter your quiz score again.");
				
				continue;
			}
		if(qscore1 < 0 || qscore1 > 100 ){
			System.out.println("ERROR");                  // makes numbers below 0 and above 100 invalid
			System.out.println("Your score can not be less than 0 or greater than 100.");
			System.out.println("Please enter your  quiz score again.");
			
			continue;
			} 
		
		c++;
		}
		
		int d = 1;
		while(d < 2){
			System.out.print("Quiz2 : ");
			score = scanner.next();
			try{
				qscore2 = Double.valueOf(score);				
			}catch( NumberFormatException nfe){				// makes characters invalid
				System.out.println("ERROR");  
				System.out.println("Your score should be a number not a character.");
				System.out.println("Please enter your quiz score again.");
				
				continue;
			}
		if(qscore2 < 0 || qscore2 > 100 ){
			System.out.println("ERROR");                      // makes numbers below 0 and above 100 invalid
			System.out.println("Your score can not be less than 0 or greater than 100.");
			System.out.println("Please enter your  quiz score again.");
			
			continue;
			} 
		
		d++;
		}
		
		int e = 1;
		while(e < 2){
			System.out.print("Quiz3 : ");
			score = scanner.next();
			try{
				qscore3 = Double.valueOf(score);				// makes characters invalid
			}catch( NumberFormatException nfe){				
				System.out.println("ERROR");  
				System.out.println("Your score should be a number not a character.");
				System.out.println("Please enter your quiz score again.");
				
				continue;
			}
		if(qscore3 < 0 || qscore3 > 100 ){
			System.out.println("ERROR");                        // makes numbers below 0 and above 100 invalid
			System.out.println("Your score can not be less than 0 or greater than 100.");
			System.out.println("Please enter your  quiz score again.");
			
			continue;
			} 
		
		e++;
		}
		
		average2 = (qscore1 + qscore2 + qscore3) / 3;
		System.out.printf("Average quiz score is : %f%%", average2); //average quiz score

		/********************************************************************************************/
		/********************************************************************************************/
		
		System.out.print("\n\n"); // used to create spaces between text
		
		System.out.println("Enter the average homework score.");
		
		int f = 1;
		while(f < 2){
			System.out.print("Homework Average : ");
			score = scanner.next();
			try{
				homeworkaverage = Double.valueOf(score);				// makes characters invalid
			}catch( NumberFormatException nfe){				
				System.out.println("ERROR");  
				System.out.println("Your homework average should be a number not a character.");
				System.out.println("Please enter your homework average again.");
				
				continue;
			}
		if(homeworkaverage < 0 || homeworkaverage > 100 ){
			System.out.println("ERROR");                                // makes numbers below 0 and above 100 invalid
			System.out.println("Your homework average can not be less than 0 or greater than 100.");
			System.out.println("Please enter your homework average again.");
			
			continue;
			} 
		
		f++;
		}
		
		
		
		/********************************************************************************************/
		/********************************************************************************************/
		
		finalgrade = ((average1 * 50 / 100) + (average2 * 30 / 100) + (homeworkaverage * 20 / 100)); // math to get final score from the averages
		
		System.out.printf("Your final grade is : %f%%", finalgrade); // final score 
		
		scanner.close(); // scanner closed
		
		System.exit(1);
	}

	
	}
	
	
	

	  