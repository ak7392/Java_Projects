package Day2.constructors;
class Super123 {
	int x;
	public Super123() {
		System.out.println(" im super class default constructor");
		test();
		// TODO Auto-generated constructor stub
	}
	public Super123(int x) {
		System.out.println(" its a super class in arg constructor");
		this.x = x;
		// TODO Auto-generated constructor stub
	}
	public void test()
	{
		System.out.println("its a method from super class");
	}
}
class Room2 extends Super123
{
	int x = 34;
	double length, height, breadth, volume;

	public Room2() // default constructor to give some default values
	{
		// by default super();
		// this(10, 20, 30);
		System.out.println("executing default constructors");
		this.length = 0;
		this.height = 0;
		this.breadth = 0;
	}
	Room2(double length, double height, double breadth) {
		// this();
		System.out.println("executing parameterized constructor");
		this.length = length;
		this.height = height;
		this.breadth = breadth;
	}

	double volComp() {
		//System.out.println(super.x);
// we cant call  constructors 
		volume = ((this.length) * (this.height) * (this.breadth));
		return volume;
	}	
}
public class ConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room2 r1 = new Room2(14, 12, 10);
		System.out.println(r1.volComp());

		/*Room2 r2 = new Room2(16, 15, 14);
		System.out.println(r2.volComp());

		Room2 r3 = new Room2();
		System.out.println(r3.volComp());
		Super123 s1 = new Super123(36);
		System.out.println(s1.x);*/
	}
}
