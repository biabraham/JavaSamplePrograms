package com.mytest.first;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AnagramChecker {
	
	public static void checkAnagram(String[] input){
		
		//String[] anagram = new String[input.length];
		Set<String> list = new TreeSet<String>();
		int p=0;
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				if(input[i].length()==input[j].length()){
					//System.out.println("length comparison");
					char[] arr1 = input[i].toCharArray();
					char[] arr2 = input[j].toCharArray();
					Arrays.sort(arr1);
					Arrays.sort(arr2);
					if(Arrays.equals(arr1, arr2)){
						list.add(input[i]);
						list.add(input[j]);
					}
					
					
				}
			}
		}
		System.out.println(list);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] input = {"cba","abc","a","b","pq", "qp","xyz","xxx","yzx"};
		checkAnagram(input);
		

	}

}
