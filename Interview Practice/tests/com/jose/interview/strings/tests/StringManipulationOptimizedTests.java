package com.jose.interview.strings.tests;

import java.util.ArrayList;

import org.junit.Test;

import com.jose.interview.strings.StringManipulation;
import com.jose.interview.strings.StringManipulationBasic;

import org.junit.Assert;

public class StringManipulationOptimizedTests {

	@Test
	public void returnDuplicates_whenInputContainsOneDup_returnOne() {
		//arrange
		StringManipulation stringM = new StringManipulationBasic();
		
		//act
		ArrayList<String> results = stringM.printDupes("Java");
		
		//assert
		Assert.assertEquals(results.get(0), "a");
		Assert.assertEquals(results.size(), 1);
	}
	
	@Test
	public void returnDuplicates_whenInputIsNull_returnEmpty() {
		//arrange
		StringManipulation stringM = new StringManipulationBasic();
		
		//act
		ArrayList<String> results = stringM.printDupes(null);
		
		//assert
		Assert.assertEquals(0, results.size());
	}
	
	@Test
	public void returnDuplicates_whenInputSizeIsOne_returnEmpty() {
		//arrange
		StringManipulation stringM = new StringManipulationBasic();
		
		//act
		ArrayList<String> results = stringM.printDupes(null);
		
		//assert
		Assert.assertEquals(0, results.size());
	}

}
