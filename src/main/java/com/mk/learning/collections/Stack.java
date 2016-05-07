package com.mk.learning.collections;

/**
 * Created by mk on 5/6/16.
 */
public class Stack<V> {

    private Node<V> first;
    private int N;

    public void push(V item) {
        Node lastFirst = first;
        first = new Node();
        first.item = item;
        first.next = lastFirst;
        N++;
    }

    public V pop() {
        Node<V> lastFirst = first;
        first = (lastFirst != null && lastFirst.next != null) ? lastFirst.next : null;
        if (lastFirst != null) {
            N--;
            return lastFirst.item;
        }
        return null;
    }

    public int size() {
        return N;
    }


    private class Node<V> {
        V item;
        Node next;

    }
}
