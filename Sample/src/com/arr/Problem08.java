package com.arr;

import java.util.Queue;
import java.util.LinkedList;
/*
 * Design a Queue operation where we design getMin operation in O(1) time
 */

public class Problem08 {
	
	Queue<Integer> elements;
	Queue<Integer> minQueue;
	
	public Problem08(){
		
		elements=new LinkedList<Integer>();
		minQueue=new LinkedList<Integer>();
	}
	public int getMin(){
		
		return minQueue.peek();
		
	}
	public void enqueue(int element){
		
		elements.add(element);
		if(minQueue.isEmpty() || element < minQueue.peek())
			minQueue.add(element);
		
	}
	public boolean dequeue(){
		
		if(elements.isEmpty())
			return false;
		if(minQueue.peek() == elements.peek())
			minQueue.remove();
		elements.remove();
		return true;
		
	}
	public static void main(String args[]){
		
		
		
	}

}
