package com.ds;

public class MinHeap {
	
	private int[] Heap;
	private int   size;
	private int  maxSize;
	
	private static final int  FRONT=1;
	
	public MinHeap(int maxSize){
		
		this.maxSize=maxSize;
		this.size=0;
		Heap=new int[this.maxSize];
		Heap[0]=Integer.MIN_VALUE;
	}
	
	private int parent(int pos){
		return pos/2;
	}
	private int leftChild(int pos){
		return 2*pos;
	}
	private int rightChild(int pos){
		return 2*pos+1;
	}
	private boolean isLeaf(int pos){
		
		if(pos >= (size/2) && pos <=size)
			return true;
		else
			return false;
	}
	private void swap(int si,int ei){
		
		int tmp=Heap[si];
		Heap[si]=Heap[ei];
		Heap[ei]=tmp;
	}
	public int getTop(){
		return Heap[FRONT];
	}
	public int getCount(){
		return size;
	}
	public void insert(int element){
		
		Heap[++size]=element;
		int current=size;
		
		while(Heap[current] < Heap[parent(current)]){
			swap(current,parent(current));
			current=parent(current);
		}
	}
	public int remove(){
		
		int popped=Heap[FRONT];
		Heap[FRONT]=Heap[size--];
		minHeapify(FRONT);
		return popped;
	}
	public void minHeapify(int pos){
		
		if(!isLeaf(pos)){
			
			int leftChild=leftChild(pos);
			int rightChild=rightChild(pos);
			
			if(Heap[pos] > Heap[leftChild] || Heap[pos] > Heap[rightChild]){
				

				if(Heap[leftChild] < Heap[rightChild]){
					
					swap(pos,leftChild);
					minHeapify(leftChild);
					
				}
				else{
					swap(pos,rightChild);
					minHeapify(rightChild);
					
				}
				
			
			}
				
		}
		
	}
	public static void main(String args[]){
		
		MinHeap heap=new MinHeap(100);
		
		heap.insert(5);
		heap.insert(3);
		heap.insert(10);
		heap.insert(17);
		heap.insert(84);
		heap.insert(19);
		heap.insert(6);
		heap.insert(22);
		heap.insert(9);
		
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		
	}

}
