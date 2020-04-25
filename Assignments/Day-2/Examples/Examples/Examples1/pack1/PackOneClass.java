package pack1;
import java.lang.*;
public class PackOneClass {
	 public int i=123;
		// its recomended to declare varaibles are private
	
	  public PackOneClass() 
	 {
		// TODO Auto-generated constructor stub
	}
	 
	 public void one() 
{
	System.out.println("hello, i am from pack one"+i);
}
 void two() 
{
	one();
	getValue();
}
 private void getValue()
{
System.out.println("static method");
two();
}
 protected void three()
 {
	 int x=23;
	 System.out.println(" protected member from the package 1 ");
	 System.out.println(x);
 }
 private class Test123
 {
	 
 }
}
