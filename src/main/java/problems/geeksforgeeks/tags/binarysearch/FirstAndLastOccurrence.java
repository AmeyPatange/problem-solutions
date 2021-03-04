package problems.geeksforgeeks.tags.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  Input
  	2
	9 5
	1 3 5 5 5 5 67 123 125
	9 7
	1 3 5 5 5 5 7 123 125
 
  Output
  	2 5
  	6 6
 */
public class FirstAndLastOccurrence {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int tests = Integer.parseInt(br.readLine());

		while (tests > 0) {

			String lengthAndNumS[] = br.readLine().split("\\s");
			int lengthAndNum[] = new int[2];

			for (int i = 0; i < lengthAndNumS.length; i++) {
				lengthAndNum[i] = Integer.parseInt(lengthAndNumS[i]);
			}

			String numbers[] = br.readLine().split("\\s");
			int[] arr = new int[lengthAndNum[0]];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(numbers[i]);
			}

			printFirstAndLastOccurrence(arr, lengthAndNum[1]);

			tests--;
		}
	}

	private static void printFirstAndLastOccurrence(int arr[], int num) {

		int firstOccurrence = firstOccurrence(arr, num);
		if (firstOccurrence == -1) {
			System.out.println(-1);
			return;
		}
		int lastOccurrence = lastOccurrence(arr, num);
		System.out.println(firstOccurrence + " " + lastOccurrence);

	}

	private static int firstOccurrence(int arr[], int num) {
		if (arr.length == 0)
			return -1;

		int low = 0, high = arr.length - 1;

		while (low <= high) {

			int mid = (low + high) >> 1;
			if (arr[mid] > num)
				high = mid - 1;
			else if (arr[mid] < num)
				low = mid + 1;
			else {
				if(mid == 0 || arr[mid] != arr[mid -1]) {
					return mid;
				}
				high = mid - 1;
			}
		}
		return -1;
	}

	private static int lastOccurrence(int arr[], int num) {
		if (arr.length == 0)
			return -1;

		int low = 0, high = arr.length - 1;

		while (low <= high) {

			int mid = (low + high) >> 1;
			if (arr[mid] > num)
				high = mid - 1;
			else if (arr[mid] < num)
				low = mid + 1;
			else {
				if(mid == arr.length -1 || arr[mid] != arr[mid + 1])
					return mid;
				low = mid + 1;
			}
		}
		return -1;
	}
}
