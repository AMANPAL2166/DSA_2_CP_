package LinkedList.Easy_Problems;

public class MiddleOfLinkedlist {
    static class Node{
        int data ;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }

    }
    static int getMiddel(Node head) {
        //to get middle of the element, we need to find length of linkedlist
        Node curr = head;
        int lengthof_linkedlist = 0;
        while( curr != null){
            lengthof_linkedlist++;
            curr = curr.next;
        }
        int mid = lengthof_linkedlist/2;
        while(mid>0){
            head = head.next;
            mid--;

        }
        return head.data;
    }

    public static void main(String[] args) {
        Node head = new  Node(35);
        head.next = new  Node(15);
        head.next.next = new  Node(4);
        head.next.next.next = new  Node(20);
        System.out.println(getMiddel(head));
    }
}
