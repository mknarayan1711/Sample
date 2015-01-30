package com.arr;
/*
 * Given an array of n items find out the majority element (Moore's Voting Algorithm)
 */

public class Problem13 {
	
	
	public boolean findMajority(int arr[]){
		
		
		int maj_index=0;
		int count=1;
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[maj_index] == arr[i])
				count++;
			else
				count--;
			if(count == 0){
				maj_index=i;
				count=1;
			}
			
		}
		
		int majority_element=arr[maj_index];
		count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==majority_element)
				count++;
		}
		if(count >= arr.length/2)
			return true;
		else
			return false;
		
		
		
	}
	public static void main(String args[]){
		
		
		
	}

}
