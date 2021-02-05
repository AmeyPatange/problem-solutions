package problems.leetcode.solution1to.solution300;

public class Problem190 {

	public static void main(String[] args) {

		Solution190 s = new Solution190();
		System.out.println(s.reverseBits(43261596));

	}
}

/**
 * Approach
 * 
 * Initialize result to 0
 * For each Bit of Integer n 
 * 		Identify its last bit : lastBit
 * 		Right Shift n by 1
 * 		Left Shift result by 1
 * 		if lastBit == 1
 * 			add 1 to result
 * 
 * The result is output
 * 
 * TC = O(n) where n is number of bits
 * @author Amey
 *
 */
class Solution190 {

	public int reverseBits(int n) {

		int result= 0;
		
		for (int i = 0; i < 32; i++) {
			int lastBit = n & 1;
			n >>>= 1; 
			
			result <<= 1;
			if(lastBit == 1) {
				result += 1;
			}
		}
		
		return result;
	}
}