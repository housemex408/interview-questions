package com.jose.interview.strings;

import java.util.ArrayList;
import java.util.HashMap;

public class StringManipulationOptimized implements StringManipulation {

	public ArrayList<String> printDupes(String input) {
		
		ArrayList<String> results = new ArrayList<String>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		if(input == null || input.length() < 2)
			return results;
		
		int current = 0;
		input = input.toLowerCase();
		
		for(char c : input.toCharArray())
		{
			if(!map.containsKey(c))
			{
				map.put(c, 0);
			}
			else
			{
				current = map.get(c);
				map.put(c, ++current);
			}
		}
		
		for (char key : map.keySet()) {
			if(map.get(key) > 1)
				results.add(new String(new char [] { key }));
		}
		
		return results;
	}

}
