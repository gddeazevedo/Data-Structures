package com.doubly_linked_list;

public class MainDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> names = new DoublyLinkedList<>();

        names.add("Pam");
        names.add("Jim");
        names.add("Michael");
        names.add("Dwigtht");
        names.add(1, "Stanley");

        System.out.println(names);
        System.out.println("Fifth element: " + names.get(4));
        System.out.println("Size: " + names.size());
        System.out.println("Element removed: " + names.remove(1));
        System.out.println(names);
        System.out.println("First element: " + names.get(0));
        System.out.println("Size: " + names.size());
    }
}
