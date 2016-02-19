package com.jose.interview.math.tests;

import org.junit.Assert;
import org.junit.Test;

import com.jose.interview.math.IMathAlgorithms;
import com.jose.interview.math.MathAlgorithmsBasic;
import com.jose.interview.math.MathAlgorithmsOptimized;

public class MathAlgorithmsOptimizedTests {

	@Test
	public void fibonacci_whenInputIs0_return0() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsOptimized();

		// act
		int result = math.fibonacci(0);

		// assert
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void fibonacci_whenInputIs1_return1() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsOptimized();

		// act
		int result = math.fibonacci(1);

		// assert
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void fibonacci_whenInputIs2_return1() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsOptimized();

		// act
		int result = math.fibonacci(2);

		// assert
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void fibonacci_whenInputIs4_return3() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsOptimized();

		// act
		int result = math.fibonacci(4);

		// assert
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void fibonacci_whenInputIs6_return8() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsOptimized();

		// act
		int result = math.fibonacci(6);

		// assert
		Assert.assertEquals(8, result);
	}
}
