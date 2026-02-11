package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoSortedLinkedList {
    //First method use naive approach
    static class Node {
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    static Node sortMerge(Node head1, Node head2){
        //use arrayList to store node data of the lists
        ArrayList<Integer> arr  = new ArrayList<>();
        //pushing the value of first linkedlist
        while(head1 != null){
            arr.add(head1.data);
            head1 = head1.next;
        }
        //Pushing the value of second head
        while(head2 != null){
            arr.add(head2.data);
            head2 = head2.next;
        }
        /// Sorting the list
        Collections.sort(arr);
        //Creating a new list with sorted values
        Node dummy = new Node(-1);
        Node curr = dummy;
        for(int i = 0; i<arr.size(); i++){
            curr.next = new Node(arr.get(i));
            curr = curr.next;
        }
        return dummy.next;


    }
    static void Print(Node curr){
        Node temp = curr;
        while(temp != null){
            System.out.print (temp.data);
            if(temp.next != null ){
                System.out.print ("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    static Node sortedMerge(Node head1, Node head2){
        //create a dummy node to simplify the process
        Node dummy = new Node(-1);
        Node curr = dummy;
        //Iterate through both linkedlist
        while(head1 != null && head2 != null){
            //Add the smaller node to the first list
            if(head1.data  <= head2.data){
                curr.next = head1;
                head1 = head1.next;
            }else{
                curr.next  = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        //If any list is left, append it to
        //the merged list
        if(head1 != null ){
            curr.next = head1;
        }else{
            curr.next  = head2;
        }
        //return the merged list starting form the next dummy node

        return  dummy.next;
    }
    public static void main(String[] args) {

        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node res = sortedMerge(head1, head2);
        Print(res);
    }
}
