package org.example.linkedlist;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class LinkedList<T> {
    private Node<T> head;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public LinkedList() {
        this.head = null;
    }

    public int listLengthIterative() {
        Node<T> currentNode = head;
        int length = 0;
        while (Objects.nonNull(currentNode)) {
            length += 1;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    public int listLengthRecursive(Node<T> head) {
        if (Objects.isNull(head))
            return 0;
        return 1 + listLengthRecursive(head.getNext());
    }

    public void printList() {
        Node<T> currentNode = head;
        while (Objects.nonNull(currentNode)) {
            System.out.print(currentNode.getData() + ", ");
            currentNode = currentNode.getNext();
        }
    }

    public Node<T> insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
        return head;

    }

    public Node<T> insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = head;
        while (Objects.nonNull(currentNode.getNext()))
            currentNode = currentNode.getNext();
        currentNode.setNext(newNode);
        return head;
    }

    public Node<T> deleteFirstNode() {
        head = head.getNext();
        return head;
    }

    public Node<T> deleteLastNode() {
        Node<T> currentNode = head;
        Node<T> previousNode = null;
        while (Objects.nonNull(currentNode.getNext())) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        previousNode.setNext(null);

        return head;
    }

    public void deleteList() {
        head = null;
    }

    public Node<T> insertAtPosition(int position, T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> previousNode = null;
        Node<T> currentNode = head;
        int currentPosition = 0;
        while (currentPosition < position && Objects.nonNull(currentNode)) {
            previousNode = currentNode;
            currentPosition += 1;
            currentNode = currentNode.getNext();
        }
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
        return head;
    }

    public Node<T> deleteAtPosition(int position) {
        Node<T> previousNode = null;
        Node<T> currentNode = head;
        int currentPosition = 0;
        while (currentPosition < position && Objects.nonNull(currentNode)) {
            currentPosition += 1;
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        previousNode.setNext(currentNode.getNext());
        return head;
    }

}
