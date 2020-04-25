  
import java.util.Random;
class TestRamdom
{
	int getRandom()
	{/*
		Random r=new Random();
		int x=r.nextInt(100);*/
		int x=(int)(Math.random()*1000); // 0.98*100=98.00, type casting to int, 98.0 to int 98
		return x;
	}
	void testMe()
	{
		int a=123;
		int b=56;
		int c=a+b;
		System.out.println(c);
		System.out.println("its a method");
	}
}
public class RandomApplication {
	public static void main(String[] args) 
	{
System.out.println(" the random number is: ");
TestRamdom tr=new TestRamdom();
int r=tr.getRandom();
int r2=tr.getRandom();
System.out.println(r);
// send this number to reg mobile numbers
// we can ask him to enter the same
System.out.println(r2); // syso, press ctrl+spacebar
tr.testMe();
	}
}
