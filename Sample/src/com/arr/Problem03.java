package com.arr;

import com.ds.QuickSort;
/*
 * Triplet Sum Problem
 */

public class Problem03 {
	
	public boolean isTripletSum(int arr[],int sum){
		
		QuickSort sort=new QuickSort();
		sort.quicksort(arr, 0,arr.length);
		
		for(int i=0;i<arr.length;i++){
			
			int elem=arr[i];
			int left=i+1;
			int right=arr.length-1;
			while(left < right){
				
				if(elem+arr[left]+arr[right] == sum)
					return true;
				
				left++;
				right--;
			}
		}
		
		return false;
		
	}
	
	public static void main(String args[]){
		
		int arr[]={12,3,4,1,6,9};
		int sum=24;
		
		
	}

}
