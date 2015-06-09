package com.mytest.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListInMap {
	
	public void addStringsOnKey(String[] str){
		
		//List<String> list = new ArrayList<String>();
		List<String> list;
		Map<Character,List<String>> map = new HashMap<Character, List<String>>();
		char ch = ' ';
		char secondChar = ' ';
		for(int i=0;i<str.length;i++){
			secondChar = str[i].charAt(1);
			list = new ArrayList<String>();
			for(int j=0;j<str.length;j++){
				ch = str[j].charAt(1);
				if(secondChar == ch){
					list.add(str[j]);
				}
									
			}
			map.put(secondChar, list);
			//list.clear();
			//list.removeAll(list);
		}
		
		System.out.println("Output is "+map);
		
	}
	
	public void addStringsOnKeyNoDuplicate(String[] str){
		Set<String> set;
		Map<Character,Set<String>> map = new HashMap<Character, Set<String>>();
		char ch = ' ';
		char secondChar = ' ';
		for(int i=0;i<str.length;i++){
			secondChar = str[i].charAt(1);
			set = new HashSet<String>();
			for(int j=0;j<str.length;j++){
				ch = str[j].charAt(1);
				if(secondChar == ch){
					set.add(str[j]);
				}
									
			}
			map.put(secondChar, set);
			//list.clear();
			//list.removeAll(list);
		}
		
		System.out.println("Output Without duplicates is "+map);
		
	}

	public static void main(String[] args) {
		String[] str = {"bat", "bet", "cat", "sit", "got", "but", "set", "bit", "pot", "bite", "boot", "cat", "bet"};
		//String[] str = {"bat", "bet", "cat"};
		ListInMap listInMap = new ListInMap();
		listInMap.addStringsOnKey(str);
		listInMap.addStringsOnKeyNoDuplicate(str);
		// TODO Auto-generated method stub

	}

}
