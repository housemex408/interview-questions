package com.jose.interview.math;

public class MathAlgorithmsBasic implements IMathAlgorithms {

	// Algorithm will have to calculate fibonacci O(N-1) * O(N-2) times!
	public int fibonacci(int input) {
		
		if(input == 0 || input == 1)
			return input;
		
		int result = fibonacci(input - 1) + fibonacci(input - 2);
		
		return result;
	}

}
