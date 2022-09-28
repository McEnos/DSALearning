package org.example.linkedlist;

public class Main {
    public static void main(String[] args) {
        Node<Integer> nodeOne = new Node<>(1);
        Node<Integer> nodeTwo = new Node<>(2);
        Node<Integer> nodeThree = new Node<>(3);
        Node<Integer> nodeFour = new Node<>(4);
        Node<Integer> nodeFive = new Node<>(5);


        nodeOne.setNext(nodeTwo);
        nodeTwo.setNext(nodeThree);
        nodeThree.setNext(nodeFour);
        nodeFour.setNext(nodeFive);

        LinkedList<Integer> linkedList = new LinkedList<>(nodeOne);
        linkedList.insertAtBeginning(6);
        linkedList.insertAtEnd(7);
        linkedList.printList();
        System.out.println();
       // System.out.println(linkedList.listLengthIterative());
        //linkedList.deleteFirstNode();
        System.out.println();


        //linkedList.deleteFirstNode();
        linkedList.deleteLastNode();
        linkedList.deleteLastNode();
        linkedList.deleteFirstNode();
        linkedList.printList();


    }
}
