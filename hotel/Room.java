package hotel;

public class Room {

	private int roomNumber;
	private double pricepernight;
	private	boolean reserved;
	
	public Room(int roomNumber, double pricepernight){ 
		this.roomNumber = roomNumber;
		this.pricepernight = pricepernight;
		this.reserved = false;
		
	}

	public int getRoomNumber(){  
		return roomNumber;
	}
	public double getPricepernight(){
		return pricepernight;
	}
	public boolean getReserved(){
		return reserved;
	}
	
	public void setRoomNumber( int roomNumber){
		this.roomNumber = roomNumber;
	}
	public void setPricepernight( double pricepernight){
		this.pricepernight = pricepernight;
	}
	public void setReserved( boolean reserved){
		this.reserved = reserved;
	}
	
}
		
		
	

