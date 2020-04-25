package Day4.collectionframework1;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pls enter size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Please enter "+n+ " Values");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Please Enter "+(i+1)+" value ");
			a[i]=sc.nextInt();
		}
		
		/*int a[]={45,5,89,12,6,5223,874,21};
		for(int i=0;i<a.length;i++)
		{
		 if(i==3)
		 continue;
		
		 
		 System.out.println(a[i]);
		}*/	
		// for each is best only for accessing elements from the array
		
		for(int x:a)
		{
			
			
			if(x%2==0)
		System.out.println(x+ " is a even number");
		else
			System.out.println(x+ " is a odd number");
			
		}
		
	}

}
