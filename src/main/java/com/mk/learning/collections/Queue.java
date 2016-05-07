package com.mk.learning.collections;

/**
 * Created by mk on 5/7/16.
 */
public class Queue<V> {

    private Node<V> first;
    private Node<V> last;
    private int N;

    public void enqueue(V item) {
        Node n = new Node();
        n.item = item;
        if (first == null) {
            first = last = n;
        } else {
            last.next = n;
            last = n;
        }
        N++;
    }

    public V dequeue() throws Exception {
        if (first == null) throw new Exception("Queue is empty");
        Node<V> lastFirst = first;
        first = lastFirst.next;
        N--;
        return lastFirst.item;
    }

    public int size() {
        return N;
    }

    private class Node<V> {
        private V item;
        private Node next;
    }
}
