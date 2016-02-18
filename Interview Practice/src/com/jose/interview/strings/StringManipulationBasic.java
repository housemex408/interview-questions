package com.jose.interview.strings;

import java.util.ArrayList;

public class StringManipulationBasic implements StringManipulation {

	public ArrayList<String> printDupes(String input) {
		
		ArrayList<String> results = new ArrayList<String>();
		
		if(input == null || input.length() < 2)
			return results;
		
		int inputSize = input.length();
		
		String current;
		input = input.toLowerCase();
		
		for(int i = 0; i < inputSize; i++)
		{
			current = input.substring(i, i + 1);
			
			if(input.substring(i + 1).indexOf(current) != -1)
			{
				results.add(current);
				System.out.print(current + "");
			}
		}
		
		return results;
	}

}
