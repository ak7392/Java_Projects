package LeetCode;
import java.util.*;
/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

	You may assume that the array is non-empty and the majority element always exist in the array.

	Example 1:

	Input: [3,2,3]
	Output: 3
	Example 2:

	Input: [2,2,1,1,1,2,2]
	Output: 2
 */

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int key = 0;
        for(int i =0; i<= nums.length-1; i ++){
            if (hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }else
                hmap.put(nums[i], 1);
        }
        
        int current_max = 0;
        for(Map.Entry<Integer,Integer> val: hmap.entrySet()){
            if (val.getValue() > current_max){
                current_max = val.getValue();
            }
        }
        
        for(Map.Entry<Integer,Integer> val: hmap.entrySet()){
            if (val.getValue() == current_max ){
               key = val.getKey();
            }
        }
        return key;
    }
	
	public static void main() {
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}

}
