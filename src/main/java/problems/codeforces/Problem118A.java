package problems.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem118A {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name = br.readLine();
		
		StringBuilder sb = new StringBuilder(name.length());
		
		for(int i=0; i < name.length(); i++) {
			switch(name.charAt(i)) {
			case 'A':
			case 'a':
			case 'O':
			case 'o':
			case 'y':
			case 'Y':
			case 'e':
			case 'E':
			case 'U':
			case 'u':
			case 'i':
			case 'I': continue;
			}
			
			sb.append("." + (name.charAt(i) < 97 ? (char)(32 + name.charAt(i)) : name.charAt(i)));
		}
		System.out.println(sb.toString());
	}
}
