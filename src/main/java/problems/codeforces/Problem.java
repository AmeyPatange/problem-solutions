package problems.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int tests = Integer.parseInt(br.readLine());
		
		while(tests > 0) {
			
			String nums[] = br.readLine().split("\\s"); 
			long num[] = new long[3];
			
			for(int i=0; i<nums.length; i++) {
	            num[i] = Long.parseLong(nums[i]);
	        }
			
			long maxNum = num[2] / num[0];
			for(long i= maxNum ; i >=0 ; i--) {
				long res = num[0] * i + num[1];
				if(res <= num[2] && res % num[0] == num[1]) {
					System.out.println(res);
					break;
				}
			}
			tests--;
		}
	}
}
