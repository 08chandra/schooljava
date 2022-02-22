package unit9frq;
import java.util.*;

public class tester {
	public static void main(String args[]) {
	PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie",

			"F.D. Bedford");

			myBook.printBookInfo();
			
			ArrayList<Book> myLibrary = new ArrayList<Book>();
			Book book1 = new PictureBook("Peter and Wendy", "J.M. Barrie","F.D. Bedford");
			Book book2 = new PictureBook("Harry Potter", "J.K. Rowling","Jim Kay");
			myLibrary.add(book1);
			myLibrary.add(book2);
			
			for(Book book : myLibrary) {
				
				book.printBookInfo();
				System.out.println("");
			}
			
			BookListing listing1 = new BookListing(book1, 10.99);
			listing1.printDescription();
			
}
}