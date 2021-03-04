package problems.geeksforgeeks.tags.bitmagic;

public class PowerOf2 {

	public static void main(String[] args) {
		
		int num = 1024;
		System.out.println(PowerCheck.isPowerofTwo(num));
		System.out.println(PowerCheck.isPowerOfTowOtherSolution(num));
		
	}
}

class PowerCheck{
    
    // Function to check if given number is power of two
	/*
	 * If a number is power of 2 it will have only 1 bit as set
	 */
    public static boolean isPowerofTwo(long n){
    	
        long res = 0;
        while(n > 0) {
        	n = n & (n-1);
        	res++;
        }
        
        return res == 1;
    }
    
    /**
     * Keep multiplying a number by 2 until number equals n or crosses n
     */
    public static boolean isPowerOfTowOtherSolution(long n) {
    	
    	long num  = 2;
    	
    	while(true) {
    		
    		if(num > n)
    			return false;
    		
    		if(num == n)
    			return true;
    		
    		num *= 2;
    	}
    }
}