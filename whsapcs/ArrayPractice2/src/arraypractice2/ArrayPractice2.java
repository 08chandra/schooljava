package arraypractice2;

import java.util.Random;
import java.util.Scanner;

public class ArrayPractice2 {
	private static int size = 0;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("size?");
		int inSize = in.nextInt();
		if (inSize <= 1) {
			System.out.println("The size of the array can not be less than 1.Please re-enter the size.");
		}

		System.out.println("beginning:");
		int[] array = new int[inSize];
		fillRandom(array);
		display(array);
		System.out.println("");
		System.out.println("enter value to be replaced and new replacement value, separated by a space");
		int target = in.nextInt();// replaced value
		int newValue = in.nextInt(); // new replacement
		int replacecnt = replace(array, target, newValue);
		System.out.println("There were " + replacecnt + " replacements made.");
		System.out.println("after replace:");
		display(array);

		System.out.println("enter value to append");
		int appendVal1 = in.nextInt();
		append(array, appendVal1);

		System.out.println("After first append:");
		display(array);

		int[] appendedArray = resize(array);
		System.out.println("After resize:");
		display(appendedArray);

		System.out.println("enter value to append");
		int appendVal2 = in.nextInt();
		append(appendedArray, appendVal2);
		System.out.println("After second append:");
		display(appendedArray);

		System.out.println("enter value to add and the index in which you would like added, separated by a space:");

		int newVal = in.nextInt();// new value
		int pos = in.nextInt(); // position of value to add
		System.out.println("After insert:");
		boolean flg = insert(appendedArray, newVal, pos);
		display(appendedArray);

		System.out.println("What value do you want to delete?");
		int newVal1 = in.nextInt();// new value
		System.out.println("after delete:");
		delete(appendedArray, newVal1);
		display(appendedArray);
	}

	public static void display(int[] array) {
		size = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.print(array[i] + " ");
				size++;
			}
		}
		System.out.println();
		System.out.println("physical size:" + array.length + "  logical size:" + size);
	}

	/*
	 * replaces all instances of target with newValue and returns number of
	 * replacements made main method should display the target, the new value
	 * and the number of replacements made precondition: array is not null
	 */
	public static int replace(int[] array, int target, int newValue) {
		int numOfReplacements = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				array[i] = newValue;
				numOfReplacements++;
			}
		}
		return numOfReplacements;
	}

	// appends newValue to the end of the array. If array is full, the method
	// returns false and no changes are made, otherwise true should be returned.
	// precondition: array is not null
	public static boolean append(int[] array, int newValue) {
		boolean appended = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				appended = true;
				array[i] = newValue;
				break;
			}
		}
		if (!appended) {
			System.out.println("Array is full. " + newValue + " couldn't be added.");
		}
		return appended;
	}

	// resizes array to twice current physical size
	// precondition: array is not null
	public static int[] resize(int[] array) {
		int[] array2 = new int[array.length * 2];
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				array2[i] = array[i];
			}
		}
		return array2;
	}

	// inserts newValue to the specified index (pos) of the array. If array is
	// full, the method returns false and no changes are made, otherwise true
	// should be returned.
	// precondition: array is not null
	public static boolean insert(int[] array, int newValue, int pos) {
		int[] copy = array;

		boolean isArrayFull = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				isArrayFull = false;
				break;
			}
		}
		if (isArrayFull) {
			return false;
		}
		for (int i = 0; i < pos - 1; i++) {
			array[i] = copy[i];
		}
		array[pos] = newValue;

		for (int i = pos + 1; i < copy.length; i++) {
			array[i] = copy[i];
		}
		return true;
	}

	// deletes all instances of target from array. Should rearrange array to be
	// “tight”. Returns true if successful, false //if target is not found.
	// precondition: array is not null
	public static boolean delete(int[] array, int target) {
		boolean deleted = false;
		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] != target) {
				array[j++] = array[i];
			} else {
				deleted = true;
			}
		}
		return deleted;
	}

	public static void fillRandom(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(array.length * 2) + 1;
		}
	}
}
