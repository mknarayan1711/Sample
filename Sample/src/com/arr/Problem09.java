package com.arr;
/*
 * Design a queue with O(1) getMiddle operation
 */

public class Problem09 {
	
	private class DLLNode{
		
		DLLNode prev;
		int data;
		DLLNode next;
	}
	
	private int count;
	private DLLNode head;
	private DLLNode mid;
	
	public void push(int data){
		
		DLLNode newNode=new DLLNode();
		newNode.data=data;
		newNode.prev=null;
		newNode.next=head;
		count++;
		
		if(count==1){
			
			mid=newNode;
		}
		else{
			head.prev=newNode;
			
			if(count % 2 != 0)
				mid=mid.prev;
		}
		
		head=newNode;
		
		
	}
	public int pop(){
		
		int item=head.data;
		DLLNode next=head.next;
		
		count=-1;
		if(next!=null)
			next.prev=null;
		
		if(count % 2 == 0)
			mid=mid.next;
		
		head=next;
		return item;
		
	}
	public int getMiddle(){
		
			if(count==0){
				System.out.println("Stack is Empty");
				return -1;
			}
		
		    return mid.data;
	}
	
	public static void main(String args[]){
		
		
		
		
	}

}
