package programming.recursion;

public class PalindromString {

	public static void main(String[] args) {
		String str = "abbacabba";
		System.out.println(isPalindrome(str, 0, str.length()-1));
	}
	
	public static boolean isPalindrome(String str, int low, int high) {
		
		if(low >= high)
			return true;
		
		if(str.charAt(low) != str.charAt(high))
			return false;
		
		return isPalindrome(str, ++low, --high);
	}
}
