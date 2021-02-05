package problems.leetcode.solution1to.solution300;

public class Problem231 {
	
	public static void main(String[] args) {
		
		Solution231 s = new Solution231();
		System.out.println(s.isPowerOfTwo(3));
		
	}
}

/**
 * Approach
 * 
 * If a Binary number is Power of 2 then it will have only 1 set bit
 * 
 * @author Amey
 *
 */
class Solution231 {
    public boolean isPowerOfTwo(int n) {
        
        return countSetBits(n) == 1;
    }
    
    private int countSetBits(int num) {
    	
    	int res = 0;
    	
    	while(num > 0) {
    		num = num & (num -1);
    		res++;
    	}
    	return res;
    }
}
