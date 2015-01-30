package com.trees;
import java.util.Stack;

public class Problem01 {
	
	
	//Iterative post-order traversal
	public void postOrder(){
		
	}
	
	
	
	//Iterative inorder traversal
	public void inorder(Node root){
		
		
		if(root==null)
			return;
		
		Stack<Node> stack=new Stack<Node>();
		
		while(!stack.isEmpty() || root!=null){
			
			
			if(root!=null){
			
				stack.push(root);
				root=root.leftChild;
			
			}
			else{
				
				Node t=stack.pop();
				System.out.println(t.data);
				root=t.rightChild;
			}
			
		}
		
	
	}	
	
	
	//Iterative preorder traversal
	public void preorder(Node root){
		
			if(root==null)
				return;
			
			Stack<Node> stack=new Stack<Node>();
			stack.push(root);
			while(!stack.isEmpty()){
				
				root=stack.pop();
				System.out.println(root.data);
				
				if(root.rightChild != null)
					stack.push(root.rightChild);
				
				if(root.leftChild != null)
					stack.push(root.leftChild);
				
				
			}
		
		
	}
	
	
	public static void main(String args[]){
		
		
		
	}

}
