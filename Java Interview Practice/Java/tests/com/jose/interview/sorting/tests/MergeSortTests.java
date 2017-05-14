package com.jose.interview.sorting.tests;

import com.jose.interview.sorting.MergeSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by housemex408 on 2/19/17.
 */
public class MergeSortTests {

    @Test
    public void mergeSort_whenInputIsNotSorted_sortInPlace() {
        //arrange
        MergeSort sorter = new MergeSort();
        int [] input = new int [] { 9, 2, 6, 4, 3, 5, 1};

        //act
        sorter.mergeSort(input);

        //assert
        Assert.assertArrayEquals(new int [] {1, 2, 3, 4, 5, 6, 9}, input);
    }
}
