/*
 * Given an unsorted array of size n. 
 * Array elements are in the range from 1 to n. 
 * One number from set {1, 2, …n} is missing and one number occurs twice in the array. 
 * Find these two numbers.
Examples: 
Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array, 
2 is missing and 3 occurs twice 

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1

 */
package CollectionsAssignmentPackage;
import java.util.*;

public class MissingRepeatElements {
	
	public static void ConsecutiveIntegers(ArrayList<Integer> arr){
		int count = 0;
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		int[] result = new int[arr.size()];
		int sum_new = 0;
		for (int i = 1; i < arr.size()-1; i++) {
			if (hm.containsKey(arr.get(i))) {
				continue;
				}
			++sum_new;
			}
		sum_new = sum_new + 1;	
		System.out.println("Missing Number: "+ sum_new);
			
		for (Integer item: arr) {	
			 if (hm.containsKey(item)){
				hm.put(item, hm.get(item)+1);
			}else {
				hm.put(item, 1);
			}
		}
					
					
		for (Map.Entry<Integer , Integer> val: hm.entrySet()) {
			if (val.getValue() > 1) {
				System.out.println("Repeating Element : "+ val.getKey() );
			}
		
		
		}
	}
	
	
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(3);
//		do {
//			System.out.println("Enter values to List in Order to find repeating Elements");
//			int n1 = sc.nextInt();
//			arr.add(n1);
//			
//		}while(sc.nextLine() == "N");
		
	
		ConsecutiveIntegers(arr);
		
		System.out.println("-------------");
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(4);
		arr2.add(3);
		arr2.add(6);
		arr2.add(2);
		arr2.add(1);
		arr2.add(1);
		ConsecutiveIntegers(arr2);
	
	}
}
	
	

