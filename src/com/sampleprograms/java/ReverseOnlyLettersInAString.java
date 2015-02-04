package com.sampleprograms.java;

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyLettersInAString {
	
	public static void reverseOnlyLetters(String input){
		
		char[] charArray = input.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for(int i=0;i<charArray.length;i++){
			if(Character.isDigit(charArray[i])){
				continue;
			}
			list.add(charArray[i]);
			charArray[i]='~';
		}
		
		int k = list.size()-1;
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]=='~'){
				charArray[i] = list.get(k);
				k--;
			}
		}
		
		System.out.println(charArray);
	}

	public static void main(String[] args) {
		
		String input = "ab23cd";
		reverseOnlyLetters(input);
		// TODO Auto-generated method stub

	}

}
