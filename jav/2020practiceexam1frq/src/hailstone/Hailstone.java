package hailstone;

public class Hailstone {
	public static void main(String args[]) {
		System.out.println(propLong(4));
	}

	public static int hailstoneLength(int n) {
		int haillen = 0;
		System.out.print(n + " ");
		while (n > 0) {
			if (n == 1) {
				haillen++;
				break;
			} else if (n % 2 == 0) {
				haillen++;
				n = n / 2;

			} else if (n % 2 == 1) {
				haillen++;
				n = 3 * n + 1;
			}
			System.out.print(n + " ");
		}
		System.out.print(" ,hail length: " + haillen);
		return haillen;
	}

	/**
	 * Returns true if the hailstone sequence that starts with n is considered long
	 * 
	 * and false otherwise, as described in part (b).
	 * 
	 * Precondition: n > 0
	 * 
	 */

	public static boolean isLongSeq(int n) {
		return (hailstoneLength(n) > n);
	}

	/**
	 * Returns the proportion of the first n hailstone sequences that are considered
	 * long,
	 * 
	 * as described in part (c).
	 * 
	 * Precondition: n > 0
	 * 
	 */

	public static double propLong(int n)
	{
		double totallongseq = 0.0;
		for (int i = 1; i <= n; i++) {
			boolean longseq = isLongSeq(i);
			if (longseq) {
				System.out.print(" Long? Yes\n");
				totallongseq++;
			} else {
				System.out.println(" Long? No\n");
			}
		}

		return (totallongseq / n);
	}

	// There may be instance variables, constructors, and methods not shown.

}
