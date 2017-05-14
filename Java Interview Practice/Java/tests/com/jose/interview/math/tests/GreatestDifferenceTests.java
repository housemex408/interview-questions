package com.jose.interview.math.tests;

import org.junit.Assert;
import org.junit.Test;
import com.jose.interview.math.GreatestDifference;

public class GreatestDifferenceTests {

    @Test
    public void calculateGreatestDifference_WithSortingAlgorithm_WhenInputArrayHasMoreThanTwoItems() {
        // arrange
        GreatestDifference gd = new GreatestDifference();

        // act
        int result = gd.calculateGreatestDifference_WithSortingAlgorithm(new int [] {-4,-1,0,5,7});

        // assert
        Assert.assertEquals(11, result);
    }

    @Test
    public void calculateGreatestDifference_BruteForceWhenInputArrayHasMoreThanTwoItems() {
        // arrange
        GreatestDifference gd = new GreatestDifference();

        // act
        int result = gd.calculateGreatestDifference_BruteForce(new int [] {7, 0, -1, 4, -2});

        // assert
        Assert.assertEquals(9, result);
    }

    @Test
    public void calculateGreatestDifference_BruteForceWhenInputArrayHasTwoItems() {
        // arrange
        GreatestDifference gd = new GreatestDifference();

        // act
        int result = gd.calculateGreatestDifference_BruteForce(new int [] {5,2});

        // assert
        Assert.assertEquals(3, result);
    }

    @Test
    public void calculateGreatestDifference_BruteForceWhenInputArrayHasTwoItemsSame() {
        // arrange
        GreatestDifference gd = new GreatestDifference();

        // act
        int result = gd.calculateGreatestDifference_BruteForce(new int [] {2,2});

        // assert
        Assert.assertEquals(0, result);
    }
}
