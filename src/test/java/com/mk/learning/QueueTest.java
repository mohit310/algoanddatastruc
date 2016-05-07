package com.mk.learning;

import com.mk.learning.collections.Queue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mk on 5/7/16.
 */
public class QueueTest {

    @Test
    public void testEnqueue() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        assertEquals(1, queue.size());
    }

    @Test
    public void testDequeue() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        assertEquals(5, queue.size());
        for (int i = 1; i <= 5; i++) {
            Integer data = queue.dequeue();
            assertEquals(Integer.valueOf(i), data);
        }

    }

    @Test(expected = Exception.class)
    public void testNoElementInQueue() throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.dequeue();

    }
}
