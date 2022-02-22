package bpjlesson15;

import java.io.*;
import java.util.*;

public class bpk {
	public String n;
	public double b;

	public static double depositamount(double b) {
		b = b + 505.22;
		return b;
	}

	public static double withdrawamount(double b) {
		b = b - 100;
		return b;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the amount of money:");
		double b = x.nextDouble();
		Scanner y = new Scanner(System.in);
		System.out.println("Enter the name:");
		String n = y.next();
		b = b + depositamount(0);
		System.out.println("\nThe amount of money left after depositing money is " + b);
		b = b + withdrawamount(0);
		System.out.println("\nThe " + n + " account balance is, " + b);
	}

	// b is balance and n is name
}
