package com.example;

import java.awt.List;

public final class Main {
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("Node 1");
        Node<String> n2 = new Node<>("Node 2");

        n1.setNextNode(n2);

        Node<String> n3 = new Node<>("Node 3");

        n2.setNextNode(n3);

        Node<String> n4 = new Node<>("Node 4");

        n3.setNextNode(n4);

        Node<String> current = n1;
        while (current != null) {
            System.out.println(current);
            current = current.getNextNode();
        }
    }
}
