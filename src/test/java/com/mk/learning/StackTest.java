package com.mk.learning;

import com.mk.learning.collections.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mk on 5/6/16.
 */
public class StackTest {

    @Test
    public void testPush() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPop() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        assertEquals(new Integer(1), stack.pop());
    }

    @Test(expected = Exception.class)
    public void testEmptyStack() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        stack.pop();
    }

    @Test
    public void testMultiPush() {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 5; i++)
            stack.push(i);
        assertEquals(5, stack.size());
    }

    @Test
    public void testMultiPop() throws Exception{
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 1; i <= 5; i++)
            stack.push(i);
        for (int i = 5; i > 0; i--) {
            assertEquals(new Integer(i), stack.pop());
        }

    }


}
