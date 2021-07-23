package com.doubly_linked_list;

import com.node.DoubleNode;

public class DoublyLinkedList<T> {
    /*
    * Is like a simple linked list, but each node has a reference for the next node and the
    * previous node
    * So, the first node points to the second and to null, the second points to the first and to the third,
    * the third points to the fourth and the second elements, and so on, until the last element.
    * The last element points to the node n-1 and to null
    * */

    private DoubleNode<T> firstRef;
    private DoubleNode<T> lastRef;
    private int listSize;

    public DoublyLinkedList() {
        listSize = 0;
    }

    public void add(T data) {
        DoubleNode<T> newNode = new DoubleNode<>(data);
        newNode.setNextNode(null);
        newNode.setPrevNode(lastRef);

        if (firstRef == null) {
            firstRef = newNode;
        }
        if (lastRef != null) {
            lastRef.setNextNode(newNode);
        }

        lastRef = newNode;
        listSize++;
    }

    public void add(int index, T data) {
        validateIndex(index);
        DoubleNode<T> newNode = new DoubleNode<>(data);
        DoubleNode<T> aux = getNode(index);
        newNode.setNextNode(aux);

        if (newNode.getNextNode() != null) {
            newNode.setPrevNode(aux.getPrevNode());
//            newNode.getNextNode().setPrevNode(newNode);
            aux.setPrevNode(newNode);
        } else {
            newNode.setPrevNode(lastRef);
            lastRef = newNode;
        }

        if (index == 0) {
            firstRef = newNode;
        } else {
            newNode.getPrevNode().setNextNode(newNode);
        }

        listSize++;
    }

    public T remove(int index) {
        validateIndex(index);
        T data;

        if (index == 0) {
            data = firstRef.getData();
            firstRef = firstRef.getNextNode();
            if (firstRef != null) {
                firstRef.getPrevNode().setNextNode(null);
                firstRef.setPrevNode(null);
            }
        } else {
            DoubleNode<T> aux = getNode(index);
            aux.getPrevNode().setNextNode(aux.getNextNode());

            if (aux != lastRef) {
                aux.getNextNode().setPrevNode(aux.getPrevNode());
            } else {
                lastRef = aux.getPrevNode();
                aux.setPrevNode(null);
            }
            data = aux.getData();
            aux = null;
        }

        listSize--;
        return data;
    }

    public T get(int index) {
        return getNode(index).getData();
    }

    public int size() {
        return listSize;
    }

    private void validateIndex(int index) {
        if (index >= size() || index < 0) {
            int lastIndex = Math.max(listSize - 1, 0);
            String msg = "Index out of bounds.\nFirst index is 0\nLast index is " + lastIndex;
            throw new IndexOutOfBoundsException(msg);
        }
    }

    private DoubleNode<T> getNode(int index) {
        DoubleNode<T> currentNode = firstRef;

        for (int i = 0; i < index && currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        return currentNode;
    }

    @Override
    public String toString() {
        String str = "null";
        DoubleNode<T> currentNode = firstRef;

        for (int i = 0; i < listSize; i++) {
            str += currentNode;
            currentNode = currentNode.getNextNode();
        }

        str += "null";
        return str;
    }
}
