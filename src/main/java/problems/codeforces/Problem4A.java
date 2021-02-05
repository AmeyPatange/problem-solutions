package problems.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Integer weight = Integer.parseInt(br.readLine());
		
		if(weight % 2 == 0 && weight != 2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
