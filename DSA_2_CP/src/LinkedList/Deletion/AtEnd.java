package LinkedList.Deletion;


import LinkedList.Operations.PrintLinkedlist;

public class AtEnd {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    public static Node DeleteAtEnd(Node head){
        //check, if list is empty
        if(head ==null){
            return head;
        }
        //If list has only one node
        if(head.next == null){
            return null;
        }
        // Find the second last node
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Delete the last node by making
        // secondLast point to null
        secondLast.next = null;

        return head;
    }
    public static void main(String[] args) {
        // Creating a static linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Removing the last node
        head = DeleteAtEnd(head);
        printList(head);


    }
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

}
