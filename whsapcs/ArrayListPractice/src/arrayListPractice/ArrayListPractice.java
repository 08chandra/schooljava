package arrayListPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		System.out.println("1.	Create an ArrayList<Integer>");

		// a. Fill with 20 random values [1 – 25]
		System.out.println("a.");
		ArrayList<Integer> valList = new ArrayList<>();
		fillRandom(valList);
		// b. Insert the value -12 at index 3
		System.out.println("b.");

		insert(valList, 3, -12);
		// c. Double all odd values
		System.out.println("c.");

		doubleOddVal(valList);
		// d. Remove all values < 15
		System.out.println("d.");

		removeAllLessThanGivenNumber(valList, 15);
		System.out.println("e.");

		// e. Remove all multiples of 4 and insert into a new ArrayList<Integer>
		// called fours
		multiplesOfval(valList, 4);

		System.out.println("2.	Create an ArrayList<String>");
		// a. Fill with the following words: “make the most of all that comes
		// and the least of all that goes”
		System.out.println("a.");

		ArrayList<String> wordsList = splitWords();
		// b. Capitallize all words with an odd number of letters.
		System.out.println("b.");
		capsAllOddNumWords(wordsList);
		// c. Add your name to the beginning of the list.
		System.out.println("c.");

		insertWord(wordsList, 0, "Sharat");
		// d. Remove any duplicate words in the list.

		System.out.println("d.");
		deleteDuplicateWords(wordsList);
	}

	public static void fillRandom(ArrayList<Integer> valList) {

		int size = 0;
		while (size < 20) {
			double randomval = Math.random();
			int val = (int) (randomval * 25);
			int finalval = val + 1;
			if (finalval <= 25) {
				valList.add(finalval);
				size++;
			}

		}
		display(valList);

	}

	static void insert(ArrayList<Integer> list, int index, int element) {
		list.add(index, element);
		display(list);
	}

	static void display(ArrayList<Integer> list) {
		for (Integer val : list) {
			System.out.print(val.intValue() + " ");
		}
		System.out.println("");
	}

	static void displayString(List<String> wordList) {
		for (String val : wordList) {
			System.out.print(val + " ");
		}
		System.out.println("");
	}

	static void doubleOddVal(ArrayList<Integer> list) {
		ArrayList<Integer> list2 = new ArrayList<>();
		for (Integer val : list) {
			if (val % 2 > 0) {
				int doubledOdd = val * 2;
				list2.add(doubledOdd);
			} else {
				list2.add(val);
			}

		}
		display(list2);
	}

	static void removeAllLessThanGivenNumber(ArrayList<Integer> list, int inputVal) {
		ArrayList<Integer> list2 = new ArrayList<>();
		for (Integer val : list) {
			if (val >= inputVal) {
				list2.add(val);

			}
		}
		display(list2);
	}

	static void multiplesOfval(ArrayList<Integer> list, int pval) {
		ArrayList<Integer> mulOfVal = new ArrayList<>();
		ArrayList<Integer> remainingValList = new ArrayList<>();
		for (Integer val : list) {
			if (val % pval == 0) {
				mulOfVal.add(val);
			} else {
				remainingValList.add(val);
			}
		}
		display(remainingValList);
		display(mulOfVal);
	}

	static ArrayList<String> splitWords() {
		String sentence = "make the most of all that comes and the least of all that goes";
		String[] words = sentence.split("\\s+");
		ArrayList<String> wordList = new ArrayList<>();
		for (String val : words) {
			wordList.add(val);
		}
		displayString(wordList);
		return wordList;

	}

	static void capsAllOddNumWords(ArrayList<String> words) {
		ArrayList<String> finalRes = new ArrayList<>();
		for (String val : words) {
			if (val.length() % 2 > 0) {
				String result = val.toUpperCase();
				finalRes.add(result);
			} else {
				finalRes.add(val);
			}
		}
		displayString(finalRes);
	}

	static void insertWord(ArrayList<String> wordsList, int index, String name) {
		wordsList.add(index, name);
		displayString(wordsList);
	}

	static void deleteDuplicateWords(ArrayList<String> wordsList) {
		ArrayList<String> finalRes = new ArrayList<>();
		LinkedHashSet<String> lhSetWords = new LinkedHashSet<>(wordsList);
		for (String val : lhSetWords) {
			finalRes.add(val);
		}
		displayString(finalRes);
	}
}