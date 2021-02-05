package programming.recursion;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(factorial(num));
		System.out.println(tailRecursiveFactorial(num , 1));
	}
	
	private static int factorial(int num) {
		
		if(num == 0 || num ==1)
			return 1;
		
		return num * factorial(num -1);
	}
	
	private static int tailRecursiveFactorial(int num, int k) {
		
		if(num == 0 || num == 1)
			return k;
		
		return tailRecursiveFactorial(num -1 , k*num);
	}
}
