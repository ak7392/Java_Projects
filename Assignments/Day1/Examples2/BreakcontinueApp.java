  

public class BreakcontinueApp {
	/*static
	{
		System.out.println("im from static block");
	}*/
public void test123()
{
	int x=234;
	System.out.println(x);
}
	public static void main(String[] args) {
l1:
for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (i == j)
					 continue l1;
					
				System.out.println(i + " ----- " + j);
			}
		}
	/*st:
		System.out.println("helo");
		System.out.println("hai");
	
	{
		int i=234;
		System.out.println("hai");
		System.out.println("bye");
	}*/
	//System.out.println(i);
	}
}
