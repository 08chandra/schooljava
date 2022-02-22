package frq1;

public class AdditionPattern {
	private int startNumber;
	private int currentNumber;
	private int plusNumber;

	public AdditionPattern(int startNumber, int currentNumber) {
		this.startNumber = startNumber;
		this.plusNumber = plusNumber;
		currentNumber = startNumber;

	}

	public void next() {
		currentNumber += plusNumber;
	}

	public int currentNumber() {
		return currentNumber;
	}

	public void prev() {
		if (currentNumber > startNumber) {
			currentNumber -= plusNumber;
		}
	}
}












//(A)

public String billNotice(double amountDue)

{
	return this.name+",account number"+this.currAccNum+"please pay $"+
}




























