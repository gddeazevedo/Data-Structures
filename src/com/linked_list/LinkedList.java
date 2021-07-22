package com.linked_list;

import com.node.Node;

public class LinkedList<T> {
    /**
     * The last element always points to null
     */
    private Node<T> ref; // always points to the first element in the list
    private Node<T> currentNode;

    public void add(T data) {
        if (isEmpty()) {
            ref = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            currentNode = ref;

            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }

            currentNode.setNextNode(newNode);
            currentNode = null;
        }
    }

    public T remove(int index) {
        Node<T> removedNode = getNode(index);
        if (index == 0) {
            ref = removedNode.getNextNode();
        } else {
            Node<T> previousNode = getNode(index - 1);
            previousNode.setNextNode(removedNode.getNextNode());
        }
        removedNode.setNextNode(null);
        return removedNode.getData();
    }

    public T get(int index) {
        return getNode(index).getData();
    }

    public int size() {
        int qttNodes = 0;
        currentNode = ref;

        while (currentNode != null) {
            qttNodes++;
            currentNode = currentNode.getNextNode();
        }

        return qttNodes;
    }

    public boolean isEmpty() {
        return ref == null;
    }

    private void validateIndex(int index) {
        if (index >= size() || index < 0) {
            int lastIndex = size() - 1;
            String msg = "Index out of bounds.\nFirst index is 0\nLast index is " + lastIndex;
            throw new IndexOutOfBoundsException(msg);
        }
    }

    private Node<T> getNode(int index) {
        validateIndex(index);
        currentNode = ref;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }

        Node<T> returnedNode = currentNode;
        currentNode = null;
        return returnedNode;
    }

    @Override
    public String toString() {
        String str = "";
        currentNode = ref;

        while (currentNode != null) {
            str += currentNode + "->";
            currentNode = currentNode.getNextNode();
        }
        str += "null";
        return str;
    }
}
