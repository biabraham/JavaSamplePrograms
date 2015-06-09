package com.mytest.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithList {
	
	public void createMap(String[] input){
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		for(int i=0;i<input.length;i++){
			list.add(input[i]);
		}
		
		for(String str:list){
			//Character ch
				
			}
			
		}
			
			
			
		
		
		//System.out.println(map);
	//}

	public static void main(String[] args) {
		
		String[] names = {"Bibin","Rakesh","Boby","Retish","Sachin"};
		MapWithList m = new MapWithList();
		m.createMap(names);
		// TODO Auto-generated method stub

	}
	
	
}
