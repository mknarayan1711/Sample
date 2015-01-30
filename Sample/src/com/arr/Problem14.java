package com.arr;
/*
 * given an integer n, return the number of trailing zeros in n!
 * The idea is to use a prime factor
 */

public class Problem14 {
	
	
	public static int findTrailingZero(int num){
	
		int count=0;
		
		for(int i=5;num/i>=1;i*=5)
			count+=num/i;		
			
		return count;
		
	}	
	public static void main(String args[]){
		
		System.out.println(findTrailingZero(100));
		
	}

}
