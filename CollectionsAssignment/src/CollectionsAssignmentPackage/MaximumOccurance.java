/*
 * Write a program that reads an unspecified number of integers and finds the one that has the most occurrences. 
 * The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3 3 3 2 0, 
 * the number 3 occurred most often. If not one but several numbers have the most occurrences, 
 * all of them should be reported. For example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, 
 * both occurrences should be reported.
 */

package CollectionsAssignmentPackage;
import java.util.*;

public class MaximumOccurance {
		
		public static void MaxOccurance(ArrayList<Integer> arr){
			Map<Integer, Integer> map = new HashMap<Integer, Integer >();
			ArrayList<Integer> result = new ArrayList();
			int current_max = 0;

			for(Integer val: arr) {
				if (map.containsKey(val)){
					map.put(val, map.get(val)+1);
				}
				else {
					map.put(val, 1);
				}
			}
		
			
			for(Map.Entry<Integer, Integer> val2: map.entrySet()) {
				if (val2.getValue() > current_max){
					current_max = val2.getValue();
				}	
			}
			
			
			for (Map.Entry<Integer, Integer> val2: map.entrySet()) {
				if (val2.getValue() == current_max ) {
					int max_key = val2.getKey();
					result.add(max_key);
				}
			}
			
			System.out.print(result);
						
			
		}
		
		
		public static void main(String args[]) {

			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(9);
			arr.add(30);
			arr.add(3);
			arr.add(9);
			arr.add(3);
			arr.add(2);
			arr.add(4);

			
		
			MaxOccurance(arr);
			
			System.out.println("-------------");
			
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			arr2.add(2);
			arr2.add(3);
			arr2.add(40);
			arr2.add(3);
			arr2.add(5);
			arr2.add(4);
			arr2.add(-3);
			arr2.add(3);
			arr2.add(3);
			arr2.add(2);
			arr2.add(0);
			MaxOccurance(arr2);

		
		}
}
		
		

