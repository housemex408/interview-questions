package com.jose.interview.datastructures.tests;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

/**
 * This class implements the Set interface, backed by a hash table (actually a HashMap instance).
 * It makes no guarantees as to the iteration order of the set; in particular,
 * it does not guarantee that the order will remain constant over time. This class permits the null element.
 * Duplicates are not allowed
 *
 * https://dzone.com/articles/hashset-vs-treeset-vs
 * https://en.wikipedia.org/wiki/Set_(abstract_data_type)
 */
public class HashSetTests {

    /**
     * Time Complexity:  O(1) - add, remove, contains and size
     * Space Complexity:  O(n) - 
     * https://en.wikipedia.org/wiki/Priority_queue#Equivalence_of_priority_queues_and_sorting_algorithms
     */
    @Test
    public void add_whenElementIsPlacedInQueue_sizeShouldEqual1()
    {
        //arrange
        HashSet<Integer> set = new HashSet();

        //act
        set.add(6);

        //assert
        Assert.assertEquals(1, set.size());
    }
}
