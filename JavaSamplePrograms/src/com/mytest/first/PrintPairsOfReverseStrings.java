package com.mytest.first;

import java.util.HashSet;
import java.util.Set;

public class PrintPairsOfReverseStrings {
	
	public static void getReverseStringPairs(String[] strArray){
		boolean reverse = false;
		Set<String> set = new HashSet<String>();
		for(int i=0;i<strArray.length;i++){
			for(int j=i+1;j<strArray.length;j++){
				if(strArray[i].length() == strArray[j].length()){
					char[] arr1 = strArray[i].toCharArray();
					char[] arr2 = strArray[j].toCharArray();
					for(int k=0;k<arr1.length;k++){
						if(arr1[k]==arr2[arr1.length-1-k]){
							reverse = true;
						}
						else
							reverse = false;
					}
					if(reverse){
						set.add(strArray[i]);
						set.add(strArray[j]);
						
					}
					reverse = false;
				}
			}
		}
		System.out.println(set);
	}

	public static void main(String[] args) {
		
		String[] str = {"abc", "cdb", "cba", "ssfsd", "bdc", "addfdfd"};
		getReverseStringPairs(str);
		// TODO Auto-generated method stub

	}

}



