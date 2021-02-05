package programming.recursion;

public class Print1ToN {

	public static void main(String[] args) {
		
		int num = 215;
		print(num);
	}
	
	private static void print(int num) {
		
		if(num ==0)
			return;
		
		print(num -1);
		System.out.println(num);
	}
}

