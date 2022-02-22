package productreview;

import java.util.*;

public class ReviewCollector {
	private ArrayList<ProductReview> reviewList;

	private ArrayList<String> productList;

	/**
	 * Constructs a ReviewCollector object and initializes the instance variables.
	 */

	public ReviewCollector()

	{

		reviewList = new ArrayList<ProductReview>();

		productList = new ArrayList<String>();

	}

	/** Adds a new review to the collection of reviews, as described in part (a). */

	public void addReview(ProductReview prodReview) {

		reviewList.add(prodReview);
		String name = prodReview.getName();
		if (!productList.contains(name)) {
			productList.add(name);
		}

		/* to be implemented in part (a) */ }

	/**
	 * Returns the number of good reviews for a given product name, as described in
	 * part (b).
	 */

	public int getNumGoodReviews(String prodName) {
		int counter = 0;
		if (productList.contains(prodName)) {
			for (ProductReview prodReview : reviewList) {
				if (prodReview.getName().equals(prodName)) {
					if (prodReview.getReview().contains("best")) {
						counter++;
					}
				}
			}

		}
		return counter;
	}

}
