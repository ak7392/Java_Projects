package LeetCode;
/*
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */
public class DefangingIP {
    public static String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        int coutDot = getCountDot(chars);
        char[] charsModif = new char[chars.length + coutDot * 2];

        int j = 0;
        for (char aChar : chars) {
            if ('.' == aChar) {
                charsModif[j++] = '[';
                charsModif[j++] = '.';
                charsModif[j++] = ']';
            } else {
                charsModif[j++] = aChar;
            }
        }
        return String.valueOf(charsModif);
    }

    private static int getCountDot(char[] chars) {
        int countDot = 0;
        for (Character c : chars) {
            if ('.' == c) {
                countDot++;
            }
        }
        return countDot;
    }
    
    public static void main(String ars[]) {
    	System.out.println(defangIPaddr("1.1.1.1"));
    }
}
