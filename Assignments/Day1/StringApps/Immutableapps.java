package StringApps;

public class Immutableapps {
public static void main(String ag[])
{
	/*String s="hello"; // imutable, non syn methods
	s=s.concat(" Hai");
	System.out.println(s);*/
	
	
	
	StringBuffer sb=new StringBuffer("Hello"); // mutable, syn methods
	sb.append(" Hai");
	System.out.println(sb);  
	
	
	//stringbuilder in java 5, mutable and methods are non syn
	StringBuilder sb1=new StringBuilder("hello how"); // mutable and non syn method
	sb1.append(" are you hyd");
	System.out.println(sb1);
}
}	
