package problems.leetcode.solution301to.solution600;

public class Problem338 {

	public static void main(String[] args) {
		
		Solution338 s = new Solution338();
		
		int[] arr = s.countBits(5);
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}

class Solution338 {
    public int[] countBits(int num) {
        
    	int[] arr = new int[num + 1];
    	
    	for(int i=0; i <= num; i++) {
    		if((i & 1) == 0) {
    			arr[i] = countSetBits(i);
    		}else {
    			arr[i] = arr[i-1] + 1;
    		}
    		
    	}
    	
    	return arr;
    }
    
    private int countSetBits(int num) {
    	int res = 0;
    	
    	while(num > 0) {
    		num = num & (num  -1);
    		res++;
    	}
    	return res;
    }
}