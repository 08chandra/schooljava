package theater;

public class Theater {
	private Seat[][] theaterSeats;

	/**
	 * Constructs a Theater object, as described in part (a).
	 * 
	 * Precondition: seatsPerRow > 0; tier1Rows > 0; tier2Rows >= 0
	 * 
	 */

	public Theater(int seatsPerRow, int tier1Rows, int tier2Rows)
	{
		if (seatsPerRow > 0 && tier1Rows > 0 && tier2Rows >= 0) {
			theaterSeats = new Seat[tier1Rows + tier2Rows][seatsPerRow];
		}
	}
	public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol)
	{
		if (theaterSeats == null) {
			return false;
		}
		int numOfRows = theaterSeats.length;
		int numOfSeatsInRow = theaterSeats[0].length;
		// this is a condition that checks the from and to seats is a valid seat numbers.
		if (fromRow < 0 || fromRow >= numOfRows || fromCol >= numOfSeatsInRow || fromCol < 0 || toRow < 0
				|| toRow >= numOfRows || toCol >= numOfSeatsInRow || toCol < 0) {
			return false;
		}
		Seat toSeat = theaterSeats[toRow][toCol];
		
        if(toSeat.isAvailable()) {
        	Seat fromSeat = theaterSeats[fromRow][fromCol];
        	if(toSeat.getTier() >= fromSeat.getTier()) {
               toSeat.setAvailability(false);
               fromSeat.setAvailability(true);
               return true;
        	}
        }
		return false;
	}
}