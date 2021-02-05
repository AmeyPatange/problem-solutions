package programming.recursion;

public class PrintNTo1 {

	public static void main(String[] args) {
		
		int num = 100;
		print(num);
	}
	
	private static void print(int num) {
		
		if(num == 0)
			return;
		
		System.out.println(num);
		
		print(num -1);
	}
}

