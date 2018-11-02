package com.company;

public class SingularBidirectionalLinkedList {
    private Node start;
    SingularBidirectionalLinkedList(){
        start = null;
    }

    public void addFirst(int data){     //New node will be added to the first of chain
        Node newNode = new Node();
        newNode.Data = data;
        if(start == null){      //when our chain is Empty
            newNode.next = null;
            newNode.previous = null;
            start = newNode;
        }else {       //when our chain is not Empty
            newNode.next = start;
            start.previous = newNode;
            newNode.previous = null;
            start = newNode;
        }
    }

    public void addLast(int data){    //new node will be added to the tail of our chain
        Node newNode = new Node();
        newNode.Data = data;
        if(start == null){    //if our chain is Empty
            newNode.next = null;
            newNode.previous = null;
            start = newNode;
        }
        else{       //if our chain is not Empty
            Node currentNode = start;
            while (currentNode.next != null){       //traveling from first node till the last
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.previous = currentNode;
            newNode.next = null;
        }
    }

    public int deleteFirst(){       //first node will be deleted
        if(start == null){  //if our chain is Empty
            return -1;
        }else {     //if our chain is not Empty
            Node currentNode = start;
            start = currentNode.next;
            start.previous = null;
            currentNode.next = null;
            return currentNode.Data;
        }
    }

    public int deleteLast(){
        if(start == null){    //if our chain is Empty
            return -1;
        }else {     //if our chain is not Empty
            Node currentNode = start;
            while (currentNode.next.next != null){  //traveling chain from start node
                currentNode = currentNode.next;     //till one node remaining to the last one
            }
            Node temp = currentNode.next;
            currentNode.next = null;
            temp.previous = null;
            return temp.Data;
        }
    }

    public void printList(){      //displaying our chain
        Node currentNode = start;
        while (currentNode.next != null){
            System.out.print(currentNode.Data + " ---> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.Data);
        System.out.print(" --> NULL" + "\n");
    }
}
