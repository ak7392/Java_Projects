/*
 * 1.Write a program that prompts the user to enter a text and displays 
 * the number of vowels and consonants in the file. 
 * Use a set to store the vowels A, E, I, O, and U.
 */

package CollectionsAssignmentPackage;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class StoreVowelsandConsonents {
	public static String SegregateVowelCosonents(char[] userArray) {
		ArrayList<Character> vowels = new ArrayList();
		ArrayList<Character> consonents = new ArrayList();
		
		HashSet<Character> newMap = new HashSet<Character>();
		newMap.add('A');
		newMap.add('E');
		newMap.add('I');
		newMap.add('O');
		newMap.add('U');
		
		Iterator it1 = newMap.iterator();
		
		int n = userArray.length;
		for(int i=0; i < n; i++) {
			if (newMap.contains(userArray[i])){
				vowels.add(userArray[i]);
			}
			else {
				consonents.add(userArray[i]);
			}
		}
		return("Vowels: "+vowels) + ("Consonents: "+consonents);
		
		
		
	}
	
	
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take Input String from user: ");
		String userInput = sc.nextLine();
		userInput = userInput.toUpperCase();
		
		char[] userArray = userInput.toCharArray();
	
		
	
//		MaxOccurance(arr);
//		
//		System.out.println("-------------");
//		
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		arr2.add(2);
//		arr2.add(3);
//		arr2.add(40);
//		arr2.add(3);
//		arr2.add(5);
//		arr2.add(4);
//		arr2.add(-3);
//		arr2.add(3);
//		arr2.add(3);
//		arr2.add(2);
//		arr2.add(0);
//		MaxOccurance(arr2);
		File file = new File ("/Users/abhinavkannojia/desktop/eclispse_projects/CollectionsAssignment/src/CollectionsAssignmentPackage");
		PrintStream o = new PrintStream(new File("A.txt")); 
		  
        // Store current System.out before assigning a new value 
        PrintStream console = System.out; 

        System.setOut(o); 
        System.out.println();
        System.out.println(SegregateVowelCosonents(userArray));
	
	}

}
