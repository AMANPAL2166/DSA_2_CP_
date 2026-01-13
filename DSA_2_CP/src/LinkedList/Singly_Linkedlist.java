package LinkedList;

public class Singly_Linkedlist {
    static class Node {
        int data;
        Node next;

        // constructor to initialize a new node with data
        Node(int new_data) {
            this.data = new_data;
            this.next = null;
        }
    }


        public  static void main(String[] args) {
            // Create the first node (head of the list)
            Node head = new Node(10);
            //link the second node
            head.next = new Node(11);
//          link the third node
            head.next.next = new Node(19);
            //link the fourth node
            head.next.next.next= new Node(99);
            System.out.println(head);

            //print linkedlist till null
        while(head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }


    }
}
