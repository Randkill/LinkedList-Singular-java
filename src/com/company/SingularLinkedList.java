package com.company;

public class SingularLinkedList {
    private Node start;     //in this Data-Structure , 'start' node`s postition will be alternative
    SingularLinkedList(){
        start = null;
    }

    public void addFirst(int data){    //'start' node will be changed and moved forward by invoking any .addFirst(data)
        Node newNode = new Node();
        if(start == null){
            newNode.Data = data;
            newNode.next = null;
            start = newNode;
        }else {
            newNode.Data = data;
            newNode.next = start;
            start = newNode;
        }
    }

    public int deleteFirst(){
        if(start == null){
            return -1;
        }else {
            Node currentNode;
            currentNode = start;
            start = start.next;
            return currentNode.Data;
        }
    }

    public void addLast(int data){
        Node newNode = new Node();
        if(start == null){
            newNode.Data = data;
            newNode.next = null;
            start = newNode;
        }else {
            Node currentNode = start;
            newNode.Data = data;
            while (currentNode.next != null){   //it will move forward one step before it reached 'null'
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = null;
        }
    }

    public int deleteLast(){
        if(start == null){
            return -1;
        }else {
            Node currentNode;
            currentNode = start;
            while (currentNode.next.next != null){
                currentNode = currentNode.next;
            }
            Node temp;
            temp = currentNode.next;
            currentNode.next = null;
            return temp.Data;
        }
    }

    public int listLenght(){       //returns lenght of the list
        int counter = 0;
        while (start.next != null)
        {
            counter++;
            start = start.next;
        }
        counter++;
        return counter;
    }

    public void reverseList(){

    }

    public void printList(){
        Node currentNode = start;
        while (currentNode != null){
            System.out.print(currentNode.Data + " ---> ");
            currentNode = currentNode.next;
        }
        System.out.print("NULL" + "\n");
    }
}
