package com.tree;

public class BinaryTree<E extends Comparable<E>> {
    /*
     * Profundidade: índice do nó em relação à raiz (raíz é índice 0)
     * Grau: qtd de filhos que um nó tem
     * Folha/Nó terminal: nó que não possui filhos
     *
     * Árvore de busca binária: maiores valores ficam à direita, menores valores
     * ficam à esquerda
     *
     * Valores a serem inseridos são sempre folhas
     * Para excluir, se pega o maior valor à esquerda do nó a ser excluído
     * e o utiliza no lugar do nó a ser excluído.
     * */
    private Node<E> root;

    public void insert(E el) {
        Node<E> newNode = new Node<>(el);
        root = insert(root, newNode);
    }

    public void remove() {}

    public void showInOrder() {
        showInOrder(root);
    }

    public void showPreOrder() {
        showPreOrder(root);
    }

    public void showPostOrder() {
        showPostOrder(root);
    }

    private void showInOrder(Node<E> current) {
        if (current != null) {
            showInOrder(current.left);
            System.out.print(current.el + " ");
            showInOrder(current.right);
        }
    }

    private void showPreOrder(Node<E> current) {
        if (current != null) {
            System.out.print(current.el + " ");
            showPreOrder(current.left);
            showPreOrder(current.right);
        }
    }

    private void showPostOrder(Node<E> current) {
        if (current != null) {
            showPostOrder(current.left);
            showPostOrder(current.right);
            System.out.print(current.el + " ");
        }
    }

    /*
     * el.compareTo(E otherEl): 0 -> elements are equal
     * 1 -> el is greater than otherEl
     * -1 -> el is less than otherEl
     * */
    private Node<E> insert(Node<E> current, Node<E> newNode) {
        if (current == null) {
            return newNode;
        } else if (newNode.el.compareTo(current.el) < 0) {
            current.left = insert(current.left, newNode);
        } else if (newNode.el.compareTo(current.el) >= 0) {
            current.right = insert(current.right, newNode);
        }
        return current;
    }

    private static class Node<E extends Comparable<E>> {
        private E el;
        private Node<E> right;
        private Node<E> left;

        public Node() {}

        public Node(E el) {
            this.el = el;
        }
    }
}
