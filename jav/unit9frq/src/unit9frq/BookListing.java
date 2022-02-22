package unit9frq;

public class BookListing {
	private double x;
	private Book b;

	public BookListing() {

	}

	public BookListing(Book book, Double x) {
		this.b = book;
		this.x = x;
	}

	public void printDescription() {
		b.printBookInfo();
		System.out.print(", $" + x);
	}
}
