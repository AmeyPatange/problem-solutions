package problems.leetcode.solution301to.solution600;

public class Problem389 {

	public static void main(String[] args) {
		
		Solution389 ss = new Solution389();
		System.out.println(ss.findTheDifference("abcd", "abcde"));
		System.out.println(ss.findTheDifference("", "e"));
		
	}
}

/**
 * Various Solutions:
 * 
 * 1) Sorting & Traversing
 * 		Step 1: Sort characters of String s 
 * 			n is Length of String
 * 			TC = O(nlogn), 
 * 			ASC = O(n) because String is Immutable in Java.Therefore, Use StringBuilder
 * 		Step 2: Sort characters of String t
 * 			n is Length of String
 * 			TC = O(nlogn), 
 * 			ASC = O(n) because String is Immutable in Java.Therefore, Use StringBuilder
 *		Step 3: Compare both sorted String to find extra character 		
 *			TC = O(n)
 *
 *		TC = O(nlogn), ASC = O(n)
 *
 * 2) Using HashMap to store occurrence of each character
 * 		Step 1: Traverse String t and put occurrences of each character in Map
 * 			n is Length of String
 * 			TC = O(n)
 * 			ASC = O(n) for Map<k, v>
 * 		Step 2: For each character key in HashMap check if the character is present in String s v times (occurrence of character in String t)
 * 		If No, then key is the output
 * 			n is Length of String
 * 			TC = O(n^2)
 * 			ASC = O(1)
 * 
 * 		TC = O(n^2), ASC = O(n)
 * 
 * Chosen 3) EXOR all characters of String s and String t to find the missing character
 * 	  Special Property of EXOR is (a ^ b ^ c ^ d) ^ (a ^ b ^ c) = d
 * 			
 * 		TC = O(n), ASC = O(1)
 * 	
 *	In Java, Use charAt(i) and get individual characters instead of using toCharArray() and getting new character array.
 *  toCharArray() creates new character array which requires O(n) space where n is length of String
 *  
 * @author Amey
 *
 */
class Solution389 {
    public char findTheDifference(String s, String t) {
        
    	if(t.length()==1)
            return t.charAt(0);
    	
        char exor = 0;
        for(int i=0; i < s.length(); i++) {
        	exor ^= s.charAt(i);
        }
        
        for(int i=0; i < t.length(); i++) {
        	exor ^= t.charAt(i);
        }
        
        return exor;
    }
}