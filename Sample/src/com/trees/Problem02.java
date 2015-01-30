package com.trees;
import java.util.Stack;
/*
 * Binary Search Tree Iterator 
 * 
 * 
 * Implement an iterator for the Binary Search Tree. Your Iterator Will be initialized
 * with the root of the BST
 * calling next() will return next smallest number from BST
 * next and hasNext() should run in average O(1) time and O(h) where h 
 * is height of the tree
 */


public class Problem02 {
	
	private Stack<Node> stack=new Stack<Node>();
	private Node root;
	private Node preNode;
	
	public Problem02(Node root){
		
		this.root=root;
		stack=new Stack<Node>();
		stack.addAll(fillStackWithLeftMost(root));
	}
	
	public boolean hasNext(){
		if(!stack.isEmpty()){
			return false;
		}
		else{
			preNode=stack.pop();
			stack.addAll(fillStackWithLeftMost(preNode.rightChild));
			return true;
		}
		
	}
	public int next(){
		return preNode.data;
	}
	public Stack<Node> fillStackWithLeftMost(Node current){
		
		Stack<Node> result=new Stack<Node>();
		while(current!=null){
			result.push(current);
			current=current.leftChild;
		}
		return result;
	}
	
	
	
	
	
	
	public static void main(String args[]){
		
		
	}

}
