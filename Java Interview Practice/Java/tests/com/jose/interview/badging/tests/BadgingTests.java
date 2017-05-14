package com.jose.interview.badging.tests;

import com.jose.interview.badging.Badging;
import org.junit.Assert;
import org.junit.Test;

public class BadgingTests {

    @Test
    public void isWellFormed_WithValidFormatForEntries_ReturnTrue() {
        // arrange
        Badging gd = new Badging();

        String [] input = { "E 111", "E 222", "L 111", "E 111", "L 222", "L 111"};

        // act
        boolean result = gd.isWellFormed(input);

        // assert
        Assert.assertTrue(result);
    }

    @Test
    public void isWellFormed_WithInValidFormatForEntries_ReturnFalse() {
        // arrange
        Badging gd = new Badging();

        String [] input = { "E 111", "E 2222", "L 111", "E 111", "L 222", "L 111"};

        // act
        boolean result = gd.isWellFormed(input);

        // assert
        Assert.assertFalse(result);
    }

    @Test
    public void isWellFormed_WithMissingExitEntry_ReturnFalse() {
        // arrange
        Badging gd = new Badging();

        String [] input = { "E 111", "E 222", "L 111", "E 111", "L 222"};

        // act
        boolean result = gd.isWellFormed(input);

        // assert
        Assert.assertFalse(result);
    }

    @Test
    public void isWellFormed_WithFirstEntryExit_ReturnFalse() {
        // arrange
        Badging gd = new Badging();

        String [] input = { "L 111", "E 222", "L 111", "E 111", "L 222", "L 111"};

        // act
        boolean result = gd.isWellFormed(input);

        // assert
        Assert.assertFalse(result);
    }
}
