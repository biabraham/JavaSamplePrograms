package com.sampleprograms.java;

import java.util.ArrayList;
import java.util.List;

public class ConvertDecimalToBinary {
	
	public void decToBinary(int decimal){
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(decimal>0){
			list.add(decimal%2);
			decimal = decimal/2;
			
		}
		
		for(int i=list.size()-1;i>=0;i--){
			System.out.print(list.get(i));
		}
	}

	public static void main(String[] args) {
		
		ConvertDecimalToBinary abc = new ConvertDecimalToBinary();
		abc.decToBinary(8);
		// TODO Auto-generated method stub

	}

}
