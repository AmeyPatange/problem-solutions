package problems.leetcode.solution301to.solution600;

import java.util.ArrayList;
import java.util.List;

public class Problem401 {
	
	public static void main(String[] args) {
		
		Solution401 ss = new Solution401();
		System.out.println(ss.readBinaryWatch(1));
		
	}
}

/**
 * Approach
 * 
 * For each Hour from 0 to 11 : h
 * 		count setBits of h : sh
 * 
 * 		For each minute from 0 to 59 : m 
 * 			count setBits of m : sm
 * 
 * 			if sum of sm and sh equals input
 * 				then concat and add time in list
 * 
 * 	TC = O(1)
 * @author Amey
 *
 */
class Solution401 {
	public List<String> readBinaryWatch(int num) {
    	
    	List<String> timeList = new ArrayList<>();
    	
    	for(int i=0; i < 12; i++) {
    		int setBitsI = countSetBits(i);
    		if(setBitsI > num) {
    			continue;
    		}
    		if(setBitsI == num) {
    			timeList.add(0, i + ":00");
    		}
    		
    		for(int j=0; j < 60; j++) {
    			int setBitsj = countSetBits(j);
    			
    			if(setBitsI + setBitsj == num) {
    				timeList.add(0, i + ":" + (j < 10 ? "0" + j : j));
    			}
    		}
    	}
    	
    	return timeList;
    }
    
    private int countSetBits(int num) {
    	
    	int res = 0;
    	while(num > 0) {
    		num = num & (num -1);
    		res++;
    	}
    	return res;
    }
}