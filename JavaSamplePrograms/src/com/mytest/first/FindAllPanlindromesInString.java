package com.mytest.first;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindAllPanlindromesInString {
	
	public static Set<String> printAllPalindromes(String input) {
		Set<String> out = new HashSet<String>();
	    if (input.length() < 2) {
	    	out.add(input);
	        return out;
	    }
	    else if(input.length()==2){
	    	if(input.charAt(0)==input.charAt(1)){
	    		out.add(input);
	    		return out;
	    	}
	    	else
	    		return Collections.emptySet();
	    }
	    
	    int length = input.length();
	    for (int i = 1; i < length - 1; i++) {
	        for (int j = i - 1, k = i + 1; j >= 0 && k < length; j--, k++) {
	            if (input.charAt(j) == input.charAt(k)) {
	                out.add(input.substring(j, k+1));
	            } else {
	                break;
	            }
	        }
	    }
	    return out;
	}

	public static void main(String[] args) {
		Set <String> pal = printAllPalindromes("ababa");
		int temp = 0;
		String lstring = "";
		for(String s:pal){
			int len = s.length();
			if(len>temp){
				temp = len;
				lstring = s;
				
			}
		}
		System.out.println(pal);
		System.out.println("Largest palindrome in string "+lstring+" and length is"+temp);
		// TODO Auto-generated method stub

	}

}
