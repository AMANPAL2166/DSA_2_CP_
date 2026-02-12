package LinkedList;

import java.util.HashSet;

public class removeDuplicatesInLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    public static Node removeDuplicates(Node head) {
        // Your code here
        Node curr1 = head;
        while(curr1 != null){
            Node curr2  = curr1;
            //Traverse the remaining node to find duplicates
            while(curr2.next != null){
                //check if the node has the same data as current node
                if(curr2.next.data == curr1.data){
                    //duplicates found remove it
                    curr2.next = curr2.next.next;
                }else{
                    curr2 = curr2.next;
                }

            }
            //Move to the next node in the list
            curr1 = curr1.next;
        }
        return head;

    }
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node removeDuplicates2(Node head) {
        // Your code here
        Node curr = head;
        Node prev = null;
        HashSet<Integer> check = new HashSet<>();
        while(curr != null){
            //check list data
            if(check.contains(curr.data)){
                //found duplicates remove it
                prev.next = curr.next;
            }else{
                check.add(curr.data);
                //update previous node
                prev = curr;
            }
            //update curr
            curr = curr.next;

        }



        return head;

    }
    public static void main(String[] args) {

        // Create a singly linked list:
        // 12 -> 11 -> 12 -> 21 -> 41 -> 43 -> 21
        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(41);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(21);

        head = removeDuplicates2(head);
        printList(head);
    }
}
