package com.arr;
/*
 * Find the equilibrium index in the array
 */
public class Problem05 {
	
	
	
	public boolean equilibrium(int arr[]){
		
		int totalSum=0;
		int leftSum=0;
		for(int i=0;i<arr.length;i++)
			totalSum+=arr[i];
		
		for(int i=0;i<arr.length;i++){
			
			leftSum+=arr[i];
			totalSum-=leftSum;
			if(leftSum == totalSum)
				return true;
			
		}
		
		return false;
		
	}

}
