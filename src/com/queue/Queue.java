package com.queue;

import com.node.Node;

public class Queue<T> {
    /*
    * FIFO
    * First In First Out
    * First element always point to null
    * The last node points to the previous node, and the previous node points to the
    * previous node, and so on until the first element that points to null
    * */

    private Node<T> ref; // always points to the last element (end of the queue)

    public Queue() {}

    public Queue(T data) {
        ref = new Node<>(data);
    }

    /*
    * Returns the first element data of the queue
    * */
    public T first() {
        if (isEmpty()) return null;

        Node<T> current = ref;

        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }

        return current.getData();
    }

    /*
    * Adds a data type T at the end of the queue
    * */
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(ref);
        ref = newNode;
    }

    /*
    * Removes and return the first element data of the queue
    * */
    public T dequeue() {
        if (isEmpty()) return null;

        Node<T> current = ref;
        Node<T> aux = ref;
        while (current.getNextNode() != null) {
            aux = current; // Node n - 1
            current = current.getNextNode(); // Node n
        }

        Node<T> firstNode = current;
        aux.setNextNode(null);
        return firstNode.getData();
    }

    public boolean isEmpty() {
        return ref == null;
    }

    @Override
    public String toString() {
        Node<T> current = ref;
        String str = "";

        while (current != null) {
            str += "[" + current + "]->";
            current = current.getNextNode();
        }

        str += "null";
        return str;
    }
}
