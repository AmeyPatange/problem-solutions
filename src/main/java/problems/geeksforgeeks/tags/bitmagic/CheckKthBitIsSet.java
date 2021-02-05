package problems.geeksforgeeks.tags.bitmagic;



public class CheckKthBitIsSet {
	
	public static void main(String[] args) {
		
		int num = 500; 
		int k = 3;
		
		System.out.println(CheckBit.checkKthBit(num, k));
		
	}
	
}

class CheckBit{
    /**
     * Index starts with 0 from LSB
     */
    static boolean checkKthBit(int n, int k){
        
        int shifted = 1 << k;
    	
        return (n & shifted) != 0;
    }
    
}
