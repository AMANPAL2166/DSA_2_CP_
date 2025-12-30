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
    public Linkedlist(){
        head  = null;//Empty chain
    }

    public static void main(String[] args) {
        Node list = new Node(10);
        System.out.println(list.data);

    }
}
