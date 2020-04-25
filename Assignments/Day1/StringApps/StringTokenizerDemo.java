package StringApps;

import java.util.*;	
import java.util.regex.*;
class StringTokenizerDemo 
{
public static void main(String args[]) {
int i=1;
String str="Never look down on anybody unless you’re helping him up";
System.out.println("Splitting String Using StringTokenizer class");

StringTokenizer tr=new StringTokenizer(str," ");
while (tr.hasMoreTokens()) {
	System.out.print("Token "+i+" :");
	System.out.println(tr.nextToken());	
	++i; }
System.out.println("number of words are "+i);


System.out.println("Splitting String Using split() method");
String[] tk=str.split(" ");
int j=1;
for(String tokens: tk)
{
	System.out.println("Token "+j+":"+tokens);
	j++;
}
System.out.println("number of words are "+j);


Pattern p=Pattern.compile(" ");
tk= p.split(str,20);
int k=1;
for(String tokens: tk)
{
	System.out.println("Token "+k+":"+tokens);
	k++;
}
}}


