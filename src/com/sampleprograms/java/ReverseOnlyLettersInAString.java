package com.sampleprograms.java;

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyLettersInAString {
	
	public static void reverseOnlyLetters(String input){
		char ch;
		char[] charArray = input.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for(int i=0;i<charArray.length;i++){
			ch=charArray[i];
			if(((int) ch >=65 && (int) ch<=90)||((int) ch>=97 && (int) ch <=122)){
				list.add(charArray[i]);
				charArray[i]=' ';
			}
			/*if(Character.isDigit(charArray[i])){
				continue;
			}
			list.add(charArray[i]);
			charArray[i]='~';*/
		}
		
		int k = list.size()-1;
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]==' '){
				charArray[i] = list.get(k);
				k--;
			}
		}
		
		System.out.println(charArray);
	}

	public static void main(String[] args) {
		
		String input = "ab23$b4cd";
		reverseOnlyLetters(input);
		// TODO Auto-generated method stub

	}

}
