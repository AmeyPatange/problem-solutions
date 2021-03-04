package problems.geeksforgeeks.tags.bitmagic;



public class CheckKthBitIsSet {
	
	public static void main(String[] args) {
		
		int num = 500; 
		int k = 4;
		
		System.out.println(CheckBit.checkKthBit(num, k));
		
	}
	
}

class CheckBit{
    /**
     * Least Significant Bit(LSB) is at bit position 1
     */
    static boolean checkKthBit(int n, int k){
        
    	System.out.println(Integer.toBinaryString(n));
        int shifted = 1 << (k -1 );
    	
        return (n & shifted) != 0;
    }
    
}
