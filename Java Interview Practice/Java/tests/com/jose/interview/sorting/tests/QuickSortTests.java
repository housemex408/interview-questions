package com.jose.interview.sorting.tests;

import com.jose.interview.sorting.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by housemex408 on 2/19/17.
 */
public class QuickSortTests {

    @Test
    public void quickSort_whenInputIsNotSorted_sortInPlace() {
        //arrange
        QuickSort sorter = new QuickSort();
        int [] input = new int [] { 9, 2, 6, 4, 3, 5, 1};

        //act
        sorter.quickSort(input);

        //assert
        Assert.assertArrayEquals(new int [] {1, 2, 3, 4, 5, 6, 9}, input);
    }
}
