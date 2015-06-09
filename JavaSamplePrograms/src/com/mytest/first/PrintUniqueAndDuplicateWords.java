package com.mytest.first;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueAndDuplicateWords {
	
	public void printWords(String[] line){
		Set<String> unique = new HashSet<String>();
		Set<String> dup = new HashSet<String>();
		
		for(String a:line){
			if (!unique.add(a)){
				dup.add(a);
			}
		}
		
		unique.removeAll(dup);
		System.out.println("Unique element - "+unique);
		System.out.println("dup elements - "+dup);
	}
	
	public static void main(String[] args){
		String[] input = {"i", "came","i", "saw", "i","left","saw"};
		PrintUniqueAndDuplicateWords abc = new PrintUniqueAndDuplicateWords();
		abc.printWords(input);
	}

}
