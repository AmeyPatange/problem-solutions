package problems.geeksforgeeks.tags.bitmagic;

public class TwoOccurrences {

	public static void main(String[] args) {
		
		int[] arr = {4, 2, 4, 5, 2, 3, 3, 1};
		
		int[] output = new FindTwoOccurrences().twoOddNum(arr);
		System.out.println(output[0] + " & " + output[1]);
	}
}

class FindTwoOccurrences{
	
	public int[] twoOddNum(int arr[])
    {
        int xor = 0;
        
        for(int i=0; i < arr.length; i++) {
        	xor ^= arr[i];
        }
		
        int rightMostSetBit = getRightMostSetBit(xor); 
        		
		int res1 =0, res2 = 0;
		
		for(int i=0; i < arr.length; i++) {
			if((arr[i] & rightMostSetBit) == 0) {
				res1 ^= arr[i];
			}else {
				res2 ^= arr[i];
			}
		}
		
		return new int[]{res1, res2};
    }
	
	private int getRightMostSetBit(int n) {
		
		return n & ~(n - 1);
	}
	
}
