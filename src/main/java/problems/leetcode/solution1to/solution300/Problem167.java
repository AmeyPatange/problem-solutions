package problems.leetcode.solution1to.solution300;

public class Problem167 {

	public static void main(String[] args) {
		
		int[] arr = {-1,0};
		int target = -1;
		
		int[] indexes = new PairExists().twoSum(arr, target);
		
		System.out.println(indexes[0] + " " + indexes[1]);
	}
}

class PairExists{
	
	public int[] twoSum(int[] arr, int target) {
		
		int low = 0;
		int high = arr.length -1;
		
		while(low < high) {
			
			int sum = arr[low] + arr[high];
			if(sum == target)
				return new int[] {1+low, 1+high};
			
			if(sum < target)
				low++;
			else
				high--;
		}
		return null;
    }
}