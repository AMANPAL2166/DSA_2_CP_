package LinkedList;

public class CircularLinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }

    }
    static void returnNode(Node head){
        //check if list is empty
        if(head == null) {
            return;
        }
        Node curr = head;
        do{
            System.out.println(curr.data+"");
            curr = curr.next;
        }while(curr != head);

         System.out.println();



    }

    public static void main(String[] args) {
        // Create a hard-coded linked list
        // 11 -> 2 -> 56 -> 12
        Node head = new Node(11);
        head.next = new Node(2);
        head.next.next = new Node(56);
        head.next.next.next = new Node(12);

        head.next.next.next.next = head;

        returnNode(head);
    }
}
