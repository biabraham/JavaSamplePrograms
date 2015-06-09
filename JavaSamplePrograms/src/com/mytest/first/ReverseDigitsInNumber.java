package com.mytest.first;

public class ReverseDigitsInNumber {
	
	public  int reverseNumber(int number){
		int reverse = 0;
		int[] arr = new int[String.valueOf(number).length()];
		//System.out.println(String.valueOf(number).length());
		int i = 0;
		while(number>0){
			arr[i] = number%10;
			number = number/10;
			i++;
			
		};
		//System.out.println(arr.length);
		String y = "";
		for(int x:arr)
			y +=String.valueOf(x);
		System.out.println(y);
		reverse = Integer.valueOf(y);
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDigitsInNumber rd = new ReverseDigitsInNumber();
		int number = rd.reverseNumber(123);
		System.out.println(number);
		//reverseNumber(1234);

	}

}
