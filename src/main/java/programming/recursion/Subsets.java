package programming.recursion;

public class Subsets {
	
	public static void main(String[] args) {
		
		String str = "abc";
		printAllSubsets(str, "" , 0);
		
	}
	
	public static void printAllSubsets(String str, String ch , int level) {
		
		if(level == str.length()) {
			System.out.println(ch);
			return;
		}
		
		printAllSubsets(str, ch + str.charAt(level), level + 1);
		printAllSubsets(str, ch , level+1);
	}
}
