
public class IFelseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=22;
		
		if(age>10)
		{
		int x=34;
		//System.out.println(x);
		}
		else
		System.out.println("hai");
		
		//System.out.println(x);
		
		if(age<18)			
		System.out.println("you are not eligible to vote, you have to wait "+(18-age)+" Years");
		else
		{
		System.out.println(" you are eligible to vote: "+age);
		System.out.println("all  d best");
		}
	}

}
