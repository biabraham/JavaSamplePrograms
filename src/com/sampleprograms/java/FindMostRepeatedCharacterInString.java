package com.sampleprograms.java;

import java.util.HashMap;
import java.util.Map;

public class FindMostRepeatedCharacterInString {
	
	public void findMostRepeatedChar(String str){
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		char ch = ' ';
		int count = 0;
		int maxCount = 0;
		char mostRepeated = ' ';
		for(int i=0;i<str.length();i++){
			ch = str.charAt(i);
			if(map.containsKey(ch)){
				count = map.get(ch);
				map.put(ch, ++count);
				
				if(count>maxCount){
					maxCount = count;
					mostRepeated = ch;
				}
			}
			else{
				map.put(ch, 1);
			}
				
		}
		
		if(count==0){
			System.out.println("All characters appear exactly once");
		}
		else
			System.out.println("most repeated character is "+mostRepeated+" and it is repeated "+maxCount+" times");
		
		System.out.println(map);
		
		
	}

	public static void main(String[] args) {
		
		FindMostRepeatedCharacterInString abc = new FindMostRepeatedCharacterInString();
		abc.findMostRepeatedChar("a");
		// TODO Auto-generated method stub

	}

}
