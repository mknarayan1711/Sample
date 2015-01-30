package com.ds;

public class QuickSort {
	
	public int partition(int arr[],int si,int ei){
		
		
		int x=arr[ei];
		int i=(si-1);
		int j;
		
		for(j=si;j<=ei-1;j++){
			
			if(arr[j] <= x){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[ei];
		arr[ei]=temp;
		
		return i+1;
		
	}
	

	public void quicksort(int arr[],int si,int ei){
		
		int pi;
		if(si < ei){
			
			pi=partition(arr,si,ei);
			quicksort(arr,si,pi-1);
			quicksort(arr,pi+1,ei);
		}
		
	}
	
	
	public static void main(String args[]){
		
		QuickSort sort=new QuickSort();
		int arr[]={37,8,3,12,18,14};
		sort.quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

}
