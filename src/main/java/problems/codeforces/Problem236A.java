package problems.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problem236A {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name = br.readLine();
		
		HashSet<Character> characters = new HashSet<>(name.length());
		
		for(int i=0; i < name.length(); i++) {
			characters.add(name.charAt(i));
		}
		
		if(characters.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
	}
}
