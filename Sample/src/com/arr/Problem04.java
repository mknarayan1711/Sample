package com.arr;

import com.ds.MaxHeap;
import com.ds.MinHeap;

/*
 * Median in  stream of integers is
 * If the length is Odd middle element of the sorted data
 * If the length is Even average of two middle elements in the sorted 
 * stream
 */
public class Problem04 {
	
	private int currentMedian;
	private MaxHeap maxHeap;
	private MinHeap minHeap;
	
	public Problem04(){
		
		currentMedian=0;
		maxHeap=new MaxHeap(100);
		minHeap=new MinHeap(100);
	}
	
	public void getMedian(int ele){
		
		int sig=maxHeap.getCount()-minHeap.getCount();
		
		switch(sig){
		
		case 1:// 2 5 8 9 10 
				  if(ele < currentMedian){
					  
					  minHeap.insert(maxHeap.remove());
					  maxHeap.insert(ele);
					  
				  }
				  else{
					  minHeap.insert(ele);
				  }
			
				  currentMedian=(maxHeap.getTop()+minHeap.getTop())/2;
		case 0:
				if(ele < currentMedian){
					
					maxHeap.insert(ele);
					currentMedian=maxHeap.getCount();
				}
				else{
					minHeap.insert(ele);
					currentMedian=minHeap.getCount();
				}
			
		case -1:
				if(ele < currentMedian){
					
					maxHeap.insert(ele);
				}
				else{
					
					maxHeap.insert(minHeap.remove());
					minHeap.insert(ele);
					
				}
					
				currentMedian=(maxHeap.getTop()+minHeap.getTop())/2;
		}
		
	}
	
	public static void main(String args[]){
		
		
		
	}

}
