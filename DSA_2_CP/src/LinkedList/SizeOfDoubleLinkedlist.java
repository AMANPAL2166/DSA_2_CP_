package LinkedList;

public class SizeOfDoubleLinkedlist {
    static  class Node{
        int data;
        Node next;
        Node prev;
        Node(int new_data){
            this.data = new_data;
            this.next = null;
            this.prev = null;
        }
        static  int size(Node head){
            int size = 0;
            while(head != null){
                size++;
                head = head.next;
            }
            return size;
        }
        //Recursive function
        static int size2(Node curr){
            //base case
            if(curr ==null){
                return 0;
            }
            return 1+size2(curr.next);
        }
        public static void main(String[] args) {
            // Create a hard-coded doubly linked list:
            // 1 <-> 2 <-> 3 <-> 4
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.prev = head;
            head.next.next = new Node(3);
            head.next.next.prev = head.next;
            head.next.next.next = new Node(4);
            head.next.next.next.prev = head.next.next;

            System.out.println( "Iterative function: " +size(head));
            System.out.println("Recursive function: "+ size2(head));
        }

    }
}
