package com.sampleprograms.java;

import java.util.ArrayList;
import java.util.List;

public class CombineTwoStringsParallel {
	
	public void combineStrings(String str1, String str2){
		
		List<Character> list = new ArrayList<Character>();
		int maxLength = (str1.length()>str2.length()?str1.length():str2.length());
		
		for(int i=0;i<maxLength;i++){
			if(i<str1.length()){
				list.add(str1.charAt(i));
			}
			if(i<str2.length()){
				list.add(str2.charAt(i));
			}
		}
		
		System.out.println(list);
		for(Character a:list)
			System.out.print(a);
		
	}

	public static void main(String[] args) {
		
		CombineTwoStringsParallel abc = new CombineTwoStringsParallel();
		abc.combineStrings("foolish", "kidbar1");
		// TODO Auto-generated method stub

	}

}
