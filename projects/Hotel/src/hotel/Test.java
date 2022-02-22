package hotel;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Room roomA = new Room(125, 45.23);
		Room roomB = new Room(216, 98.99);
		Room roomC = new Room(343, 145);
		Guest guestA = new Guest("Owen Grady", false);
		Guest guestB = new Guest("Andrew Dwyer", false);
		Guest guestC = new Guest("Peter Quill", true);
		Reservation r1 = new Reservation(guestA, roomB, 3);
		Reservation r2 = new Reservation(guestB, roomB, 5);
		Reservation r3 = new Reservation(guestC, roomC, 4);

		List<Reservation> reservations = new ArrayList<>();
		reservations.add(r1);
		reservations.add(r2);
		reservations.add(r3);
		for (Reservation res : reservations) {
			if (!res.isAvailable()) {
				System.out
						.println(res.getGuest().getName() + " will be staying in room " + res.getRoom().getRoomNumber()
								+ " for " + res.getNights() + ". Grand total is $" + res.calculateCost());

				res.getRoom().setReserved(true);
			} else {
				res.changeCost();
			}
		}

	}
}
