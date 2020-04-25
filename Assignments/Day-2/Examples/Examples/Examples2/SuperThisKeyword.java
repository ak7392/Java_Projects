class MotorVahicle
{
	private int maxSpeed;
	private String modelName;
	private	int modelYear;
	private	int numberOfPassangers;
	int x=567;
	private String regNumber="APER332232";
	int i=45;
	MotorVahicle() 
	{
		// to assign some default values to the members
		this.maxSpeed=40;
		this.modelName="u";
		this.modelYear=1200;
		this.numberOfPassangers=2;
		System.out.println(" super class default constructor");
	}
	MotorVahicle(int i)
	{
		System.out.println("parent class int arg constructor");
	}
	MotorVahicle(int maxSpeed,String modelName,int modelYear,int numberOfPassangers) 
	{ // constructor overloading, constructor name is same,but paremeters are different.
		System.out.println(" super class parameterized constructors");
		this.maxSpeed=maxSpeed;
		this.modelName=modelName;
		this.modelYear=modelYear;
		this.numberOfPassangers=numberOfPassangers;
	} 
public int getMaxSpeed() {
		return maxSpeed;
	}
	public String getModelName() {
		return modelName;
	}
	public int getModelYear() {
		return modelYear;
	}
	public int getNumberOfPassangers() {
		return numberOfPassangers;
	}
	public int getX() {
		return x;
	}
	public int getI() {
		return i;
	}
public void testDrive()
{
	System.out.println(" Parent class test drive method, i want test drive");
}
public void test()
{
	System.out.println("test method");
}
}
class Car extends MotorVahicle
{// we cant import private members and we cant import constructors
	private int noofDoors;
	int i=98;
	// in every chaild class constructor they invoke paernt class default constructor by default using super()
	public Car() 
	{
		this(6);
		System.out.println(" chaild class car defautl constructor");
		// TODO Auto-generated constructor stub
	}
	public Car(int noofDoors) 
	{
		//System.out.println(maxSpeed);
		super(120,"ram",123,4);
		System.out.println(" chaild class  car parameterized constructors");
		this.noofDoors=noofDoors;
		

	}
	public void printCarDetails()
	{
		System.out.println("The Number of Doors of Given is: "+noofDoors);
		System.out.println("The max speed of the Car is: "+getMaxSpeed());
		System.out.println("The model name of the car is: "+getModelName());
		System.out.println("The mode year of the car is: "+getModelYear());
		System.out.println("The number of passangers are : "+getNumberOfPassangers());
		//System.out.println(maxSpeed);
	}
	public void testDrive()
	{
		System.out.println(getMaxSpeed());
		super.testDrive();
		System.out.println(" sub class test drive method"+super.i); // to acces super class value, use Super keyword
		super.test();
		
	}
}
/*class App321 extends Car
{
	public void one()
	{
		System.out.println(x);
	}
}*/
class Bike extends MotorVahicle
{
	private boolean kickStart;
	private boolean buttonStart;
	static int i=89;
	/*public Bike() 
	{
		
		System.out.println(" chaild class bike default constructors");
		// TODO Auto-generated constructor stub
	}*/
	public Bike(boolean kickStart,boolean buttonStart) 
	{
		// super()  JVM will use super() keyword in every chaild class constructor
		super(120,"ram",123,4);
				System.out.println(" its chaild class bike parameteried constructro");
		this.kickStart=kickStart;
		this.buttonStart=buttonStart;
		
		Bike.i=23;
		// TODO Auto-generated constructor stub
	}
	public void printBikeDetails()
	{
		System.out.println("Kick start :"+kickStart);
		System.out.println("button start "+buttonStart);
		System.out.println(getMaxSpeed());
		System.out.println(getModelName());
		System.out.println(getModelYear());
		System.out.println(getNumberOfPassangers());
	}
	public void printValue()
	{
		System.out.println(i);
	}
}
public class SuperThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car c2=new Car();
//Car c1=new Car(4);
//Bike b=new Bike(true,false);
//MotorVahicle mv1=new MotorVahicle();// defult constructor
//MotorVahicle mv=new MotorVahicle(90,"ABC",2015,4); // parameterized constructor
//Car c=new Car(); // it will invoke car class default constructor
//c.testDrive();
//Bike b=new Bike();
		/*MotorVahicle mv=new MotorVahicle();
		System.out.println("bike details\n");
Bike b1=new Bike(true,true);
b1.printBikeDetails();*/
/*Bike b2=new Bike();
b1.testDrive();
System.out.println(" completed");
Car c=new Car(4);
c.testDrive();
App321 a=new App321();
a.one();
*/	
System.out.println(" car details\n");

/*Car c=new Car(4);
c.printCarDetails();
MotorVahicle m4=new MotorVahicle();*/
//m4.modelYear=23321;

//Car c=new Car(4);
//c.printCarDetails();
//c.testDrive();
Bike b=new Bike(true, true);
	}
}