package gamespinner;

import java.util.*;

public class GameSpinner {

	private int numOfSectors;
	private int runNum;
	private int numReturned;
	private int previousNum;

	public GameSpinner() {

	}

	public GameSpinner(int numOfSectors) {
		this.numOfSectors = numOfSectors;
	}

	public int currentRun() {

		if (numReturned == 0) {
			this.runNum = 0;
		} else if (numReturned == previousNum) {
			this.runNum++;
		} else {
			this.runNum = 1;
		}
		return this.runNum;
	}

	public int spin() {
		this.previousNum = this.numReturned;
		Random rand = new Random();
		this.numReturned = rand.nextInt((numOfSectors - 1) + 1) + 1;
		return this.numReturned;
	}
}

/*
*public static void main(String args[]) {
		GameSpinner g = new GameSpinner(4);
		System.out.println("current run: " + g.currentRun());
		System.out.println("spin: " + g.spin());
		System.out.println("current run: " + g.currentRun());
		System.out.println("spin: " + g.spin());
		System.out.println("current run: " + g.currentRun());
		System.out.println("spin: " + g.spin());
		System.out.println("current run: " + g.currentRun());
		System.out.println("spin: " + g.spin());
		System.out.println("spin: " + g.spin());
		System.out.println("spin: " + g.spin());
		System.out.println("current run: " + g.currentRun());

	}
*/