package com.jose.interview.twodeearray.tests;

import com.jose.interview.twodeearray.TwoDeeArray;
import org.junit.Assert;
import org.junit.Test;


public class TwoDeeArrayTests {

	@Test
	public void print_when2x3_return2x3String() {
		// arrange
		TwoDeeArray twoDee = new TwoDeeArray();



		int [][] input = new int [2][3];

		input[0][0] = 10;
		input[0][1] = 20;
		input[0][2] = 30;
		input[1][0] = 40;
		input[1][1] = 50;
		input[1][2] = 60;

		// act
		String result = twoDee.print(input);

		// assert
		System.out.print(result);
	}
}
