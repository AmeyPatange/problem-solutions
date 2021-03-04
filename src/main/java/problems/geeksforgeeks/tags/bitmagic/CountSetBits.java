package problems.geeksforgeeks.tags.bitmagic;

public class CountSetBits {
	
	public static void main(String[] args) {
		
		int num = 255;
		System.out.println(Solution.setBits(num));
		System.out.println(Solution.setBitsOtherSolutioin(num));
	}
}

class Solution{
	
	/**
	 * Using Brian Kernighan's Algorithm
	 */
    static int setBits(int num){
    	
    	int res = 0;
    	while(num > 0) {
    		num = num & (num - 1);
    		System.out.println(num);
    		res++;
    	}
    	return res;
    }
    
    /**
     * Check if last bit is set and then right shift the number
     */
    static int setBitsOtherSolutioin(int num) {
    	
    	int res = 0;
    	while(num > 0) {
    		int lastBit = num & 1;
    		if(lastBit == 1)
    			res++;
    		num >>>= 1;
    	}
    	return res;
    }
    
}