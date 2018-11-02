package com.company;

public class SingularBidirectionalLinkedList {
    private Node start;
    SingularBidirectionalLinkedList(){
        start = null;
    }

    public void addFirst(int data){
        Node newNode = new Node();
        newNode.Data = data;
        if(start == null){
            newNode.next = null;
            newNode.previous = null;
            start = newNode;
        }else {
            newNode.next = start;
            start.previous = newNode;
            newNode.previous = null;
            start = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node();
        newNode.Data = data;
        if(start == null){
            newNode.next = null;
            newNode.previous = null;
            start = newNode;
        }
        else{
            Node currentNode = start;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.previous = currentNode;
            newNode.next = null;
        }
    }

    public int deleteFirst(){
        if(start == null){
            return -1;
        }else {
            Node currentNode = start;
            start = currentNode.next;
            start.previous = null;
            currentNode.next = null;
            return currentNode.Data;
        }
    }

    public int deleteLast(){
        if(start == null){
            return -1;
        }else {
            Node currentNode = start;
            while (currentNode.next.next != null){
                currentNode = currentNode.next;
            }
            Node temp = currentNode.next;
            currentNode.next = null;
            temp.previous = null;
            return temp.Data;
        }
    }

    public void printList(){
        Node currentNode = start;
        while (currentNode.next != null){
            System.out.print(currentNode.Data + " ---> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.Data);
        System.out.print(" --> NULL" + "\n");
    }
}
