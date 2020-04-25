package CollectionFrameworkDemo;

import java.util.Stack;

public class StackDemo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.push("A");
s.push("Y");
s.push("O");
s.push("R");
System.out.println(s);
s.pop(); // to reomve recently inserted object
System.out.println(s);
System.out.println(s.peek()); // return top element next recent element
System.out.println(s);
System.out.println(s.search("Y")); // offset value
s.push("58");
s.push("H");
System.out.println(s);

s.pop();

System.out.println(s);
s.pop();

System.out.println(s);
s.pop();

System.out.println(s);
	}
}
