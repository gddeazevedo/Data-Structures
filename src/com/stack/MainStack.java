package com.stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<>();

        bookStack.push("Curso intensivo de Python");
        bookStack.push("Código Limo");
        bookStack.push("Cálculo Vol 1");
        bookStack.push("Trigonometria");
        bookStack.push("Algebra II");
        bookStack.push("A cartilha da lógica");
        System.out.println(bookStack);


        Stack<Integer> numberStack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            numberStack.push(i);
        }

        System.out.println(numberStack);

        String bookPopped = bookStack.pop();
        System.out.println(bookPopped);
        System.out.println(bookStack);
    }
}
