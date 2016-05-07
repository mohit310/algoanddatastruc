package com.mk.learning.collections;

/**
 * Created by mk on 5/6/16.
 */
public class Stack<V> {

    private Node<V> first;
    private int N;

    public void push(V item) {
        Node n = new Node();
        n.item = item;
        if (first == null) {
            first = n;
        } else {
            Node last = first;
            first = n;
            first.next = last;
        }
        N++;
    }

    public V pop() throws Exception {
        if (first == null) throw new Exception("Stack empty");
        Node<V> toPop = first;
        first = first.next;
        N--;
        return toPop.item;
    }

    public int size() {
        return N;
    }


    private class Node<V> {
        V item;
        Node next;

    }
}
