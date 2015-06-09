package com.sampleprograms.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNumberOfOccurancesOfWordsInAString {
	
	public void countWordOccurance(String str){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] strArray = str.split("\\s+");
		int value = 0;
		for(String s:strArray){
			if(map.containsKey(s)){
				value = map.get(s);
				map.put(s, ++value);
			}
			else{
				map.put(s, 1);
			}
		}
		
		System.out.println(map);
		
		
		
	}
	
	
	public void countWordsWithoutSplit(String str){
		
		//logical error. need to fix it
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		int value = 0;
		//char[] charArray = str.toCharArray();
		List<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++){
			if(str.trim().charAt(i)!=' '){
				sb.append(str.charAt(i));
			}
			else if(sb.length()>0 || i==str.length()){
				list.add(sb.toString());
				sb.setLength(0);
			}
			
		}
		System.out.println(list);
		
		for(String s:list){
			if(map.containsKey(s)){
				value = map.get(s);
				map.put(s, ++value);
			}
			else{
				map.put(s, 1);
			}
			
		}
		
		System.out.println(map);
		
	}

	public static void main(String[] args) {
		
		FindNumberOfOccurancesOfWordsInAString abc = new FindNumberOfOccurancesOfWordsInAString();
		abc.countWordOccurance("i came i saw     i went   ");
		System.out.println("***********************************************");
		abc.countWordsWithoutSplit("i came i saw    i   left");
		// TODO Auto-generated method stub

	}

}
