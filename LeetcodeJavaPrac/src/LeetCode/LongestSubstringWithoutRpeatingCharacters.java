package LeetCode;
import java.util.*;
public class LongestSubstringWithoutRpeatingCharacters {
	 public static int lengthOfLongestSubstring(String s) {
	        
	        char[] chArray = s.toCharArray();
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        int max_substring = 0;
	        
	        for(int j=0; j < s.length(); j ++){
	            char item = s.charAt(j);
	            if (map.containsKey(item)){
	                map.put(item, map.get(item) + 1);
	            }else
	                map.put(item, 1);
	        }
	        
	        for(int i=0; i <s.length()-1; i++){
	            int index = i;
	            int current_max = 0;
	            
	            while (index < s.length()-1){
	                for(Map.Entry<Character, Integer> val: map.entrySet()){
	                    if(val.getValue() == 1){
	                        max_substring++;
	                    }else break;
	                }  
	            }
	        }
	        
	        return max_substring;	            
	    }
	 
	 public static void main(String args[]){
		 String s = "abcabcbb";
		 System.out.println(lengthOfLongestSubstring(s));
		 
	 }
}
