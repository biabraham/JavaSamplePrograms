package com.mytest.first;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfOfOccurancesOfWords {
	
	public static void getOccuranceCount(String input){
		int maxCount = 0;
		String str = "";
		StringBuilder sb = new StringBuilder();
		//String[] inputArray = new String[input.length()];
		Map<String,Integer> map = new HashMap<String, Integer>();
		String[] inputArray = input.split("\\s+");
		
		for(String a:inputArray){
			Integer count = map.get(a);
			map.put(a, (count==null)?1:count+1);
			if(map.get(a)>maxCount){
				str = a;
				maxCount++;
			}
		}
		System.out.println("word frequency - "+map);
		System.out.println("Most repeated word is \""+str+"\" and it is repeated "+maxCount+" times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getOccuranceCount("i came i saw i left i");

	}
	
	
	

}
