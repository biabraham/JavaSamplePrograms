package com.mytest.first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class LoadValuesToMap {
	
	public static void loadValues() throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader(new File("pathname")));
        String line = null;
        Map<String, Integer> map = new HashMap<String, Integer>();// it should be static - whereever you define
        while ((line = reader.readLine()) != null) {
            if (line.contains("=")) {
                String[] strings = line.split("=");
                map.put(strings[0], Integer.parseInt(strings[1]));
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
