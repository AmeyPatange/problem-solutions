package programming.recursion;

public class SumOfN {
	
	public static void main(String[] args) {
		
		int num = 5;
		System.out.println(sum(num));
		System.out.println(tailRecursiveSum(num, 0));
	}
	
	public static int sum(int num) {
		
		if(num == 0)
			return 0;
		
		return num + sum(num -1);
	}
	
	public static int tailRecursiveSum(int num, int sum) {
		
		if(num == 0)
			return sum;
		
		return tailRecursiveSum(num -1 , sum + num);
	}
}
