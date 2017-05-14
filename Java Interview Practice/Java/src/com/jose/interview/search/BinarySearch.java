package com.jose.interview.search;

/**
 * Created by housemex408 on 2/19/17.
 */
public class BinarySearch {

    /**
     * Time Complexity:  O(log n) - divide and conquer
     * Space Complexity:  O(1) - space taken by the algorithm is the same for any number of elements in the array
     * Works only on sorted arrays!
     * https://en.wikipedia.org/wiki/Binary_search_algorithm
     */
    public boolean binarySearch(int [] input, int value)
    {
        return binarySearch(input, 0, input.length, value);
    }

    private boolean binarySearch(int [] input, int start, int end, int value)
    {
        if (start > end) return false;
        int index = (start + end) / 2;
        int midpoint = input[index];

        if(midpoint == value) return true;
        else if(value < midpoint)
            return binarySearch(input, 0, index - 1, value);
        else
            return binarySearch(input, index + 1, input.length, value);
    }
}
