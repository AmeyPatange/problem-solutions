package problems.leetcode.solution1to.solution300;

public class Problem33 {

	public static void main(String[] args) {
		
		int arr[] = {1,3};
		int target = 3;
		
		System.out.println(new SortedNRotated().search(arr, target));
		
	}
}
class SortedNRotated{
	
	public int search(int[] num, int target) {
		
		if(num.length == 1){
            return num[0] == target ? 0 : -1;
        }
		
		int low = 0, high = num.length -1;
		
		while(low <= high) {
			
			int mid = (low + high) >> 1;
			
			if(num[mid] == target) return mid;
			//left half is increasing
			if(low == mid || num[low] < num[mid]) {
				
				if(num[low] <= target && target < num[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}else {//right half is increasing
				
				if(num[mid] < target && target <= num[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		return -1;
	}
}
