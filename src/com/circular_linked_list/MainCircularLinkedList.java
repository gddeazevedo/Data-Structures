package com.circular_linked_list;

public class MainCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList<String> names = new CircularLinkedList<>();

        names.add("Pam");
        names.add("Jim");
        names.add("Dwight");
        names.add("Michael");
        names.add("Angela");

        System.out.println(names);
        System.out.println("Size: " + names.size());
        System.out.println("Third name: " + names.get(2));
        System.out.println("List head: " + names.getHead());
        System.out.println("List tail: " +names.getTail());

        System.out.println("------\n");

        System.out.println("Removed name: " + names.remove(4));
        System.out.println(names);
        System.out.println("Size: " + names.size());
        System.out.println("List head: " + names.getHead());
        System.out.println("List tail: " +names.getTail());

        System.out.println("------\n");

        System.out.println("Removed name: " + names.remove(3));
        System.out.println(names);
        System.out.println("Size: " + names.size());
        System.out.println("List head: " + names.getHead());
        System.out.println("List tail: " +names.getTail());

        System.out.println("------\n");

        System.out.println("Removed name: " + names.remove(0));
        System.out.println(names);
        System.out.println("Size: " + names.size());
        System.out.println("List head: " + names.getHead());
        System.out.println("List tail: " +names.getTail());
    }
}
