package com.mytest.first;
 
public class ReverseStringUsingRecursion {
 
    String reverse = "";
     
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
    	ReverseStringUsingRecursion srr = new ReverseStringUsingRecursion();
        System.out.println("Result: "+srr.reverseString("bibin"));
    }
}
