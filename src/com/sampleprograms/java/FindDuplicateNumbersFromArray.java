package com.sampleprograms.java;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbersFromArray {
	
	public void getDuplicates(int[] input){
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> dup = new HashSet<Integer>();
		
		for(int x:input){
			if(!unique.add(x)){
				dup.add(x);
			}
		}
		
		System.out.println("Duplicate Numbers are "+dup);
		System.out.println("Numbers without duplicates - "+unique);
		
		unique.removeAll(dup);
		System.out.println("Non duplicate number only are"+unique);
	}

	public static void main(String[] args) {
		
		FindDuplicateNumbersFromArray abc = new FindDuplicateNumbersFromArray();
		
		int [] input = {1, 2, 3, 4, 4, 5, 3, 6, 7};
		
		abc.getDuplicates(input);
		// TODO Auto-generated method stub

	}

}
