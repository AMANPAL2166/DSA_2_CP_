package LinkedList;

import java.util.LinkedList;

public class Linkedlist {
    //Single most important class - The "box"
    static class Node{
        int data;
        Node next;
        //Constructor::Creates a box with data
        Node(int data){
            this.data = data;
            this.next = null;//New box points nowhere initially
        }
    }
    Node head;//Point to FIRST box in chain
    public   Linkedlist(){
        head  = null;//Empty chain
    }

    public   void insertHead(int data){
//        Step 1: create new node
        Node newNode = new Node(data);//[data|null]
//        Step 2: Make newNode print to current head
        newNode.next = head; //[data-->old_data]
//        Step 3: Move head to new node
        head = newNode; //Head--->newNode
    }

    public static void main(String[] args) {
        Node list = new Node(10);
        System.out.println(list.data);
        Linkedlist li = new Linkedlist();
        li.insertHead(39);
        li.insertHead(33);
//        System.out.println(li.data);



    }
}
