package com.circular_linked_list;

import com.node.Node;

public class CircularLinkedList<T> {
    /*
     * Is the same thing as the simple linked list, but the last element, instead of pointing
     * to null, points to the first element in the list
     *
     * The first element is the head, the last is the tail
     */

    private Node<T> head; // always points to the first element
    private Node<T> tail; // always points to the last element
    private int listSize;

    public CircularLinkedList() {
        listSize = 0;
    }

    public T remove(int index) {
        validateIndex(index);

        Node<T> removedNode = getNode(index);

        if (index == 0) {
            head = removedNode.getNextNode();
        } else if (index == listSize - 1) {
            tail = getNode(index - 1);
            tail.setNextNode(null);
        } else {
            Node<T> prev = getNode(index - 1);
            prev.setNextNode(removedNode.getNextNode());
        }

        removedNode.setNextNode(null);
        listSize--;
        return removedNode.getData();
    }

    public T get(int index) {
        return getNode(index).getData();
    }

    public T getHead() {
        return head.getData();
    }

    public T getTail() {
        return tail.getData();
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            tail.setNextNode(newNode);
            tail = newNode;
        }
        listSize++;
    }

    public void add(int index, T data) {}

    public boolean isEmpty() {
        return listSize == 0;
    }

    public int size() {
        return listSize;
    }

    private void validateIndex(int index) {
        if ((isEmpty() && index != 0) || (index >= listSize || index < 0)) {
            int lastIndex = Math.max(listSize - 1, 0);
            throw new IndexOutOfBoundsException("First index: 0\nLast index: " + lastIndex);
        }
    }

    private Node<T> getNode(int index) {
        validateIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.getNextNode();
        }
        return current;
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> current = head;

        for (int i = 0;  i < size(); i++) {
            str += current + "->";
            current = current.getNextNode();
        }

        str += head;
        return str;
    }
}
