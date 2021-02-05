package programming.recursion;

public class NumberOfSubsetsHavingSum {

	public static void main(String[] args) {
		
		int arr[] = {10, 5 ,2, 3, 6};
		int sum = 8;
		
		System.out.println(numOfSubsets(arr, sum, 0));
	}
	
	private static int numOfSubsets(int[] arr, int sum, int index) {
		
		if(sum == 0)
			return 1;
		
		if(index == arr.length || sum < 0)
			return 0;
		
		int res1 = numOfSubsets(arr, sum - arr[index] , index + 1);
		int res2 = numOfSubsets(arr, sum  , index + 1);
		
		return res1 + res2;
	}
	
}
