package Hotel_Components;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
	
//	private static final int DEFAULT = 10;
	private int[] array;
	private String name; 
	private String occupantName;
	private String location;
	private int numOfRooms;
	private boolean occupied = false	;
	private int roomNumber;
	private String bedType;
	private char smokeOption;
	private double roomRate;
	
	Scanner newObj = new Scanner(System.in);
	
	

	public Hotel() {
		ArrayList<Hotel> HotelData = new ArrayList<>();
	}
	
	public Hotel(String name, String location) {
		this.name = name;
		this.location = location;
		this.numOfRooms = 0;
	}
	
	public void addRoom(int roomNumber1, String bedType1, char smokeOption1, double roomRate1) {
		
			roomNumber = roomNumber1;
			bedType = bedType1;
			smokeOption = smokeOption1;
			roomRate = roomRate1;
			occupied = true;
			++numOfRooms;
			
			
	}
	
	public void addReservation(String occupantName1, char SmokingRequest, String bedType1) {
		occupantName = occupantName1;
		smokeOption = SmokingRequest;
		bedType = bedType1;
		occupied = true;
		
	}
	
	public void cancelReservation(String occupantName1) {
		if (occupantName == occupantName1) {
			occupantName = null;
			smokeOption = (Character) null;
			bedType = null;
			occupied = false;
		}
	}
	
	public String findReservation(String name1) {
		if (occupantName == name1) {
			return toString();
		}	
		return "You have a Reservation";
	}
	
	public String printReservationList() {
		return toString();
	}

	public String toString() {
		return "RoomNumber: " + getRoomNumber() + "\nBedType: " + getBedType() + "\nSmokeOption: " + getSmokeOption() + "\nRoomRate: " + getRoomRate();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public String getRoomNumber() {
		String str1 = String.valueOf(roomNumber);
		return str1;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public char getSmokeOption() {
		return smokeOption;
	}

	public void setSmokeOption(char smokeOption) {
		this.smokeOption = smokeOption;
	}

	public String getRoomRate() {
		String str2 = String.valueOf(roomRate);
		return str2;	
	}

	public void setRoomRate(double roomRate) {
		this.roomRate = roomRate;
	}


}
