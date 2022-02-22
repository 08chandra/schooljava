package unit9frq;

public class PictureBook extends Book {
	private String illustrator;

	public PictureBook(String t, String a, String ilus) {
		super(t, a);
		this.illustrator = ilus;
	}
	public void printBookInfo() {
		super.printBookInfo();
		System.out.print(" and illustrated by " + this.illustrator);
	}
}
