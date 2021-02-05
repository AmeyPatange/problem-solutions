package problems.geeksforgeeks.tags.bitmagic;

public class CountSetBits {
	
	public static void main(String[] args) {
		
		int num = 255;
		System.out.println(Solution.setBits(num));
		
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
}