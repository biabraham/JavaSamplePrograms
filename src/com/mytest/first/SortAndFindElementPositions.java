package com.mytest.first;

import java.util.Arrays;

public class SortAndFindElementPositions {
	
	public static void findPosition(int a,int[] array){
		int begin = 0;
		int end = 0;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
			if(a==array[i]){
				begin = i;
				break;
			}
				
		}
		for(int j=array.length-1;j>=0;j--){
			if (a==array[j]){
				end = j;
				break;
			}
		}
		
		System.out.println("Starting position is "+begin+" and end position is "+end);
		
	}
	
	
	public static void main(String args[]){
		int [] arr = {1,2,3,4,1,4,5};
		findPosition(5,arr);
	}

}
