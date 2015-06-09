package com.mytest.first;

public class CheckIfStringIsPalindrome {
	
	public static void checkPalindrome(String str){
		boolean palindrome = false;
		for(int i=0;i<str.length()/2;i++){
			palindrome = false;
			if(str.charAt(i)==str.charAt(str.length()-1-i)){
				palindrome = true;
			}
		}
		if (palindrome){
			System.out.println(str+" is a palindrome");
		}
	}

	public static void main(String[] args) {
		checkPalindrome("1malayalam1");
		// TODO Auto-generated method stub

	}

}
