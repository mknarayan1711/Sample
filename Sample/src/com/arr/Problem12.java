package com.arr;
import java.util.HashMap;

public class Problem12 {
	
	
	private HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	private String CHARACTERS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	
	public Problem12(){
		
		for(int i=1;i<=26;i++){
			
			char alpha=CHARACTERS.charAt(i-1);
			map.put(alpha,i);		
			
		}
		
		
	}
	public int getValue(String value){
		
		int val=0;
		int indexval=0;
		for(int i=0;i<value.length();i++){
			
			int keyval=map.get(value.charAt(i));
			val+=26 * indexval *keyval;
		}
			
		return val;	
	}
	public static void main(String args[]){
		
		
		
	}

}
