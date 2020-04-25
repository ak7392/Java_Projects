package Day2.constructors;
class One
{
	One()
	{
	System.out.println(" super class default constructor");	
	}
	One(int i)
	{
		System.out.println("super class int arg constructor");
	}
}
class Two extends One
{
	Two()
	{		
		// it will invoke super class default constructor automatically
		System.out.println("sub class defalt constructor");
	}
	Two(int i)
	{
		// JVM will invoke parent class default contstucot
		super(20);
		System.out.println("sub class int arg constructor");
	}
	public void test()
	{
		System.out.println("hello, i am from chaild class method");
	}
}
public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Two t=new Two(200);
t.test();

	}

}
