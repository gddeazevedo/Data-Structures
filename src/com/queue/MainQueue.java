package com.queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> bankQueue = new Queue<>();

        bankQueue.enqueue("Roberta");
        bankQueue.enqueue("Gilmarta");
        bankQueue.enqueue("Pucca");
        bankQueue.enqueue("Gabriel");
        System.out.println(bankQueue);
        System.out.println(bankQueue.dequeue());
        System.out.println(bankQueue);
    }
}
