package problems.geeksforgeeks.tags.bitmagic;

public class MissingNumberInRange1toNPlus1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6};
		System.out.println(MissingNumberInRange.getMissingNumber(arr));
		
		int[] arr2 = {1,2,3,5,6, 7, 8, 9, 10};
		System.out.println(MissingNumberInRange.getMissingNumber(arr2));
		
	}
}

class MissingNumberInRange{

	/**
	 * arr[] = {1,2,3,4,6};
	 * length of array is 5
	 * range of numbers is from 1 to 6 (5+1) 
	 * 
	 * We can use exor property 
	 * 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 1 ^ 2 ^ 3 ^ 4 ^ 6 = 5
	 */
	public static int getMissingNumber(int[] arr) {
		
		int totalExor = 0;
		
		int nums =  arr.length + 1;
		/**
		 * We can optimize below code to get exor of 1 to num in O(1)
		 * for(int i=1; i <= nums; i++) {
				totalExor ^= i;
			}
		 */
		totalExor = getExorUpto(nums);
		
		for(int i = 0; i< arr.length; i++) {
			totalExor ^= arr[i];
		}
		return totalExor;
	}
		
	private static int getExorUpto(int num) {
		
		int rem = num % 4;
		
		if(rem == 1)
			return 1;
		if(rem == 2)
			return num +1;
		if(rem == 3)
			return 0;
		return num;
		
	}
}