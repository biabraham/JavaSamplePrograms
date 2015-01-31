package com.sampleprograms.java;

public class ReverseWordsInAString {
	
	public void reverseWords(String str){
		
		StringBuilder result = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--){
			
			temp.append(str.charAt(i));
			if(str.charAt(i)==' ' || i==0){
				for(int j=temp.length()-1;j>=0;j--){
					result.append(temp.charAt(j));
				}
				temp.setLength(0);
				result.append(' ');
			}
			
			
			
		}
		System.out.println(result.toString().trim());
	}

	public static void main(String[] args) {
		
		ReverseWordsInAString abc = new ReverseWordsInAString();
		abc.reverseWords("i am bibin");
		// TODO Auto-generated method stub

	}

}


//i am bibin