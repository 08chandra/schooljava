package frq1;

public class GameSpinner {

	private int sectors;
	private int runNumber;
	private int recentSpin = 0;
	private int length = 0;

	public GameSpinner(int sectors) {
		this.sectors = sectors;
	}

	public int currentRun() {
		return length;
	}

	public int spin() {
		while (true) {
			runNumber = (int) (Math.random() * 10);
			if (runNumber >= 1 && runNumber <= this.sectors) {
				if (runNumber == recentSpin) {
					length++;
				} else {
					length = 1;
					recentSpin = runNumber;
				}
				break;
			}
		}
		return runNumber;
	}
}
