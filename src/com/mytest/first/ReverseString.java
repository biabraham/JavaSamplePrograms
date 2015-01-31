package com.mytest.first;

public class ReverseString {
	/*public static void main(String args[]){
	    String str = "He is the one";
	    String temp = "";
	    String finalString = "";
	        for(int i =str.length()-1;i>=0;i--){
	            temp +=i!=0?str.charAt(i):str.charAt(i)+" ";
	            if(str.charAt(i) == ' '||i==0){
	                for(int j=temp.length()-1;j>=0;j--){
	                    finalString += temp.charAt(j);
	                }
	                temp = "";
	            }
	        }
	            System.out.println(finalString);
	    }*/
	
	public static void revString(String str){
		String temp = "";
		String result="";
		for(int i=str.length()-1;i>=0;i--){
			
			//temp+=i!=0?str.charAt(i):str.charAt(i)+" ";
			if(i!=0){
				temp+=str.charAt(i);
			}
			else
				temp+=str.charAt(i)+" ";
			
			if(str.charAt(i)==' ' || i==0){
				for(int j=temp.length()-1;j>=0;j--){
					result+=temp.charAt(j);
				}
				temp="";
			}
			
			
		}
		System.out.println(result.trim());
	}
	
	public static void main(String[] args){
		String input = "He is  the one";
		revString(input);
	}

}
