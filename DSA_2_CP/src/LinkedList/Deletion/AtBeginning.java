package LinkedList.Deletion;

public class AtBeginning {
    static class Node {
        int data;
        Node next;
        //constructor
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    public static Node DeleteAtBeginnig(Node head){
        if(head == null){        //check if list is empty
            return null;
        }
        //Store the current head in a temp variable
        Node temp  =  head;
        //Move head to the next pointer
        head = head.next;
        //Free the memory of old head
        temp = null;
        return head;
    }
    //Print linkedlist
    public static void Print(Node head) {
        Node curr  = head;
        while(curr != null){
            System.out.print (curr.data);
            if(curr.next != null){
                System.out.print ("<->");
            }
            //update curr
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        Node NewList = new Node(3);
        NewList.next = new Node(4);
        NewList.next.next = new Node(5);
        NewList.next.next.next = new Node(6);
        NewList = DeleteAtBeginnig(NewList);
        Print(NewList);


    }


}
