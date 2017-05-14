package com.jose.interview.search.tests;

import com.jose.interview.search.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by housemex408 on 2/19/17.
 */
public class BinarySearchTests {

    @Test
    public void binarySearch_whenValueIsInArray_returnTrue()
    {
        //arrange
        BinarySearch search = new BinarySearch();

        //act
        boolean found = search.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8 }, 3);

        //assert
        Assert.assertTrue(found);
    }
}
