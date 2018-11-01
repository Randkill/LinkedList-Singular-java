package com.company;

public class CircularLinkedList {
    private Node start, last;
    CircularLinkedList(){
        start = null;
        last = null;
        //start = last;
    }

    public void addFirst(int data){
        Node newNode = new Node();
        newNode.Data = data;
        if(start == last && start == null && last == null){
            last = newNode;
            //start.next = last;
            start = newNode;

            last.next = start;
        }else{
            last.next = newNode;
            newNode.next = start;
            start = newNode;
        }

    }

    public int deleteFirst(){
        if(start == null){
            return -1;
        }else {
            Node current = start;
            start = start.next;
            last.next = start;
            return current.Data;
        }
    }

    public void printList(){
        Node currentNode = start;
        while(currentNode.next != start){
            System.out.print(currentNode.Data + " ---> ");
            currentNode = currentNode.next;
        }

    }
}
