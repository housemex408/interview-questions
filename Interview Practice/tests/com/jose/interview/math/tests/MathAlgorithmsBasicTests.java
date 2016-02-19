package com.jose.interview.math.tests;

import org.junit.Assert;
import org.junit.Test;

import com.jose.interview.math.IMathAlgorithms;
import com.jose.interview.math.MathAlgorithmsBasic;

public class MathAlgorithmsBasicTests {

	@Test
	public void fibonacci_whenInputIs0_return0() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.fibonacci(0);

		// assert
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void fibonacci_whenInputIs1_return1() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.fibonacci(1);

		// assert
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void fibonacci_whenInputIs2_return1() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.fibonacci(2);

		// assert
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void fibonacci_whenInputIs4_return3() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.fibonacci(4);

		// assert
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void fibonacci_whenInputIs6_return8() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.fibonacci(6);

		// assert
		Assert.assertEquals(8, result);
	}
	
	@Test
	public void factorial_whenInputIs0_return1() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.factorial(0);

		// assert
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void factorial_whenInputIs1_return1() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.factorial(1);

		// assert
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void factorial_whenInputIs2_return2() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.factorial(2);

		// assert
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void factorial_whenInputIs3_return6() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.factorial(3);

		// assert
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void factorial_whenInputIs4_return24() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.factorial(4);

		// assert
		Assert.assertEquals(24, result);
	}
	
	@Test
	public void factorial_whenInputIs5_return120() {
		// arrange
		IMathAlgorithms math = new MathAlgorithmsBasic();

		// act
		int result = math.factorial(5);

		// assert
		Assert.assertEquals(120, result);
	}
}
