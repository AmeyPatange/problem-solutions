package problems.geeksforgeeks.tags.bitmagic;

public class OneOddOccurring {

	public static void main(String[] args) {
		
		int []arr = {5, 7, 2, 7, 5, 2, 5};
		
		System.out.println(new OddOccur().getOddOccurrence(arr));
	}
}

class OddOccur {
	/**
	 * Since all elements in array except 1 are even occurring,
	 * 
	 * we can use following property of exor:
	 *  x ^ x = 0
	 *  x ^ x ^ x = x
	 *  x ^ y ^ z ^ x ^ y = z
	 *  x & y will cancel out each other since x ^ x = 0
	 */
    int getOddOccurrence(int[] arr) {

    	int num = 0;
    	
    	for(int i=0; i < arr.length; i++) {
    		num ^= arr[i];
    	}
    	return num;
    }
}
