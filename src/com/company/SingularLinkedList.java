package com.company;

public class SingularLinkedList {
    private Node start;     //in this Data-Structure , 'start' node`s postition will be alternative
    SingularLinkedList(){
        start = null;
    }

    public void addFirst(int data){    //'start' node will be changed and moved forward by invoking any .addFirst(data)
        Node newNode = new Node();
        newNode.Data = data;
        if(start == null){      //if our chain is Empty
            newNode.next = null;
            start = newNode;
        }else {                 //if our chain is not Empty
            newNode.next = start;
            start = newNode;
        }
    }

    public int deleteFirst(){
        if(start == null){          //if our chain is Empty , it will
            return -1;              //return a specific number as a symbol
        }else {                     //if our chain is not Empty
            Node currentNode;       //it will return the first node`s data
            currentNode = start;
            start = start.next;
            return currentNode.Data;
        }
    }

    public void addLast(int data){
        Node newNode = new Node();
        newNode.Data = data;
        if(start == null){      //if our chain is Empty , first node will be added
            newNode.next = null;
            start = newNode;
        }else {                 //if our chin is not Empty , a new Node will be added to the tail of our chain
            Node currentNode = start;
            while (currentNode.next != null){   //it will move forward one step before it reached 'null'
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = null;
        }
    }

    public int deleteLast(){
        if(start == null){          //if our chain is Empty , it will
            return -1;              //return a specific integer as a symbol
        }else {                     //if our chain is not Empty
            Node currentNode;
            currentNode = start;
            while (currentNode.next.next != null){      //traveling chain from start node
                currentNode = currentNode.next;         //to one node , remaining to the last node of our chain
            }
            Node temp;
            temp = currentNode.next;
            currentNode.next = null;
            return temp.Data;
        }
    }

    public int listLenght(){       //returns lenght of the list
        int counter = 0;
        Node currentNode = start;
        while (currentNode.next != null)
        {
            counter++;
            currentNode = currentNode.next;
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
