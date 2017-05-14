package com.jose.interview.datastructures.tests;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

/**
 * An unbounded priority queue based on a priority min heap (default)
 * Max heap behavior accomplished by natural sort order or instantiating a PQueue with a Comparator
 */
public class PriorityQueueTests {

    /**
     * Time Complexity:  O(log n) - enqueing and dequeing methods (offer, poll, remove() and add)
     * Space Complexity:  O(n) - minimum, usually n+m space allocated
     * https://en.wikipedia.org/wiki/Priority_queue#Equivalence_of_priority_queues_and_sorting_algorithms
     */
    @Test
    public void enqueue_whenElementIsPlacedInQueue_sizeShouldEqual1()
    {
        //arrange
        PriorityQueue<Integer> queue = new PriorityQueue();

        //act
        queue.add(6);
        queue.add(5);
        queue.add(1);
        queue.add(2);

        //assert
        Assert.assertEquals(4, queue.size());
    }

    /**
     * Time Complexity:  O(1) - peek, element, and size
     * Space Complexity:  O(n) - minimum, usually n+m space allocated
     * https://en.wikipedia.org/wiki/Priority_queue#Equivalence_of_priority_queues_and_sorting_algorithms
     */
    @Test
    public void peek_whenElementsArePlacedInQueue_firstElementShouldBeSmallest()
    {
        //arrange
        PriorityQueue<Integer> queue = new PriorityQueue();

        //act
        queue.add(6);
        queue.add(5);
        queue.add(1);
        queue.add(2);

        //assert
        Assert.assertEquals(1, queue.peek().intValue());
    }

    /**
     * Time Complexity:  O(log n) - poll
     * Space Complexity:  O(n) - minimum, usually n+m space allocated
     * https://en.wikipedia.org/wiki/Priority_queue#Equivalence_of_priority_queues_and_sorting_algorithms
     */
    @Test
    public void poll_whenElementsArePlacedInQueue_firstElementShouldBe2()
    {
        //arrange
        PriorityQueue<Integer> queue = new PriorityQueue();

        //act
        queue.add(6);
        queue.add(5);
        queue.add(1);
        queue.add(2);

        queue.poll();

        //assert
        Assert.assertEquals(2, queue.peek().intValue());
    }

    /**
     * Time Complexity:  O(log n) - poll
     * Space Complexity:  O(n) - minimum, usually n+m space allocated
     * https://en.wikipedia.org/wiki/Priority_queue#Equivalence_of_priority_queues_and_sorting_algorithms
     */
    @Test
    public void poll_whenKeyValueElementsArePlacedInQueue_firstElementShouldBe2()
    {
        //arrange
        PriorityQueue<KeyValue> queue = new PriorityQueue();

        //act
        queue.add(new KeyValue(6, "six"));
        queue.add(new KeyValue(5, "five"));
        queue.add(new KeyValue(1, "one"));
        queue.add(new KeyValue(2, "two"));

        queue.poll();

        //assert
        Assert.assertEquals(2, queue.peek().getKey());
    }
}

class KeyValue implements Comparable<KeyValue>{

    public KeyValue(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public int compareTo(KeyValue kv) {
        if(kv.key > this.key)
            return -1;
        else if(kv.key < this.key)
            return 1;
        else return 0;
    }

    private int key;
    private String value;
}
