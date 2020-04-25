package Day2.constructors;
class P
{
	P()
	{
		System.out.println("parent classs");
	}
	P(int x)
	{
		System.out.println("Parent class int arg constructor");
	}
}
class C extends P
{
	C()
	{
		super(23);
		System.out.println("chaild classs");
	}
	C(int c)
	{
		this();
		System.out.println("chaild class int arg constructor");
	}
}
public class TestSuperThisApp {
public static void main(String args[])
{
	new C(10);
}
}
