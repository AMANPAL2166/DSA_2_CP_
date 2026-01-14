package LinkedList.Operations;

import Fundamental.Object_and_memory;

public class LengthOfLinkedlist {
    static class Node{
        int data;
        Node next;
        //constructure
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    public static int FindLength(Node head){
        //initialize with count
        int count = 0;
        //Initialize curr with head of linkedlist
        Node curr = head;
        //tarversal till we reach the null
        while (curr != null){
            //increment count by 1
            count++;
            //move pointer to next node
            curr = curr.next;
        }
        //return count
        return count;
    }

    public static int FindLength2(Node head){
        //Recursive method
        //base case
        if(head == null){
            return 0;
        }
        return 1+ FindLength2(head.next);
    }
    public static void main(String[] args) {
        Node list = new Node(1);
        list.next   = new Node(2);
        list.next.next= new Node(3);
        list.next .next.next  = new Node(4);
        list.next .next.next.next = new Node(5);
        list.next.next.next.next.next  = new Node(6);

        //function call to count the number of nodes
        System.out.println("count of node is " + FindLength2(list));
        //print node
        Node temp = list;
        while(temp != null){
            System.out.print (temp.data);
            if(temp.next != null) {
                System.out.print ("<->");
            }
            temp = temp.next;

        }


    }
}
