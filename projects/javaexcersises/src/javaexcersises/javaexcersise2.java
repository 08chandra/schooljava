//2. Write a Java program to print the sum of two numbers




package javaexcersises;

import java.util.Scanner; // for problem 5

public class javaexcersise2 {

	public static void main(String[] args) {
		
		System.out.println(24+26);
		
		
		System.out.print("\n\n\n\n");
		//Don't use quotations when adding using println
		
		//3. Write a Java program to divide two numbers and print on the screen.
		
		System.out.println(21/3);
		
		System.out.print("\n\n\n\n");
		//Write a Java program to print the result of the following operations. Go to the editor
	/*	Test Data:
			a. -5 + 8 * 6
			b. (55+9) % 9
			c. 20 + -3*5 / 8
			d. 5 + 15 / 3 * 2 - 8 % 3
			Expected Output :
			43
			1
			19
			13 */
		System.out.println("a.");
		System.out.println(-5 + 9 * 6);
		System.out.println("b.");
		System.out.println((55+9) % 9);
		System.out.println("c.");
		System.out.println(20 + -3*5 / 8);
		System.out.println("d.");
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		
		System.out.print("\n\n\n\n");
		
		//5. Write a Java program that takes two numbers as input and display the product of two numbers.
		
		Scanner scanner = new Scanner(System.in);
		double number1,number2,productof1and2;
		System.out.println("Enter your two numbers");
		System.out.print("Number1: " );
		number1 = scanner.nextDouble();
		
		System.out.print("Number2: " );
		number2 = scanner.nextDouble();
		
		productof1and2 = (number1 * number2);
		System.out.printf("Here is the product of your two numbers : %f", productof1and2);
		
		System.out.print("\n\n\n\n");
		//6.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
		
		double number4,number5,m45,s45,d45,a45;
		System.out.println("Enter your two numbers");
		System.out.print("Your first number : ");
		number4 = scanner.nextDouble();
		System.out.print("Your second number : ");
		number5 = scanner.nextDouble();
		
		a45 = (number4 + number5);
		m45 = (number4 * number5);
		d45 = (number4 / number5);
		s45 = (number4 - number5);

		System.out.printf("Here is the product of your two numbers : %f", m45);
		System.out.print("\n\n");
		System.out.printf("Here is the sum of your two numbers : %f", a45);
		System.out.print("\n\n");
		System.out.printf("Here is the quotient of your two numbers : %f", d45);
		System.out.print("\n\n");
		System.out.printf("Here is the difference of your two numbers : %f", s45);
		
		
		
		//7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
		System.out.print("\n\n\n\n");
		
		
		
		
		double number,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
	 System.out.println("Hello please enter a number.");
	 System.out.print("Your Number: ");
     number = scanner.nextDouble();
     n1 = (number * 1);
     n2 = (number * 2);
     n3 = (number * 3);
     n4 = (number * 4);
     n5 = (number * 5);
     n6 = (number * 6);
     n7 = (number * 7);
     n8 = (number * 8);
     n9 = (number * 9);
     n10 = (number * 10);
     
     System.out.printf("Here is your number times 1 : %f", n1);
     System.out.print("\n");
     System.out.printf("Here is your number times 2 : %f", n2);
     System.out.print("\n");
     System.out.printf("Here is your number times 3 : %f", n3);
     System.out.print("\n");
     System.out.printf("Here is your number times 4 : %f", n4);
     System.out.print("\n");
     System.out.printf("Here is your number times 5 : %f", n5);
     System.out.print("\n");
     System.out.printf("Here is your number times 6 : %f", n6);
     System.out.print("\n");
     System.out.printf("Here is your number times 7 : %f", n7);
     System.out.print("\n");
     System.out.printf("Here is your number times 8 : %f", n8);
     System.out.print("\n");
     System.out.printf("Here is your number times 9 : %f", n9);
     System.out.print("\n");
     System.out.printf("Here is your number times 10 : %f", n10);
     
     
	}

}
