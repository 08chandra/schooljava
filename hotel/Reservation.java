package hotel;

public class Reservation {
	private Room room;
	private Guest guest;
	private int nights;
	private double cost;

	public Reservation(Guest g, Room r, int n) {
		guest = g;
		room = r;
		nights = n;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public int getNights() {
		return nights;
	}

	public void setNights(int nights) {
		this.nights = nights;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isAvailable() {
		if (room.getReserved()) {
			System.out.println("Reservation Impossible. Room " + room.getRoomNumber() + " is already reserved.");
		} else {
			System.out.println("Room " + (room.getRoomNumber()) + " is Available!  Assigning room!");

		}
		return room.getReserved();
	}

	public double calculateCost() {
		cost = room.getPricepernight() * getNights();
		if (guest.getEmstatus()) {
			cost = cost * 0.9;
		}
		return cost;
	}

	public double changeCost() {
		cost = -1;
		return cost;
	}
}
