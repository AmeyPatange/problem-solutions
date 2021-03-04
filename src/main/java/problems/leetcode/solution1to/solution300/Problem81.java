package problems.leetcode.solution1to.solution300;

public class Problem81 {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
		int target = 2;

		System.out.println(new SortedAndRotatedDuplicates().search(arr, target));

	}
}

class SortedAndRotatedDuplicates {

	public boolean search(int[] arr, int target) {
		
		if(arr.length == 1){
            return arr[0] == target;
        }
		
		int low = 0, high = arr.length -1;
		
		while(low <= high) {
			
			int mid = (low + high) >> 1;
			if(arr[mid] == target)
				return true;
			
			if(arr[low] == arr[mid] && arr[high] == arr[mid]) {
				low++;
				high--;
				continue;
			}
			//left half is increasing
			if(arr[low] <= arr[mid]) {
				
				if(arr[low] <= target && target <= arr[mid])
					high = mid -1;
				else
					low = mid + 1;
				
			}else {//right half is increasing
				
				if(arr[mid] < target && target <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		return false;
	}

}