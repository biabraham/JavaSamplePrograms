package com.mytest.first;

import java.util.ArrayList;
import java.util.List;

public class CombineTwoStringsParallel {
	
	public static void combineStrings(String str1, String str2){
		
		List<String> newString = new ArrayList<String>();
		int length1 = str1.length();
		int length2 = str2.length();
		int maxLength = 0;
		if(length1>length2){
			maxLength = length1;
		}
		else{
			maxLength = length2;
		}
		
		for (int i=0;i<maxLength;i++){
			if(i<length1){
				newString.add(String.valueOf(str1.charAt(i)));
			}
			if(i<length2){
				newString.add(String.valueOf(str2.charAt(i)));
			}
		}
		
		for(String a:newString)
			System.out.print(a);
		//System.out.println("New String = "+newString.toString());
		
		
	}
	
	
	public static void combineStringsAnotherWay(String str1,String str2){
		
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combineStringsAnotherWay("foolish", "barkid");
		combineStrings("foo", "barkid");
		System.out.println("*******************************");
		combineStringsAnotherWay("foolish", "barkid");

	}

}
