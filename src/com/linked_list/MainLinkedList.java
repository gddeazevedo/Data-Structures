package com.linked_list;


public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(3*i + 1);
        }

        System.out.println(numbers.size());
        System.out.println(numbers);
        System.out.println(numbers.get(9));
        System.out.println(numbers.remove(4));
        System.out.println(numbers);
    }
}
