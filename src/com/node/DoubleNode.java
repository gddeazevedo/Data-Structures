package com.node;

public class DoubleNode<T> extends Node<T> {
    private Node<T> prevNode;

    public DoubleNode() {}

    public DoubleNode(T data) {
        super(data);
    }

    public DoubleNode(T data, Node<T> nextNode, Node<T> prevNode) {
        super(data, nextNode);
        this.prevNode = prevNode;
    }

    public DoubleNode(T data, Node<T> prevNode) {
        super(data);
        this.prevNode = prevNode;
    }

    public DoubleNode<T> getPrevNode() {
        return (DoubleNode<T>)prevNode;
    }

    @Override
    public DoubleNode<T> getNextNode() {
        return (DoubleNode<T>) super.getNextNode();
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }
}
