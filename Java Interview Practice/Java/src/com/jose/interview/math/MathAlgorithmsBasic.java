package com.jose.interview.math;

import java.util.HashMap;

public class MathAlgorithmsBasic implements IMathAlgorithms {

	// Algorithm will have to calculate fibonacci O(N-1) * O(N-2) times!
	public int fibonacci(int input) {

		if (input == 0 || input == 1)
			return input;

		int result = fibonacci(input - 1) + fibonacci(input - 2);

		return result;
	}

	public int factorial(int input) {

		if (input == 0 || input == 1)
			return 1;
		else if (input == 2)
			return 2;

		int result = input * factorial(input - 1);

		return result;
	}

	public int calculateRomanNumeral(String input) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		if(input == null || !input.matches("[IVXLCDM]+") || input.matches(".*[I]{4,}.*"))
			return -1;

		int result = 0;
		int inputLength = input.length();

		for (int i = 0; i < inputLength; i++) {
			if (inputLength == 1) {
				result = map.get(input.charAt(i));
			} else if (i + 1 < inputLength && input.charAt(i) == 'I' && input.charAt(i + 1) != 'I') {
				result += (map.get(input.charAt(i + 1)) - map.get(input.charAt(i)));
				++i;
			} else {
				result += map.get(input.charAt(i));
			}
		}

		return result;
	}
}
