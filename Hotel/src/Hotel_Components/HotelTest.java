package Hotel_Components;

public class HotelTest {
	
	public static void main(String args[]) {
		Hotel2 obj1 = new Hotel2("RAMADA", "Chennai");
		obj1.addRooms(10);
		obj1.addReservation(1, "Abhinav", 'y',"King", 1200.00);
		obj1.addReservation(2, "Bet", 'y',"King", 1300.00);
		obj1.addReservation(3, "Greg", 'y',"King", 1250.00);
		obj1.addReservation(4,"Jole", 'y', "Queen", 1250.00);
		obj1.addReservation(5,"Cassandra", 'n', "Queen", 1250.00);
		obj1.addReservation(6,"Tony",'n', "King",  1250.00);

		obj1.toString();
		

		System.out.println("---------------------------");
		System.out.println("Testing Some Basic Functions");
		System.out.println("---------------------------");
		System.out.println("Occupancy Percentage: ");
		obj1.occupancyPercentage();

		
		obj1.cancelReservation("Abhinav");
		
		obj1.toString();
		
		System.out.println("---------------------------");
		System.out.println("Chcecking Room Constraints");
		System.out.println("---------------------------");
		
		obj1.isEmpty(8);
		
		obj1.isFull(1);
		
	}

}

//Hotel Name: 
//RAMADA
//
//Number of Rooms: 
//15
//
//Occupied Rooms: 
//0.0
//
//
//
//Room Records are: 
//Room Number: 1
//OccupantName: Abhinav
//Smoking Room: y
//Bedtype: King
//Rate: 1200.0
//
//
//Room Number: 2
//OccupantName: Bet
//Smoking Room: y
//Bedtype: King
//Rate: 1300.0
//
//
//Room Number: 3
//OccupantName: Greg
//Smoking Room: y
//Bedtype: King
//Rate: 1250.0
//
//
//Room Number: 4
//OccupantName: Jole
//Smoking Room: y
//Bedtype: Queen
//Rate: 1250.0
//
//
//Room Number: 5
//OccupantName: Cassandra
//Smoking Room: n
//Bedtype: Queen
//Rate: 1250.0
//
//
//Room Number: 6
//OccupantName: Tony
//Smoking Room: n
//Bedtype: King
//Rate: 1250.0
//
//
//---------------------------
//Testing Some Basic Functions
//---------------------------
//Occupancy Percentage: 
//40.0
//Hotel Name: 
//RAMADA
//
//Number of Rooms: 
//15
//
//Occupied Rooms: 
//0.0
//
//
//
//Room Records are: 
//Room Number: 2
//OccupantName: Bet
//Smoking Room: y
//Bedtype: King
//Rate: 1300.0
//
//
//Room Number: 3
//OccupantName: Greg
//Smoking Room: y
//Bedtype: King
//Rate: 1250.0
//
//
//Room Number: 4
//OccupantName: Jole
//Smoking Room: y
//Bedtype: Queen
//Rate: 1250.0
//
//
//Room Number: 5
//OccupantName: Cassandra
//Smoking Room: n
//Bedtype: Queen
//Rate: 1250.0
//
//
//Room Number: 6
//OccupantName: Tony
//Smoking Room: n
//Bedtype: King
//Rate: 1250.0
//
//
//---------------------------
//Checking Room Constraints
//---------------------------
//Room is Empty
//Room is full






