//find the sum of digits in a number
package com.mytest.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumOfDigitsInNumber {
	
	public static void sumDigits(int number){
		int sum = 0;
		String numberString = Integer.toString(number);
		int length = numberString.length();
		System.out.println(length);
		
		for(int i=0;i<length;i++){
			sum += Integer.valueOf(numberString.substring(i, i+1));
		}
		System.out.println("Sum = "+sum);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumDigits(123);
		sumDigitsWithoutString(1234560);

	}
	
	public static void sumDigitsWithoutString(int number){
		int sum = 0;
		List<Integer> num = new ArrayList<Integer>();
		
		do{
			num.add(number%10);
			number = number/10;
		}while(number>0);
		
		Iterator itr = num.iterator();
		while(itr.hasNext()){
			sum += (int)itr.next();
		}
		
		System.out.println("Sum = "+sum);
	}

}
