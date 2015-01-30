package com.arr;

import java.util.Comparator;
import java.util.Arrays;

public class Problem11 {
	
	
	public String bigNumber(String numbers[]){
	
	
		Arrays.sort(numbers,new stringComparator());
		
		String bigNumber="";
		for(int i=0;i<numbers.length;i++){
			bigNumber.concat(numbers[i]);
		}
		return bigNumber;
	
	}
	private class stringComparator implements Comparator<String>{

		@Override
		public int compare(String str1, String str2) {
			// TODO Auto-generated method stub
			
			int length1=str1.length();
			int length2=str2.length();
			
			int i=0;
			int j=0;
			
			while(i < length1 && j < length2){
				
				int d1=Integer.parseInt(str1.substring(i,i+1));
				int d2=Integer.parseInt(str2.substring(j,j+1));
				
				if(d1 < d2)
					return -1;
							
				if(d1 > d2)
					return 1;
				
				i++;
				j++;
			}
			
			if(i==length1 && j==length2)
				return 0;
			
			else if(i==length1)
				return -1;
			else
				return 1;
			
		}
		
	}
	public static void main(String args[]){
		
		
		
	}

}
