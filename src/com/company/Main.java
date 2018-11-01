package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SingularLinkedList list = new SingularLinkedList();
        list.printList();
        list.addFirst(1);
        list.printList();
        list.addFirst(2);
        list.printList();
        list.addFirst(3);
        list.printList();
        list.addLast(5);
        list.printList();
        list.deleteLast();
        list.printList();

    }
}
