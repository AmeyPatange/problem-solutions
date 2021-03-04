package problems.leetcode.solution1to.solution300;

public class Problem201 {

	public static void main(String[] args) {
		int m = 5;
		int n = 7;
		
		System.out.println(new BitwiseAnd().rangeBitwiseAnd(m, n));
	}
}

class BitwiseAnd{
	
	public int rangeBitwiseAnd(int m, int n) {
        
		if(m == 0 || m ==n)
			return m;
		
		while(true) {
			while(n > m) {
				n = n & (n-1);
			}
			if(m == n)
				return m;
			
			m = m ^ n;
            n = m ^ n;
            m = m ^ n;
            
		}
    }
	
	public int actual(int m ,int n) {
		
		if(m == 0)
            return m;
        
        int res = m;
        for(int i= m +1; i <= n; i++)
            res &= i;
        return res;
	}
}
