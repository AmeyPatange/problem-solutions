package problems.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemContest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int tests = Integer.parseInt(br.readLine());
		
		while(tests > 0) {
			
			int num = Integer.parseInt(br.readLine());
			
			if(num < 2020) {
				System.out.println("NO");
			}else {
				if(isPossibleWithSum(num)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
				
			}
			tests--;
		}
		
	}
	
	private static boolean isPossibleWithSum(int num) {
		
		if(num == 0) {
			return true;
		}
		
		if(num < 2020) {
			return false;
		}
		
		boolean res1 = isPossibleWithSum(num - 2020);
		boolean res2 = isPossibleWithSum(num - 2021);
		
		return res1 | res2;
	}
}
