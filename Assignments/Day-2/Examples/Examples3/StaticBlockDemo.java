import java.sql.*;
class StaticBlockDemo {
    public int x=10; 
   static int k=67;
    static // 1 
    {
    	// i can load native libraries or third party libraries or some other services
   	//System.load("Python libraries");
    int z=10; // local variable
    System.out.println("In static block");		
    }
    { //3  // 5
    	int z=324;
    System.out.println("In Instance Initialization block");
    System.out.println("Printing Instance variable Initializer value through Block: " +x);
    }
// Constructor
    StaticBlockDemo(int y) //4
    {
    System.out.println("Within Constructor");
    System.out.println("Instance variable printed using constructor: "+x); // 10
     x=y;
     System.out.println("Instance variable initialized using constructor: "+x); //100
   //  k=34;
   }

StaticBlockDemo() 	
{
     System.out.println("Within Constructor");
      System.out.println("Instance variable printed using constructor: "+x);
 }
    static void mone()
    {
    	System.out.println("i am fromstatic method");
    }
    void appA()
    {
    	System.out.println(k);
    	System.out.println(x);

    	System.out.println("instance methods");
    }
     class App123 // inner class
    {
    	
    }
    static Connection getConnection()
    {
    	// a static method can access only static variables 
    	System.out.println(k);
    	// java statements to create connection object for given database 
    	// return Connection object to the caller, he can use that object for data base operations
    	System.out.println(" connection object created and reuturned");
    	return null;
    }
   
      public static void main(String[] aaa)	
      {
      System.out.println("In main"); // 2
      StaticBlockDemo st = new StaticBlockDemo(100);
      System.out.println("------------------------------------------  ");
      StaticBlockDemo st1 = new StaticBlockDemo();
    Test1234 t1=new Test1234();
    t1.one();
    
    System.out.println(StaticBlockDemo.k);
   StaticBlockDemo sd=new Test1234();
   System.out.println(StaticBlockDemo.k);
   System.out.println(StaticBlockDemo.k);
      StaticBlockDemo.getConnection();
      System.out.println(aaa.length);
      for(String s:aaa)
    	 System.out.println(s);
      }	
     
      }


class Test1234 extends StaticBlockDemo
{
	
	public void one()
	{
			k=65;
			System.out.println(k);
	}
	/*public void mone()
    {
    	System.out.println("i am fromstatic method");
    }*/
}
