package com.tree;

public class MainTree {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.insert(5);
        tree.insert(10);
        tree.insert(1);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
//        tree.insert(5);
        tree.insert(8);
        tree.insert(7);

        tree.showInOrder();
        System.out.println();

//        tree.remove(1);
//        tree.remove(2);
//        tree.remove(10);
        tree.remove(5);
        tree.showInOrder();
    }
}
