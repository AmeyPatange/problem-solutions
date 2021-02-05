package programming.recursion;

public class RopeCuttingProblem {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(maxCuts(n, 2, 5,1));
		
	}
	
	/**
	 * Cut rope of length n into pieces only from set {a,b,c} such that maximum possible pieces are achieved  
	 */
	public static int maxCuts(int ropeLen , int a , int b, int c) {
		
		if(ropeLen < 0)
			return -1;
		
		if(ropeLen == 0)
			return 0;
		
		int res1 = maxCuts(ropeLen -a, a, b, c);
		int res2 = maxCuts(ropeLen -b, a, b, c);
		int res3 = maxCuts(ropeLen -c, a, b, c);
		
		int res = Math.max(res1, Math.max(res2, res3));
		
		return (res >= 0) ? 1+ res : -1;
 	}
}

