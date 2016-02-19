package com.jose.interview.math;

import java.util.Arrays;

public class MathAlgorithmsOptimized implements IMathAlgorithms {

	// Algorithm will have to calculate fibonacci O(N) times!
	public int fibonacci(int input) {
		
		int [] cache = new int[input + 1];
		Arrays.fill(cache, -1);
		
		int result = fibonacci(input, cache);
		
		return result;
	}
	
	private int fibonacci(int input, int [] cache)
	{
		if(input == 0 || input == 1)
			return input;
		
		int result = 0;
		
		if(cache[input] != -1)
			result = cache[input];
		else
			result = fibonacci(input - 1, cache) + fibonacci(input - 2, cache);
		
		cache[input] = result;
		
		return result;
	}

}
