package com.company;

public class CircularBidirectionalLinkedList {
    private Node start;
    CircularBidirectionalLinkedList(){
        start = null;
    }

    public void addFirst(int data){
        Node newNode = new Node();
        newNode.Data = data;
        if(start == null)   //if our chain is Empty
        {
            newNode.next = newNode;
            newNode.previous = newNode;
            start = newNode;
        }else {             //if our chain is not Empty
            Node currentNode = start;
            /*while(currentNode.next != start){       //chain traversal form start to end of list
                currentNode = currentNode.next;
            }*/
            currentNode = chainTraversal();             //using chain traversal method instead of
            newNode.next = start;                       //commented code above
            start.previous = newNode;
            currentNode.next = newNode;
            newNode.previous = currentNode;
            start = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node();
        newNode.Data = data;
        if(start == null){      //if our chain is Empty
            newNode.next = newNode;
            newNode.previous = newNode;
            start = newNode;
        }else {                 //if our chain is not Empty
            Node currentNode = chainTraversal();
        /*                                      //chain traversal alternative
        while (currentNode.next != start){
            currentNode = currentNode.next;
        }
        */
            currentNode.next = newNode;
            newNode.previous = currentNode;
            newNode.next = start;
            start.previous = newNode;
        }
    }
    public int deleteFirst(){
        if(start == null){      //if our chain is Empty
            return -1;          //it will rertun '-1' as an special symbol
        }else {                 //if our chain is not Empty
            Node currentNode = start;
            start = currentNode.next;
            currentNode.next = null;
            currentNode.previous = null;
            Node temp = start;                  //special travel
            while (temp.next != currentNode){
                temp=temp.next;
            }
            temp.next = start;
            start.previous = temp;
            return currentNode.Data;
        }
    }

    public int deleteLast(){
        if(start == null){      //if out chain is Empty
            return -1;          //it will rertun '-1' as an special symbol
        }else {                 //if our chain is not Empty
            Node currentNode = chainBENDTraversal();
            Node temp = chainTraversal();
            temp.next = null;
            temp.previous = null;
            currentNode.next = start;
            start.previous = currentNode;
            return temp.Data;
        }
    }

    public Node chainTraversal(){           //chain traversal method from
        Node currentNode = start;           //start to end
        while (currentNode.next != start){
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public Node chainBENDTraversal(){       //chain traversal from start : chain Before End Traversal
        Node currentNode = start;           //to one node remaining to the tail
        while (currentNode.next.next != start){
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void printList(){      //displaying our chain
        Node currentNode = start;
        if(start == null){
            System.out.print("NULL\n");
        }else {
            while (currentNode.next != start){                  //chain traversal form start to end of list
                System.out.print(currentNode.Data + " ---> ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.Data + " ) \n");
        }
    }
}
