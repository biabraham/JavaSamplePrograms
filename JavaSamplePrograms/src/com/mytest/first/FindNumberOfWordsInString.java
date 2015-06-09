package com.mytest.first;

public class FindNumberOfWordsInString {
	
	public static void countNumberOfWords(String str){
		char[] charArray = (str.trim().toCharArray());
		int count = 0;
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]==' ' && charArray[i+1]!=' ')
				count++;
		}
		count++;
		System.out.println("Number of words in the string = "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNumberOfWords("My name     is       bibin a");

	}

}
