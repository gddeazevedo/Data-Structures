package com.example;

public class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
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
        return "Node { data:" + data + " }";
    }
}
