package com.arr;
import java.util.Stack;
/*
 * Design a Stack Where we can design push,pop and getMin in O(1)
 * operation
 */

public class Problem07 {
	
	Stack<Integer> elements;
	Stack<Integer> minStack;
	
	public Problem07(){
		
		elements=new Stack<Integer>();
		minStack=new Stack<Integer>();
	}
	
	public int getMin(){
		
		return minStack.peek();
		
	}
	public void  push(int element){
		
		elements.push(element);
		if(minStack.isEmpty() || element < minStack.peek())
			minStack.push(element);
		
	}
	public boolean pop(){
		
		if(elements.isEmpty())return false;
		if(elements.peek() == minStack.peek())
			minStack.pop();
		elements.pop();
		return true;
		
	}
	public static void main(String args[]){
		
	}

}
