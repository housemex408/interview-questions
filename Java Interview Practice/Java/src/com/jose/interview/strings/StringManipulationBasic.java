package com.jose.interview.strings;

import java.util.ArrayList;
import java.util.TreeMap;

public class StringManipulationBasic implements IStringManipulation {

	// This algorithm runs in O(N) * O(M)
	public ArrayList<String> printDupes(String input) {

		ArrayList<String> results = new ArrayList<String>();

		if (input == null || input.length() < 2)
			return results;

		int inputSize = input.length();

		String current;
		input = input.toLowerCase();

		// O(N)
		for (int i = 0; i < inputSize; i++) {
			current = input.substring(i, i + 1);

			// O(M)
			if (input.substring(i + 1).indexOf(current) != -1) {
				results.add(current);
				System.out.print(current + "");
			}
		}

		return results;
	}

	// This algorithm runs in O(N) + O(N) time or O(2N)
	// Makes use of a TreeMap to return keys in sorted order
	public ArrayList<String> returnFirstNonDupe(String input) {
		
		ArrayList<String> results = new ArrayList<String>();
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		if(input == null || input.length() < 2)
			return results;
		
		int current = 0;
		input = input.toLowerCase();
		
		//O(N)
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
		
		//O(N)
		for (char key : map.keySet()) {
			if(map.get(key) < 1)
			{
				results.add(new String(new char [] { key }));
				break;
			}
		}
		
		return results;
	}

}
