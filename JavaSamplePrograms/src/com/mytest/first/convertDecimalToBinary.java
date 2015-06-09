package com.mytest.first;

public class convertDecimalToBinary {
	
	int[] binary = new int[25];
	int num = 0;
	public void convertToBinary(int decimal){
		while(decimal>0){
			binary[num] = decimal%2;
			decimal = decimal/2;
			num++;
		}
		
		for(int i=num;i>=0;i--){
			System.out.print(binary[i]);
		}

		
	}

	public static void main(String[] args) {
		
		convertDecimalToBinary con = new convertDecimalToBinary();
		con.convertToBinary(2);
		// TODO Auto-generated method stub

	}

}
