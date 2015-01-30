package com.arr;

import java.util.HashSet;

/*
 * You have an  array of positive and negative numbers print all the subsets 
 * which is equal to zero
 */

public class Problem01 {
	
	
	public boolean findSubset(int arr[]){
		
		HashSet<Integer> num=new HashSet<Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++){
			
			sum+=arr[i];
			
			if(sum == 0 || arr[i] == 0 || num.contains(sum))
				return true;
			
			num.add(arr[i]);
		}
		
		return false;
	}
	
	public static void main(String args[]){
		
	}

}
