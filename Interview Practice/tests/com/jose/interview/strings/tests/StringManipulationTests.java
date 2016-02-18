package com.jose.interview.strings.tests;

import java.util.ArrayList;

import org.junit.Test;

import com.jose.interview.strings.StringManipulation;

import org.junit.Assert;

public class StringManipulationTests {

	@Test
	public void returnDuplicates_whenInputContainsOneDup_returnOne() {
		//arrange
		StringManipulation stringM = new StringManipulation();
		
		//act
		ArrayList<String> results = stringM.printDupes("Java");
		
		//assert
		Assert.assertEquals("a", results.get(0));
	}
	
	@Test
	public void returnDuplicates_whenInputIsNull_returnEmpty() {
		//arrange
		StringManipulation stringM = new StringManipulation();
		
		//act
		ArrayList<String> results = stringM.printDupes(null);
		
		//assert
		Assert.assertEquals(0, results.size());
	}
	
	@Test
	public void returnDuplicates_whenInputSizeIsOne_returnEmpty() {
		//arrange
		StringManipulation stringM = new StringManipulation();
		
		//act
		ArrayList<String> results = stringM.printDupes(null);
		
		//assert
		Assert.assertEquals(0, results.size());
	}

}
