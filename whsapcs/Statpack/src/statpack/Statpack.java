package statpack;

import java.util.*;
public class Statpack {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] originalArray = new int[setSize()];

		System.out.println("Fill with\n" + "1. random numbers or\n" + "2. user entries?");
		int choice = in.nextInt();

		if (choice == 1)
			fillRandom(originalArray);
		else
			fillUser(originalArray);

		int[] sortedArray = copy(originalArray);
		Arrays.sort(sortedArray);

		double mean = computeMean(sortedArray);
		double median = computeMedian(sortedArray);
		// you can use this mode method header or define your own. If you write
		// a different
		// mode method (returns something other than a String) you'll need to
		// adjust the
		// displayStatistics method to work with your mode.
		String mode = computeMode(sortedArray);
		double standardDev = computeStandardDev(sortedArray);
		int range = computeRange(sortedArray);

		displayStatistics(originalArray, sortedArray, mean, median, mode, standardDev, range);

	}

	// ***********************************************************************************************
	public static void displayStatistics(int[] originalArray, int[] sortedArray, double mean, double median,
			String mode, double standardDev, int range) {
		System.out.println("original array:  ");
		displayArray(originalArray);
		System.out.println();
		System.out.println();
		System.out.println("sorted array:  ");
		displayArray(sortedArray);
		System.out.println();
		System.out.println();
		System.out.print("mean:  " + mean + "\n\n" + "median:  " + median + "\n\n" + "mode:  " + mode + "\n\n"
				+ "range:  " + range + "\n\n" + "standard deviation:  " + standardDev + '\n');
	}

	// ***********************************************************************************************
	public static void displayArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if ((i + 1) % 20 == 0)
				System.out.println();
		}
	}

	// ***********************************************************************************************
	public static int setSize() {
		System.out.println("Enter size of data set.");
		return in.nextInt();
	}

	// ***********************************************************************************************
	public static void fillRandom(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++)
			array[i] = rand.nextInt(array.length * 2) + 1;
	}

	// ***********************************************************************************************
	public static void fillUser(int[] array) {
		int temp;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number " + (i + 1) + ": ");
			array[i] = in.nextInt();
		}
	}

	// ***********************************************************************************************
	public static double computeMean(int[] array) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		double length = array.length;
		double average = sum / length;
		return average;
	}

	// ***********************************************************************************************
	public static double computeMedian(int[] array) {
		int position = 0;
		double median = 0.0;
		int length = array.length;
		if (length % 2 == 0) {
			position = (length / 2);
			int medVal1 = array[position - 1];
			int medVal2 = array[position];
			median = (medVal1 + medVal2) / 2.0;
		} else {
			position = ((length - 1) / 2) + 1;
			median = array[position - 1];
		}
		return median;
	}

	// ***********************************************************************************************
	public static String computeMode(int[] array) {
		int cmax = 1;
		String mode = "";
		int count = 1;
		// 2 3 4 6 6 9 12 15 15 15

		for (int i = 0; i < array.length; i++) {
			for (int x = i + 1; x < array.length; x++) {
				if (array[i] == array[x]) {
					count++;
				}
			}
			if (count > 1) {
				if (count > cmax) {
					cmax = count;
					count = 1;
					mode = array[i] + ",";
				} else if (count == cmax) {
					cmax = count;
					count = 1;
					mode += (array[i] + ",");
				}
			}
		}
		if (cmax == 1) {
			mode = "This set has no mode";
		}

		return mode;
	}

	// ***********************************************************************************************
	public static int computeRange(int[] array) {

		int length = array.length;
		int range = array[length - 1] - array[0];
		return range;

	}

	// ***********************************************************************************************
	public static double computeStandardDev(int[] array) {
		double Squares = 0.0;
		double sum = 0.0;
		double length = array.length;
		double standardDev;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			Squares = Squares + (array[i]) * (array[i]);
		}
		double average = sum / length;
		standardDev = Math.sqrt((Squares / length) - ((average * average)));
		return standardDev;
	}

	// ***********************************************************************************************
	public static int[] copy(int[] original) {
		int[] newArray = new int[original.length];

		for (int i = 0; i < original.length; i++)
			newArray[i] = original[i];

		return newArray;
	}

}
