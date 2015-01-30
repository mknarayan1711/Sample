package com.arr;
/*
 * Divide the given array into two subarrays such that the difference between
 * two arrays is minimum
 */
public class Problem02 {
	
	
	private static int min(int x,int y){
		if(x < y)
			return x;
		else
			return y;
	}
	
	public static int divide(int arr[],int i,int X,int Y){
		if(i>=arr.length){
			return Math.abs(X-Y);
		}else{
			
			int x1=divide(arr,i+1,X+arr[i],Y);
			int x2=divide(arr,i+1,X,Y+arr[i]);
			return min(x1,x2);
			
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]={2,4,10,-10};
		System.out.println(divide(arr,0,0,0));
	}

}
