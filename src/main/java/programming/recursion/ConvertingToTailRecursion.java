package programming.recursion;

public class ConvertingToTailRecursion {

	public static void main(String[] args) {
		
		int n = 2150;
//		print(n);
		equivalentTail(n, 1);
	}
	
	private static void print(int num) {
		
		if(num==0)
			return;
		
		print(num -1);
		
		System.out.println(num);
	}
	
	private static void equivalentTail(int num, int k) {
		
		if(num==0)
			return;
		
		System.out.println(k);
		
		equivalentTail(--num, ++k);
	}
}


