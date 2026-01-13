package LinkedList.Basics;

public class Doubly_Linkedlist {
    static class Node{
        int data;//to store the value
        Node prev;//reference to the previous node
        Node next;//reference to the next node
        //constructor
        Node(int d){
            data = d;
            prev = next = null;
        }

    }

    public static void main(String[] args) {
        //Create the first node (head of the list)
        Node list = new Node(10);
        //Create and link the second node
        list.next = new Node(11);
        list.next.prev = list;
        //Create and link the third node
        list.next.next = new Node(12);
        list.next.next.prev = list;

        //Traverse the list forward and print the elements
        Node temp = list;
        while(temp != null){
            System.out.print (temp.data);
            if(temp.next != null){
                System.out.print ("<->");
            }temp = temp.next;
        }

    }
}
