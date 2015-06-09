package com.mytest.first;

import java.util.HashMap;
import java.util.Map;

public class FindMostRepeatedCharInString {
	
	public static char getMostRepeatedChar(String str){
		int maxCount = 0;
		char mostRepeated = ' ';
		char [] charArray = str.toCharArray();
		
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(int j=0;j<charArray.length;j++){
			char ch = charArray[j];
			if (charMap.containsKey(ch)){
				int value = charMap.get(ch);
				charMap.put(ch, value+1);
				if (value>maxCount){
					mostRepeated = ch;
					maxCount++;
				}
			}
			else
				charMap.put(ch, 1);
		}
		
		System.out.println("Most repeated char is "+mostRepeated+" and it is repeated "+charMap.get(mostRepeated)+" times");
		
		return mostRepeated;
	}
	
	/*public static char getMostRepeatedChar(String str){
		int maxCount = 0;
		char mostRepeated = ' ';
		//char [] charArray = str.toCharArray();
		
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(int j=0;j<str.length()-1;j++){
			char ch = str.charAt(j);
			if (charMap.containsKey(ch)){
				int value = charMap.get(ch);
				charMap.put(ch, value+1);
				if (value>maxCount){
					mostRepeated = ch;
					maxCount++;
				}
			}
			else
				charMap.put(ch, 1);
		}
		
		System.out.println("Most repeated char is "+mostRepeated+" and it is repeated "+charMap.get(mostRepeated)+" times");
		
		return mostRepeated;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMostRepeatedChar("abcbbdefgaahabb");

	}

}
