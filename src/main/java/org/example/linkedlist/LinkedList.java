package org.example.linkedlist;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public LinkedList() {
        this.head = null;
    }
}
