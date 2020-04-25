package controlstatements;

import java.util.Scanner;

public class ForEachArray {

	public static void main(String[] args) {

		/*int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the size of the array");
		int n=sc.nextInt();
		a=new int[n];
		
		System.out.println("Please enter values");
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter "+(i+1)+" value : ");
			a[i]=sc.nextInt();
		}
		System.out.println("the value of the array");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);*/
		int b[]={34,6,3,57,7,77,43};
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		/*
		// for each 
		for(int x:a)
			System.out.println(x);
		
		*/
		for(int x:b)
			System.out.println(x);
		
		//we can sort them
		// we can also find min or max or etc
		// we use arraylist or linkedlist or list or set or map... or collection framework
		System.out.println(args.length);
	}

}
