package com.jose.interview.sorting;

/**
 * Created by housemex408 on 2/19/17.
 */
public class QuickSort {

    /**
     * Time Complexity: O(n^2) - when array is already sorted or all equal elements
     * Space Complexity: O(n) - since it's an in place sort
     * https://en.wikipedia.org/wiki/Quicksort
     * https://www.youtube.com/watch?v=SLauY6PpjW4
     */
    public void quickSort(int [] input){
        quickSort(input, 0, input.length -1);
    }

    private void quickSort(int [] input, int left, int right)
    {
        if (left >= right)
            return;

        int pivot = input[(left + right) / 2];
        int index  = partition(input, left, right, pivot);
        quickSort(input, left, index -1);
        quickSort(input, index, right);
    }

    private int partition(int [] input, int left, int right, int pivot)
    {
        while (left <= right)
        {
            while (input[left] < pivot)
                left++;
            while (input[right] > pivot)
                right--;
            if (left <= right) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        }

        return left;
    }
}
