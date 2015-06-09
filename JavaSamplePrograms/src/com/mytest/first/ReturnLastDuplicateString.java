package com.mytest.first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReturnLastDuplicateString {
	
	public void getLastDupicate(List<String> str){
		Set<String> original = new HashSet<String>();
		List<String> dup	= new ArrayList<String>();
		
		for(String s:str){
			if(!original.add(s))
				dup.add(s);
		}
		
		int size = dup.size();
		System.out.println("Last dup string "+dup.get(size-1));
		
	}

	public static void main(String[] args) {
		ReturnLastDuplicateString ab = new ReturnLastDuplicateString();
		List<String> str = new ArrayList<String>();
		str.add("abc");
		str.add("pqr");
		str.add("abc");
		str.add("q");
		str.add("pqr");
		str.add("abc");
		str.add("123");
		ab.getLastDupicate(str);
		// TODO Auto-generated method stub

	}

}
