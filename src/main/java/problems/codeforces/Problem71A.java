package problems.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem71A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Integer tests = Integer.parseInt(br.readLine());
		
		while(tests > 0){
			
			String str = br.readLine();
			
			if(str.length() > 10) {
				System.out.println(str.charAt(0)+ "" + (str.length() - 2) + "" + str.charAt(str.length()-1));
			}else {
				System.out.println(str);
			}
			
			tests--;
		}
	}
}
