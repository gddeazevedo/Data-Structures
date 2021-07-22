package com.node;


public class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node() {}

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNextNode(Node<T> next) {
        this.nextNode = next;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }
}
