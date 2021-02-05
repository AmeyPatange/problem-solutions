package problems.geeksforgeeks.tags.bitmagic;

public class AllSubStrings {

	public static void main(String[] args) {
		
		String str = "abc";
		
		new SubStrings().printAllSubstrings(str);
	}
}

class SubStrings{
	
	public void printAllSubstrings(String str) {
		
		int len  = str.length();
		
		int pow = (int)Math.pow(2, len);
		
		for(int j=0; j < pow; j++) {
			
			for(int i=0; i < str.length(); i++) {
				if((j & (1 <<i)) == 0) {
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}
}