package problems.leetcode.solution1to.solution300;

public class Problem153 {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,1,2};
		System.out.println(new SortedRotatedDistinct().findMin(arr));
	}
}

class SortedRotatedDistinct {

	public int findMin(int[] arr) {

		if(arr.length == 1)
			return arr[0];
		
		int last = arr.length -1;
		if(arr[0] < arr[last])
			return arr[0];
		
		int low = 0;
		int high = last;
		while(low < high) {
			
			int mid = (low + high) >> 1;	
			
			if(arr[mid] > arr[high])
				low = mid + 1;
			else
				high = mid;
		}
		return arr[high];
	}

}