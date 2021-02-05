package test.rough;

public class TestRough {
	
	public static void main(String[] args) {
		
		int i= 1;
		int exor = 0;
		
		for(; i <= 32 ; i++) {
			exor ^= i;
			System.out.println("Exor Till " + i + " is " + exor);
		}
		
	}
	
}
