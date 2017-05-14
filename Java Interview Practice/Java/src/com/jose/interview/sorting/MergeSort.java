package com.jose.interview.sorting;

/**
 * Created by housemex408 on 2/19/17.
 */
public class MergeSort {

    /**
     *  Time Complexity:  O(n log n)
     *  Space Complexity:  O(n)
     *
     *  Use when input is random; you don't know much about the data
     *  and you want guaranteed O(n log n) worst case time
     *
     *  https://www.youtube.com/watch?v=KF2j-9iSf4Q
     *  https://en.wikipedia.org/wiki/Merge_sort
     */
    public void mergeSort(int [] input)
    {
        final int [] mergedArray = new int [input.length];
        mergeSort(input, 0, input.length - 1, mergedArray);
    }

    private void mergeSort(int [] input, int leftStart, int rightEnd, int [] mergedArray)
    {
        if (leftStart >= rightEnd) return;

        final int index = (leftStart + rightEnd) / 2;

        mergeSort(input, leftStart, index, mergedArray);
        mergeSort(input, index + 1, rightEnd, mergedArray);
        mergeHalves(input, leftStart, rightEnd, mergedArray);
    }

    private void mergeHalves(int [] input, int leftStart, int rightEnd, int [] tempArray)
    {
        //end of the first half
        int leftEnd = (leftStart + rightEnd) / 2;
        //beginning of the second half
        int rightStart = leftEnd + 1;
        
        //define two indexes & index into the temp array
        int leftIndex = leftStart;
        int rightIndex = rightStart;
        int tempIndex = leftStart;

        while (leftIndex <= leftEnd && rightIndex <= rightEnd)
        {
            if(input[leftIndex] <= input[rightIndex]) {
                tempArray[tempIndex] = input[leftIndex];
                leftIndex++;
            }
            else{
                tempArray[tempIndex] = input[rightIndex];
                rightIndex++;
            }
            tempIndex++;
        }

        //only one of these will have effect since only one of the indices will have gone out of bounds
        System.arraycopy(input, leftIndex, tempArray, tempIndex, (leftEnd - leftIndex) + 1);
        System.arraycopy(input, rightIndex, tempArray, tempIndex, (rightEnd - rightIndex) +1);

        //copy back to the source array
        int size = (rightEnd - leftStart) + 1;
        System.arraycopy(tempArray, leftStart, input, leftStart, size);
    }
}
