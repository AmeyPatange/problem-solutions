package problems.leetcode.solution601to.solution900;

public class Problem852 {

	public static void main(String[] args) {

		int[] arr = {24,69,100,99,79,78,67,36,26,19};
		System.out.println(new MountainArray().peakIndexInMountainArray(arr));
	}

}

class MountainArray {

	public int peakIndexInMountainArray(int[] arr) {
		
		int low = 1;
		int last = arr.length -2;
		
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