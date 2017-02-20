package com.jose.interview.subtracting;

/**
 * Write a function that takes an array of numbers and returns the greatest
 * difference you can get by subtracting any two of those numbers.
 * For example, if our input is [5,8,6,1], the greatest difference we can get is 8-1, which is 7. So we should return 7.
 */
public class GreatestDifference {

    public GreatestDifference()
    {
        //do nothing
    }

    /**
     * Assumptions:
     * -only integers
     * -negative numbers allowed
     * -input array can be very large
     *
     * Approach 1 (Brute Force):
     * -sort the array from smallest to largest (bubble sort)
     * -maintain a variable to store current max difference
     * -maintain an index for start and end of array
     *
     * Example [5,8,6,1] -> [1,5,6,8]
     * Max = 8-1 = 7
     *
     * Example [-4,-1,0,5,7]
     * Max = 11
     */
    public int calculateGreatestDifference_WithSortingAlgorithm(int [] input)
    {
        int [] sortedInput = sort(input);
        int smallest = sortedInput[0];
        int largest = sortedInput[sortedInput.length - 1];

        return (largest - smallest);
    }

    /**
     * This can be anyone of known sorting algorithms
     * https://betterexplained.com/articles/sorting-algorithms/
     *
     * Best Time Complexity We can do:
     *
     * O(N) - Counting Sort, Radix Sort
     *
     * Best Space Complexity We can do:
     *
     * O(N+K) - http://bigocheatsheet.com/
     */
    private int [] sort(int [] input)
    {
        return input;
    }

    /**
     *
     * Example [7, 0, -1, 4, -2]
     *
     * smallest = 7
     * largest = 7
     *
     * i = 1
     * current = 0
     * current < smallest = true
     * smallest = 0
     *
     * i = 2
     * current = -1
     * current < smallest = true
     * smallest = -1
     *
     * i = 3
     * current = 4
     * current < smallest = false
     * current > largest = false
     *
     * i = 4
     * current = -2
     * current < smallest = true
     * smallest = -2
     *
     * return (-7-2) = 9
     *
     * ****************************************
     * What about only two numbers? e.g. [2,5]
     *
     * smallest = 2
     * largest = 2
     *
     * i = 1
     *
     * current = 5
     * current < smallest = true
     * largest = 5
     *
     * return (5-2) = 3
     *
     * ****************************************
     *
     * What about only two numbers that are the same? e.g. [2,2]
     *
     * smallest = 2
     * largest = 2
     *
     * i = 1
     *
     * current = 2
     * current < smallest = false
     * current > smallest = false
     *
     * return (2-2) = 0
     *
     */
    public int calculateGreatestDifference_BruteForce(int [] input)
    {
        int smallest = input[0];
        int largest = smallest;
        int current;

        for (int i = 1; i < input.length; i++)
        {
            current = input[i];
            if(current < smallest)
                smallest = current;
            else if (current > largest)
                largest = current;
        }

        return (largest - smallest);
    }
}
