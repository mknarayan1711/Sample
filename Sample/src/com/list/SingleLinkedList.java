package com.list;

public class SingleLinkedList {
	
	
	SNode head;
	
	public void addFront(int data){
		
		SNode newNode=new SNode(data,head);
		head=newNode;
	}
	
	public void addNext(SNode prevNode,int data){
		
		if(prevNode == null)
			return;
		
		SNode newNode=new SNode(data,prevNode.next);
		prevNode.next=newNode;
		
	}
	public void addEnd(int data){
		
		SNode newNode=new SNode(data,null);
		
		if(head==null){
			head=newNode;
			return;
		}
		SNode cur=head;
		while(cur.next!=null)
			cur=cur.next;
		cur.next=newNode;
		
	}
	public void deleteNode(int key){
		
		if(head==null)
			return;
		
		if(head.data == key){
			head=head.next;
			return;
		}
		
		SNode cur=head;
		SNode prev=head;
		while(cur!=null && cur.data != key){
			cur=cur.next;
		}
		
		prev.next=cur.next;
			
	}
	public void printList(){
		
		SNode cur=head;
		while(cur!=null){
			if(cur.next!=null)
				System.out.print(cur.data+"->");
			else
				System.out.println(cur.data);
		}
	}
	public static void main(String args[]){
		
		SingleLinkedList single=new SingleLinkedList();
		
		
	}

}
