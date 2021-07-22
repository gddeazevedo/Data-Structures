package com.stack;

import com.node.Node;

public class Stack<T> {
    /*
    * LIFO
    * Last In First Out
    *
    * The last node points to the previous node, and the previous node points to the
    * previous node, and so on until the first element that points to null
    *
    * The first element always points to null
    * */

    private Node<T> ref; // ref always points to the stack top (the last element)

    public Stack() {}

    public Stack(T data) {
        ref = new Node<>(data);
    }

    /*
    * Gets the data within the top of the stack
    * Data type T from the last element
    * */
    public T top() {
        return !isEmpty() ? ref.getData() : null;
    }

    /*
    * Adds in the top of the stack a node with data type T
    * Adds at the end (last element)
    * */
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(ref);
        ref = newNode;
    }

    /*
    * Removes the element in the top of the stack
    * Removes the last element data and return it
    * Return type is T
    * */
    public T pop() {
        if (isEmpty()) return null;
        Node<T> current = ref;
        ref = ref.getNextNode();
        current.setNextNode(null);
        return current.getData();
    }

    public boolean isEmpty() {
        return ref == null;
    }

    @Override
    public String toString() {
        Node<T> current = ref;
        String str = "";

        while (current != null) {
            str += current;
            current = current.getNextNode();
        }

        return str;
    }
}
