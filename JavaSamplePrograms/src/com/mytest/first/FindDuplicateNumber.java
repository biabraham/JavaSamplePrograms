package com.mytest.first;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
	
	public void getDuplicate(int[] numbers){
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> dup = new HashSet<Integer>();
		
		for(int n:numbers){
			if(!unique.add(n)){
				dup.add(n);
			}
		}
		
		System.out.println("Duplicate Number : "+dup);
		unique.removeAll(dup);
		System.out.println("Unique Numbers: "+unique);
	}
	
	public void getDupUsingLoop(int[] numbers){
		
		Set<Integer> dup = new HashSet<Integer>();
		
		for(int i=0;i<numbers.length;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i]==numbers[j]){
					dup.add(numbers[i]);
				}
			}
		}
		System.out.println("Duplicate Numbers : "+dup);
	}

	public static void main(String[] args) {
		
		FindDuplicateNumber d = new FindDuplicateNumber();
		int[] num = {1,2,3,4,1,5,6,5,3,7};
		d.getDuplicate(num);
		System.out.println("**********************************************************");
		d.getDupUsingLoop(num);
		// TODO Auto-generated method stub

	}

}
