package problems.leetcode.solution301to.solution600;

public class Problem342 {

	public static void main(String[] args) {
		
		Solution342 s = new Solution342();
		System.out.println(s.isPowerOfFour(16));
		System.out.println(s.isPowerOfFour(1));
		System.out.println(s.isPowerOfFour(4));
		System.out.println(s.isPowerOfFour(3));
	}
}

/**
 * Approach
 * 
 * For a number to be Power of Four it should have only one bit set and the set bit should be at odd 
 * location from right
 * 
 * eg: 3 ==> Binary is 011 ==> Contains more than 1 set bit. Therefore, not power of 4
 * eg: 2 ==> Binary is 010 ==> Contains 1 set bit but set bit is at even location from right. Therefore, not power of 4
 * eg: 16==> Binary is 10000 ==> Contains 1 set bit & set bit is at odd location from right. Therefore, is power of 4
 * 
 * @author Amey
 *
 */

class Solution342 {
    public boolean isPowerOfFour(int n) {
        
    	return checkSetBits(n) == 1 && isLastShiftTill1(n);
    }
    
    private int checkSetBits(int num) {
    	
    	int res = 0;
    	while(num > 0) {
    		num = num & (num -1);
    		res++;
    	}
    	return res;
    }
    
    private boolean isLastShiftTill1(int num) {
    	
    	while(num > 1) {
    		num >>= 2;
    	}
    	
    	if(num == 1)
    		return true;
    	return false;
    }
}