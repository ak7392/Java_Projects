  
public class NestedIfstatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=500,b=8000,c=300000;
if(a>b && a>c)
System.out.println(" the biggest one is a: "+a);
else
if(b>a && b>c)
System.out.println("the biggest one is b: "+b);
else
System.out.println("biggest one is c: "+c);
/*
		
	int a=25369,b=900,c=300000;
if(a>b)
{
	if(a>c)
		System.out.println("the biggest one is "+a);
	else 
		if(b>a)
			{
			if(b>c)
			System.out.println("b is the biggest one"+b);

			}
		else
			System.out.println("c is the biggest one"+c);
}
else
{
	if(b>a)
	{
		if(b>c)
		System.out.println("b is the biggest one"+b);

		}
	else
	System.out.println("c is the biggest one"+c);
}
*/}
	}

