package com.jose.interview.anagram.tests;

import com.jose.interview.anagrams.Anagrams;
import com.jose.interview.math.GreatestDifference;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTests {

    @Test
    public void isAnagram_WithSameLengthInputsAndIsAnagram_ReturnTrue() {
        // arrange
        Anagrams gd = new Anagrams();

        // act
        boolean result = gd.isAnagram("Jose", "eoJs");

        // assert
        Assert.assertTrue(result);
    }

    @Test
    public void isAnagram_WithSameLengthInputsAndIsNotAnagram_ReturnFalse() {
        // arrange
        Anagrams gd = new Anagrams();

        // act
        boolean result = gd.isAnagram("Jose", "eojs");

        // assert
        Assert.assertFalse(result);
    }

    @Test
    public void isAnagram_WithDifferentLengthInputsAndIsAnagram_ReturnTrue() {
        // arrange
        Anagrams gd = new Anagrams();

        // act
        boolean result = gd.isAnagram("Jose", "BalollllJyuuusooooe");

        // assert
        Assert.assertTrue(result);
    }

    @Test
    public void isAnagram_WithSpacesAndIsNotAnagram_ReturnFalse() {
        // arrange
        Anagrams gd = new Anagrams();

        // act
        boolean result = gd.isAnagram("Jose", " J o s e ");

        // assert
        Assert.assertFalse(result);
    }

    @Test
    public void isAnagramDS_WithSameLengthInputsAndIsAnagram_ReturnTrue() {
        // arrange
        Anagrams gd = new Anagrams();

        // act
        boolean result = gd.isAnagramDS("Jose", "eoJs");

        // assert
        Assert.assertTrue(result);
    }

    @Test
    public void isAnagramDS_WithSameLengthInputsAndIsNotAnagram_ReturnFalse() {
        // arrange
        Anagrams gd = new Anagrams();

        // act
        boolean result = gd.isAnagramDS("Jose", "eojs");

        // assert
        Assert.assertFalse(result);
    }

    @Test
    public void isAnagramDS_WithDifferentLengthInputsAndIsAnagram_ReturnTrue() {
        // arrange
        Anagrams gd = new Anagrams();

        // act
        boolean result = gd.isAnagramDS("Jose", "BalollllJyuuusooooe");

        // assert
        Assert.assertTrue(result);
    }

    @Test
    public void isAnagramDS_WithSpacesAndIsNotAnagram_ReturnFalse() {
        // arrange
        Anagrams gd = new Anagrams();

        // act
        boolean result = gd.isAnagramDS("Jose", " J o s e ");

        // assert
        Assert.assertFalse(result);
    }
}
