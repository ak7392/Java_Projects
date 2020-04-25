  

public class CheckPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		  System.out.println("a\tb\tpow(a,b)");
		  
		  for(i=1;i<6;i++)
		  {
		   for(j=1;j<6;j++)
		   {
		    System.out.println(i+"\t"+(i+1)+"\t"+power(i,(i+1)));
		   }
		  }
	}
		  public static int power(int a,int b){
			  int z=0;
			  for( b=0;b<=(a+1);b++)
			  {
			    z=a*a;
			  }
			//  System.out.println(z);
			  return z;
			  
			 }

	}

