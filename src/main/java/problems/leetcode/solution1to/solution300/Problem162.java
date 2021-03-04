package problems.leetcode.solution1to.solution300;

public class Problem162 {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,1};
		
		System.out.println(arr[new PeakElement().findPeakElement(arr)]);
	}
}
class PeakElement{
	
	public int findPeakElement(int[] arr) {
        
		if(arr.length == 1)
			return 0;
		
		if(arr[0] > arr[1])
			return 0;
		
		int last = arr.length - 1;
		if(arr[last] > arr[last -1])
			return last;
		
		int low = 1;
		last--;
		
		while(low < last) {
			int mid = (low + last) >> 1;
			
			if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid -1])
				return mid;
		
			if(arr[mid] < arr[mid -1])
				last = mid - 1;
			
			else
				low = mid + 1;
		}
		return last;
    }
}