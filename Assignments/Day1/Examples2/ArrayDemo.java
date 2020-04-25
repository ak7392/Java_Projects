	  

import java.util.Scanner;
class Student
{
	int rollno;
	String name;
}
public class ArrayDemo {

	public static void main(String[] args) {
int marks[]=new int[6];

//int marks[]={45,67,232,767,2356,67};

/*for(int i=0;i<6;i++)
System.out.println(marks[i]);*/
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter marks of 6 courses");
for(int i=0;i<6;i++)
{
	marks[i]=sc.nextInt();
}
// to read elements of the array
for(int x:marks)
{
if(x>=35)
System.out.println("you passed thsi course :"+x);
else
System.out.println("Your failed this course:  "+x);
}		
}
		
	}

