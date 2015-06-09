package com.mytest.first;

public class SortStringArray {
	
	/*public static void sortArray(String[] str){
		
		for(int i=0;i<str.length-1;i++){
			for(int p=0;p<str.length-1;p++){
				int strLength = (str[p].length()<str[p+1].length())?str[p].length():str[p+1].length();
				for(int j=0;j<strLength;j++){
					if(str[p].charAt(j)>str[p+1].charAt(j)){
						String temp = str[p];
						str[p] = str[p+1];
						str[p+1] = temp;
						break;
					}
				}
			}
		}*/
	
	public static void sortArray(String[] str){
		
		for(int i=0;i<str.length-1;i++){
			for(int p=0;p<str.length-1;p++){
				//int strLength = (str[p].length()<str[p+1].length())?str[p].length():str[p+1].length();
				//for(int j=0;j<strLength;j++){
					//if(str[p].charAt(j)>str[p+1].charAt(j)){
					if(str[p].compareToIgnoreCase(str[p+1])>0){
						String temp = str[p];
						str[p] = str[p+1];
						str[p+1] = temp;
						break;
					}
				//}
			}
		}
		
		System.out.println("Sorted Array - ");
		for(String a:str)
			System.out.print(a+", ");
	}

	public static void main(String[] args) {
		
		String[] arr = {"abcd","abc", "bcd","xy","pqrs"};
		sortArray(arr);
		// TODO Auto-generated method stub

	}

}
