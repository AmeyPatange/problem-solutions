package problems.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Problem1A {

	public static void main(String[] args) throws IOException {
		
		/*
		 * int[] array = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		 */
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String nums[] = br.readLine().split("\\s"); 
		double num[] = new double[3];
		
		for(int i=0; i<nums.length; i++) {
            num[i] = Double.parseDouble(nums[i]);
        }
		
		double rows = Math.floor(num[0] / num[2]);
		if(num[0] % num[2] > 0) {
			rows++;
		}
		
		double cols = Math.floor(num[1] / num[2]);
		if(num[1] % num[2] > 0) {
			cols++;
		}
		
		BigDecimal biCol = new BigDecimal(String.valueOf(cols));
		
		BigDecimal biRow = new BigDecimal(String.valueOf(rows));
		
		System.out.println(biRow.multiply(biCol).longValueExact());
	}
}
