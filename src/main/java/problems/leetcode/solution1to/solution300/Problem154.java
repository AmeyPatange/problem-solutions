package problems.leetcode.solution1to.solution300;

public class Problem154 {

	public static void main(String[] args) {
		
		int[] arr = {2,2,2,0,2,2};
		System.out.println(new SortedRotatedDuplicate().findMin(arr));
	}
}

class SortedRotatedDuplicate{
	
	public int findMin(int[] arr) {
        
		if(arr.length == 1) {
			return arr[0];
		}
		
		int low = 0;
		int high = arr.length -1;
		
		while(low < high) {
			
			int mid = (low + high) >> 1;
		
			if(arr[mid] == arr[high])
				high--;
			
			else if(arr[mid] > arr[high])
				low = mid + 1;
			
			else
				high = mid;
			
		}
		return arr[high];
    }
}