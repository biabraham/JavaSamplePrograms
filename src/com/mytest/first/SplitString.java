package com.mytest.first;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
	
	public static void splitStringWithoutFunctions(String input){
		
		StringBuilder sb = new StringBuilder();
		int len = input.trim().length();
		char ch = ' ';
		int j=0;
		List<String> list = new ArrayList<String>();
		for(int i=0;i<len;i++){
			ch = input.trim().charAt(i);
			if(ch ==' '){
				if(sb.length()!=0){
					list.add(sb.toString());
					sb.setLength(0);
				}
			}
			else{
				sb.append(ch);
			}
		}
		list.add(sb.toString());
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		splitStringWithoutFunctions("i   came   i saw i left");
		// TODO Auto-generated method stub

	}

}
