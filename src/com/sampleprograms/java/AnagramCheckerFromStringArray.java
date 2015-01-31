package com.sampleprograms.java;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AnagramCheckerFromStringArray {
	
	public void getAnagrams(String[] input){
		
		Set<String> anagrams = new TreeSet<String>();
		
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				if(input[i].length() == input[j].length()){
					char[] arr1 = input[i].toCharArray();
					char[] arr2 = input[j].toCharArray();
					Arrays.sort(arr1);
					Arrays.sort(arr2);
					if (Arrays.equals(arr1, arr2)){
						anagrams.add(input[i]);
						anagrams.add(input[j]);
					}
				}
			}
		}
		
		System.out.println(anagrams);
	}

	public static void main(String[] args) {
		
		AnagramCheckerFromStringArray abc = new AnagramCheckerFromStringArray();
		String [] input = {"cba","abc","a","b","pq", "qp","xyz","xxx","yzx"};
		abc.getAnagrams(input);
		// TODO Auto-generated method stub

	}

}
