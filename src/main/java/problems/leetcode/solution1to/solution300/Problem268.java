package problems.leetcode.solution1to.solution300;

import java.util.Random;

public class Problem268 {
	
	public static void main(String[] args) {
		
		Solution268 ss = new Solution268();
		
		int size = 10;
		int randomNumber = new Random().nextInt(size);
		
		int arr[] = new int[size-1];
		int count = 0;
		for(int i=0; i < size; i++) {
			if(i == randomNumber)
				continue;
			arr[count++] = i; 
		}
		
		System.out.println(ss.missingNumber(arr));
	}
}

/**
 * Various Solutions:
 * 
 * 1) Sorting & Traversing
 * 		Step 1: Sort array 
 * 			TC = O(nlogn), 
 * 			ASC = O(1)
 * 		If 0 is not the first element after sorting 0 is the result
 * 		Step 2: Traverse the sorted array to check if element at a[i+1] != a[i] + 1.		
 *			TC = O(n)
 *
 *		TC = O(nlogn), ASC = O(1)
 *
 * 2) Using HashSet to store each number
 * 		Step 1: Traverse array and add each number in HashSet
 * 			TC = O(n)
 * 			ASC = O(n)
 * 		Step 2: Traverse from 0 to n and check if the number is present in HashSet
 * 		If No, then number is the output
 * 			TC = O(n)
 * 			ASC = O(1)
 * 
 * 		TC = O(n), ASC = O(n)
 * 
 * Chosen 3) EXOR all numbers from 0 to n
 * 	  Special Property of EXOR is (a ^ b ^ c ^ d) ^ (a ^ b ^ c) = d
 * 			Step 1: EXOR all numbers from 0 to n
 * 				TC = O(n)
 * 				ASC = O(1)
 * 			Step 2: EXOR all elements of Array
 * 				TC = O(n)
 * 				ASC = O(1)
 * 			Step 3: EXOR result of step1 and step2 to get the output			
 * 		
 * 		TC = O(n), ASC = O(1)
 * 	
 * @author Amey
 *
 */
class Solution268 {
    public int missingNumber(int[] nums) {
    	
    	int exor = 0;
    	for(int i=1; i <= nums.length; i++) {
    		exor ^= i;
    	}
    	for(int i=0; i < nums.length; i++) {
    		exor ^= nums[i];
    	}
    	return exor;
    }
}
