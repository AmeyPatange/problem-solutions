package problems.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int tests = Integer.parseInt(br.readLine());
		
		while(tests > 0) {
			
			String nk[] = br.readLine().split("\\s");
			int nkArr[] = new int[nk.length];
			nkArr[0] = Integer.parseInt(nk[0]);
			nkArr[1] = Integer.parseInt(nk[1]);
			
			String[] arr = br.readLine().split("\\s");
			int solution[] = new int[nkArr[0]];
			
			for(int i=0; i< nkArr[0]; i++) {
				solution[i] = Integer.parseInt(arr[i]);
	        }
			
			int unsolved = 0;
			boolean isBot = true;
			boolean isSlow = false;
			for(int i=0; i < solution.length; i++) {
				if(solution[i] == -1) {
					unsolved++;
					isBot = false;
				}
				
				if(isBot && solution[i] > 1) {
					isBot = false;
				}
				
				if(!isSlow && solution[i] > nkArr[1]) {
					isSlow = true;
				}
			}
			
			if((Math.ceil(solution.length / 2)) < unsolved) {
				System.out.println("Rejected");
			}else if(isBot) {
				System.out.println("Bot");
			}else if(isSlow) {
				System.out.println("Too Slow");
			}else {
				System.out.println("Accepted");
			}
			
			
			tests--;
		}
	}
}
