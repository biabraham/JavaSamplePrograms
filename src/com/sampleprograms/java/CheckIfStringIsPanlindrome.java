package com.sampleprograms.java;

public class CheckIfStringIsPanlindrome {
	
	public void palindromeChecker(String str){
		boolean palindrome = false;
		//int count = 0;
		for(int i=0;i<str.length()/2;i++){
			palindrome = false;
			if(str.charAt(i)==str.charAt(str.length()-1-i)){
					palindrome = true;
					//count++;
			}
			else
				break;
		}
		
		if (palindrome){
			System.out.println(str+" is a palindrome");
		}
		else
			System.out.println(str+" is not a palindrome");
	}
	

	public static void main(String[] args) {
		
		CheckIfStringIsPanlindrome abc = new CheckIfStringIsPanlindrome();
		abc.palindromeChecker("malayalam");
		// TODO Auto-generated method stub

	}

}
