package com.trees;

/*
 * Convert a binary tree where all the right nodes are leaf nodes
 * 
 * Flip it upside down and turn into a tree which has left leaf nodes
 * 
 * 
 * 
 * 		    	1                           6
 *            /   \                       /   \ 
 *          2      3     =>              7     4
 *        /  \                               /   \
 *       4   5                              5     2
 *     /  \                                      / \  
 *    6    7                                    3   1
 * 
 */

public class Problem03 {
	
	
	public Node makeUpsideDown(Node node){
		
		if(node==null)
			return null;
		if(node.leftChild==null  && node.rightChild==null)
			return node;
		
		Node newRoot=makeUpsideDown(node.leftChild);
		
		node.leftChild.leftChild=node.rightChild;
		node.leftChild.rightChild=node;
		node.leftChild=null;
		node.rightChild=null;
		
		return newRoot;
		
	}
	public static void main(String args[]){
		
		
		
	}
	

}
