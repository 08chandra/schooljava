package purse;

import java.util.ArrayList;

public class PurseTester {

	public static void main(String args[]) {
		String[] a = new String[] { "ice", "cream", "is", "nice" };

		String[] b = new String[] { "java", "is", "nice", "so", "nice", "it", "is" };
		printAllNums(a, b);

	}

	public static void printAllNums(String[] a, String[] b) {
		for (int k = 0; k < a.length; k++) {
			int count = numInArray(b, a[k]);
			System.out.println(a[k] + ": " + count);
		}
	}

	public static int numInArray(String[] a, String s) {
		int count = 0;
		for (String word : a) {
			if (word.equals(s)) {
				count++;
			}
		}
		return count;
	}

}

/*
 * ArrayList<String> extract = new ArrayList<String>(); extract.add("one");
 * extract.add("two"); extract.add("three"); extract.add("four");
 * extract.add("fivetwo"); extract.add("sixone"); PurseTester test = new
 * PurseTester(); ArrayList<String> test1 = test.extract(extract); for (String
 * word : test1) { System.out.println(word); }
 * System.out.println("---------------------------"); for (String word :
 * extract) { System.out.println(word); }
 * 
 * }
 * 
 * public ArrayList<String> extract(ArrayList<String> list) { ArrayList<String>
 * newList = new ArrayList<String>(); for (int i = 0; i < list.size(); i++) { if
 * (list.get(i).length() < 5) { newList.add(list.get(i)); list.set(i,
 * "hedgehog"); } } return newList; }
 */