package LeetCode;
/*
 * Given an array of integers A sorted in non-decreasing order, 
 * return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
public class SquaresOfSortedArray {
	public static int[] sortedSquaresArray(int[] A) {
	    int[] res = new int[A.length]; 
	       int left  = 0; 
	       int right = A.length - 1;
	        int i = A.length - 1 ;
	        while (left <= right){
	            if (Math.abs(A[left]) > Math.abs(A[right])){
	                res[i] = A[left] * A[left];
	                left++;
	               
	             }else{
	                res[i] = A[right] * A[right];  
	                 right--;
	            }i--;
	        }
	        return res;
	        
	        }
	public static void main(String args[]) {
		int[] arr = {-4,-1,0,3,10};
		int[] newarr = sortedSquaresArray(arr);
		
		for(int i=0; i<= newarr.length-1;i++) {
			System.out.println(newarr[i]);
		}
	}
}
