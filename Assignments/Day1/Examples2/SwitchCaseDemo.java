  

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int accountNumber8978$=1234;
String s="Hai";
switch(s)  // java 7
{
case "Hai" : System.out.println("im from case 1");
case "Hello": System.out.println("hello");
default : System.out.println("no match");
}*/
		/*System.out.println("please enter any numbner");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();*/
		int n=8;
switch(n)
{
case 2: System.out.println("two");break;
case 3: System.out.println("three");break;
case 4: System.out.println("four");break;
case 5: System.out.println("five");break;
case 8: System.out.println("eight");break;
case 9: System.out.println("nine");break;
case 6: System.out.println("six");  break;
case 7: System.out.println("seven");break;
default : System.out.println("pls enter proper vlaue...."); break;
case 0: System.out.println("Zero"); break;
case 1: System.out.println("one");break;

}
/*int i=5;
int x=23,y=3,z=89;
switch(x+y+z)
{
case 1:break;
case 2:break;
default : System.out.println("executing default case");
case 157: System.out.println("executing a case");
}
*/	}

}
