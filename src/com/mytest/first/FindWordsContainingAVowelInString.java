package com.mytest.first;

import java.util.Map;
import java.util.TreeMap;

public class FindWordsContainingAVowelInString {
	
	public static void findWordsWithVowel(String str){
		int count = 0;
		/*String[] arr = str.toLowerCase().split(" ");
		for(String a:arr){*/
		for(int i=0;i<str.length();i++){
			char a = str.toLowerCase().charAt(i);
			if(a == 'i' ||a=='a'||a=='e'||a=='o'||a=='u'){
				count++;
			}
		}
		
		System.out.println("Number of vowels in string = "+count);
	}
	
	public static void count(String str){
		int count = 0;
		Map<String, Integer> map = new TreeMap<String, Integer>();
		String[] arr = str.split("\\s+");
		for(String a:arr){
			count = 0;
			int length = a.length();
			for(int i=0;i<length;i++){
				char ch = a.toLowerCase().charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					count++;
			}
			//if(a!=null)
			map.put(a, count);
		}
		System.out.println(map);
		
		 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findWordsWithVowel("I am Bibin i");
		count("I     am Bibin");

	}

}
